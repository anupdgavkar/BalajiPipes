package com.example.anupraje.balajipipeordermanagmentsystem;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.MyViewHolder> {

private List<Items> itemsList;

public class MyViewHolder extends RecyclerView.ViewHolder {
    public TextView title;
    FrameLayout frame;
    public MyViewHolder(View view) {
        super(view);
        title = (TextView) view.findViewById(R.id.title1);
         frame=(FrameLayout)view.findViewById(R.id.frame);
}
}


    public ItemAdapter(List<Items> moviesList) {
        this.itemsList = moviesList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.store_item_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Items items = itemsList.get(position);

        holder.title.setText(items.getTitle());
        holder.frame.setBackgroundResource(R.drawable.productt);

        if (position == 0){
            holder.frame.setBackgroundResource(R.drawable.productt);

            // holder.hoteltext1.setBackgroundResource(Color.parseColor("ffffff"));
        }else if(position == 1){

            holder.frame.setBackgroundResource(R.drawable.receiverr);
            // holder.hoteltext1.setBackgroundColor(Color.parseColor("#00000000"));
        }else if(position == 2) {

            holder.frame.setBackgroundResource(R.drawable.sales);
        }else if(position == 3) {

            holder.frame.setBackgroundResource(R.drawable.customerr);

        }
    }


    @Override
    public int getItemCount() {
        return itemsList.size();
    }
}