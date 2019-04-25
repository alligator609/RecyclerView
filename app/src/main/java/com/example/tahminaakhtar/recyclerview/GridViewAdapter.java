package com.example.tahminaakhtar.recyclerview;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Tahmina Akhtar on 2/22/2018.
 */

public class GridViewAdapter extends RecyclerView.Adapter<GridViewAdapter.ViewHoldermy> {
    private List<RecyclerViewItem> items;
    private Activity activity;

    public GridViewAdapter(Activity activity, List<RecyclerViewItem> items) {
        this.activity = activity;
        this.items = items;
    }
    @Override
    public ViewHoldermy onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        LayoutInflater inflater = activity.getLayoutInflater();
        View view = inflater.inflate(R.layout.item_grid, viewGroup, false);
        return new ViewHoldermy(view);}
    @Override
    public void onBindViewHolder(GridViewAdapter.ViewHoldermy viewHolder, int position) {
        viewHolder.imageView.setImageResource(items.get(position).getDrawableID());
        viewHolder.textView.setText(items.get(position).getName());
        viewHolder.text2View.setText(items.get(position).getModelNo());
    }
    @Override
    public int getItemCount() {
        return items.size();}

    /**
     * View holder to display each RecylerView item
     */
    protected class ViewHoldermy extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView textView;
        private TextView text2View;

        public ViewHoldermy(View view) {
            super(view);
            textView = (TextView)view.findViewById(R.id.text);
            text2View = (TextView)view.findViewById(R.id.text2);
            imageView = (ImageView) view.findViewById(R.id.image);
        }
    }
}
