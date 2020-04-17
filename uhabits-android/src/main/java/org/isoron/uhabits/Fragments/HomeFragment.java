package org.isoron.uhabits.Fragments;

import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.github.mikephil.charting.charts.CandleStickChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.CandleData;
import com.github.mikephil.charting.data.CandleDataSet;
import com.github.mikephil.charting.data.CandleEntry;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.isoron.uhabits.Models.Company;
import org.isoron.uhabits.Models.DailyPrice;
import org.isoron.uhabits.R;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Integer;
import java.util.Collection;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {

    private View view;
    private CandleStickChart candleStickChart;
    private Company company;

    private Button refreshButton;

    private ArrayList<CandleEntry> yValsCandleStick;




    public HomeFragment() {
        // Required empty public constructor
    }


    public static HomeFragment newInstance() {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_home, container, false);

        candleStickChart = view.findViewById(R.id.candle_stick_chart);
        refreshButton = view.findViewById(R.id.button_refresh);
        refreshButton.setText("Refresh");

        yValsCandleStick = new ArrayList<CandleEntry>();

        candleStickChart.setHighlightPerDragEnabled(true);
        candleStickChart.setDrawBorders(true);

        candleStickChart.setBorderColor(getResources().getColor(android.R.color.holo_blue_dark));
        YAxis yAxis = candleStickChart.getAxisLeft();
        YAxis rightAxis = candleStickChart.getAxisRight();
        yAxis.setDrawGridLines(false);
        rightAxis.setDrawGridLines(false);
        candleStickChart.requestDisallowInterceptTouchEvent(true);

        XAxis xAxis = candleStickChart.getXAxis();

        xAxis.setDrawGridLines(false);// disable x axis grid lines
        xAxis.setDrawLabels(true);
        xAxis.setTextColor(Color.BLACK);
        rightAxis.setTextColor(Color.BLACK);
        yAxis.setDrawLabels(true);
        xAxis.setGranularity(1f);
        xAxis.setGranularityEnabled(true);
        xAxis.setAvoidFirstLastClipping(true);

        Legend l = candleStickChart.getLegend();
        l.setEnabled(false);



        getStockPricesOnline();


        refreshButton.setOnClickListener(v -> getStockPricesOnline());


        return view;
    }



    //get stocks from api, to input into candlestick chart
    private void getStockPricesOnline(){
        String url = "https://www.alphavantage.co/query?function=TIME_SERIES_INTRADAY&outputsize=compact&symbol=IBM&interval=60min&apikey=FD82S5VDRDGNB16U";


        Response.Listener<String> responseListener = response -> {

            GsonBuilder gsonBuilder = new GsonBuilder();
            Gson gson = gsonBuilder.create();
            String jsonString = response;


            Company company = gson.fromJson(jsonString, Company.class);
            Collection<DailyPrice> values = company.getCompanyStockPrices().values();
            System.out.println(company.getCompanyStockPrices().keySet());
            ArrayList<DailyPrice> dailyPrices = new ArrayList<DailyPrice>(values);

            int size = dailyPrices.size();
            for(int i = 0; i < size; i++) {
                DailyPrice dailyPrice = dailyPrices.get(i);
                float j = (float) i;
                CandleEntry candleEntry = new CandleEntry(j,
                        Float.parseFloat(dailyPrice.getDailyHigh()),
                        Float.parseFloat(dailyPrice.getDailyLow()),
                        Float.parseFloat(dailyPrice.getDailyOpen()),
                        Float.parseFloat(dailyPrice.getDailyClose()));
                yValsCandleStick.add(candleEntry);
            }


            CandleDataSet set1 = new CandleDataSet(yValsCandleStick, "DataSet 1");
            set1.setColor(Color.rgb(80, 80, 80));
            set1.setShadowColor(getResources().getColor(android.R.color.darker_gray));
            set1.setDecreasingColor(getResources().getColor(android.R.color.holo_red_light));
            set1.setDecreasingPaintStyle(Paint.Style.FILL);
            set1.setIncreasingColor(getResources().getColor(android.R.color.background_light));
            set1.setIncreasingPaintStyle(Paint.Style.FILL);
            set1.setNeutralColor(Color.LTGRAY);
            set1.setDrawValues(false);



            // create a data object with the datasets
            CandleData data = new CandleData(set1);


            // set data
            candleStickChart.setData(data);
            candleStickChart.invalidate();
            candleStickChart.setVisibleXRangeMaximum(7);
            candleStickChart.moveViewToX(yValsCandleStick.size());

        };

        Response.ErrorListener errorListener = new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                System.out.println("The request failed.");
            }
        };

        RequestQueue requestQueue = Volley.newRequestQueue(view.getContext());
        StringRequest stringRequest =
                new StringRequest(Request.Method.GET, url, responseListener, errorListener);
        requestQueue.add(stringRequest);

    }


}

