package org.mula.finance.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.thoughtbot.expandablerecyclerview.ExpandableRecyclerViewAdapter;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;
import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;
import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder;

import org.mula.finance.Models.Category;
import org.mula.finance.Models.IntentLink;
import org.mula.finance.R;

import java.util.List;

public class CategoryAdapter extends ExpandableRecyclerViewAdapter<IntentLinkViewHolder, CategoryViewHolder> {

    public CategoryAdapter(List<? extends ExpandableGroup> groups) {
        super(groups);
    }


    @Override
    public IntentLinkViewHolder onCreateGroupViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.chunk_calculator,parent, false);
        return new IntentLinkViewHolder(v);
    }

    @Override
    public CategoryViewHolder onCreateChildViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.chunk_category,parent, false);
        return new CategoryViewHolder(v);
    }

    @Override
    public void onBindChildViewHolder(CategoryViewHolder holder, int flatPosition, ExpandableGroup group, int childIndex) {
        final Category category = (Category) group.getItems().get(childIndex);
        holder.bind(category);

        holder.view.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Context c = view.getContext();
                Intent intent = category.getCategoryIntent();
                intent.putExtra("Difficulty", category.getCategory());
                c.startActivity(intent);
            }
        });
        holder.bind(category);

    }

    @Override
    public void onBindGroupViewHolder(IntentLinkViewHolder holder, int flatPosition, ExpandableGroup group) {
        final IntentLink intentLink = (IntentLink) group;
        holder.bind(intentLink);

    }
}
