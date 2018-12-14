package com.example.anupraje.balajipipeordermanagmentsystem;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import java.util.List;

public class RecordsAdapter extends RecyclerView.Adapter<RecordsAdapter.MyViewHolder> {

private List<Records> recordsList;

public class MyViewHolder extends RecyclerView.ViewHolder {
    public TextView title2;
    FrameLayout frame2;
    public MyViewHolder(View view) {
        super(view);
        title2 = (TextView) view.findViewById(R.id.title2);
        frame2=(FrameLayout)view.findViewById(R.id.frame2);
    }
}


    public RecordsAdapter(List<Records> recordsList) {
        this.recordsList = recordsList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.record_item_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder2, int position) {
        Records records = recordsList.get(position);
        holder2.title2.setText(records.getTitle());

        holder2.frame2.setBackgroundResource(R.drawable.secproduvt);

        if (position == 0){
            holder2.frame2.setBackgroundResource(R.drawable.secproduvt);

            // holder.hoteltext1.setBackgroundResource(Color.parseColor("ffffff"));
        }else if(position == 1){

            holder2.frame2.setBackgroundResource(R.drawable.secreceiver);
            // holder.hoteltext1.setBackgroundColor(Color.parseColor("#00000000"));
        }else if(position == 2) {

            holder2.frame2.setBackgroundResource(R.drawable.secsalesmanager);
        }else if(position == 3) {

            holder2.frame2.setBackgroundResource(R.drawable.seccustomer);

        }
    }


    @Override
    public int getItemCount() {
        return recordsList.size();
    }
}