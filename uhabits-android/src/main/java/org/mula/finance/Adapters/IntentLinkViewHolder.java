package org.mula.finance.Adapters;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;

import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder;

import org.mula.finance.Models.IntentLink;
import org.mula.finance.R;

public class IntentLinkViewHolder extends GroupViewHolder {
    private TextView mTextView;
    private View view;

    public IntentLinkViewHolder(View itemView){
        super(itemView);
        view = itemView;

        mTextView = itemView.findViewById(R.id.text_calculator);
    }

    public void bind(IntentLink intentLink) {
        mTextView.setText(intentLink.getLinkName());

        Drawable icon = view.getResources().getDrawable(intentLink.getLinkDrawable());
        view.setBackground(icon);
        icon.mutate();
        view.getBackground().setColorFilter(intentLink.getLinkColourTint(), PorterDuff.Mode.OVERLAY);
    }

}
