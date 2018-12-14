package com.example.anupraje.balajipipeordermanagmentsystem;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.example.anupraje.balajipipeordermanagmentsystem.fragment.NewOrdersFragments;

import java.util.List;

public class NewOrdersAdapter extends RecyclerView.Adapter<NewOrdersAdapter.MyViewHolder> {
    NewOrdersItem neworder;
    private List<NewOrdersItem> newOrdersItems;
    Context mContext;

    public class MyViewHolder extends RecyclerView.ViewHolder {
       final public TextView ordernumber, order_title_price, order_dispatch_date, order_date, order_customer_name, order_address, order_customer_gst_no, order_customer_mo_no;
        FrameLayout frame3;

        public MyViewHolder(final View view) {
            super(view);
            ordernumber = (TextView) view.findViewById(R.id.ordernumber);
            order_title_price = (TextView) view.findViewById(R.id.order_title_price);
            order_dispatch_date = (TextView) view.findViewById(R.id.order_dispatch_date);
            order_date = (TextView) view.findViewById(R.id.order_date);
            order_customer_name = (TextView) view.findViewById(R.id.order_customer_name);
            order_address = (TextView) view.findViewById(R.id.order_address);
            order_customer_gst_no = (TextView) view.findViewById(R.id.order_customer_gst_no);
            order_customer_mo_no = (TextView) view.findViewById(R.id.order_customer_mo_no);
            frame3 = (FrameLayout) view.findViewById(R.id.frame3);


        }
    }

    public NewOrdersAdapter(NewOrdersFragments mContext, List<NewOrdersItem> newOrdersItems) {
        this.newOrdersItems = newOrdersItems;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.new_order_item_row, parent, false);


        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(NewOrdersAdapter.MyViewHolder holder3, final int position) {
        neworder = newOrdersItems.get(position);
        holder3.ordernumber.setText(neworder.getOrdernumber());
        holder3.order_title_price.setText(neworder.getOrder_title_price());
        holder3.order_dispatch_date.setText(neworder.getOrder_dispatch_date());
        holder3.order_date.setText(neworder.getOrder_date());
        holder3.order_customer_name.setText(neworder.getOrder_customer_name());
        holder3.order_address.setText(neworder.getOrder_address());
        holder3.order_customer_gst_no.setText(neworder.getOrder_customer_gst_no());
        holder3.order_customer_mo_no.setText(neworder.getOrder_customer_mo_no());



    }

    @Override
    public int getItemCount() {
        return newOrdersItems.size();
    }


}