package com.example.anupraje.balajipipeordermanagmentsystem.fragment;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.anupraje.balajipipeordermanagmentsystem.NewOrdersAdapter;
import com.example.anupraje.balajipipeordermanagmentsystem.NewOrdersItem;
import com.example.anupraje.balajipipeordermanagmentsystem.R;
import com.example.anupraje.balajipipeordermanagmentsystem.RecyclerTouchListener;

import java.util.ArrayList;
import java.util.List;

public class NewOrdersFragments extends Fragment {

   private List<NewOrdersItem> newOrderslist;
    private RecyclerView recordrecyclerView3;
    private NewOrdersAdapter newOrdersAdapter;

   // final ArrayList<NewOrdersItem> newOrdersItems = NewOrdersItem.getTestingList();

    public NewOrdersFragments() {
        // Required empty public constructor
    }

    public static NewOrdersFragments newInstance(String param1, String param2) {
        NewOrdersFragments fragment = new NewOrdersFragments();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_new_order, container, false);

        recordrecyclerView3 = (RecyclerView)view.findViewById(R.id.recycler_view3);
        newOrderslist=new ArrayList<>();
        newOrdersAdapter = new NewOrdersAdapter(this,newOrderslist);
        RecyclerView.LayoutManager mLayoutManager3 = new LinearLayoutManager(getContext());
        recordrecyclerView3.setLayoutManager(mLayoutManager3);
        recordrecyclerView3.setItemAnimator(new DefaultItemAnimator());
        recordrecyclerView3.setAdapter(newOrdersAdapter);
        prepareMovieData();
        recordrecyclerView3.addOnItemTouchListener(new RecyclerTouchListener(view.getContext(), recordrecyclerView3, new RecyclerTouchListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                NewOrdersItem items=newOrderslist.get(position);
                Toast.makeText(view.getContext(), items.getOrder_customer_name() + ""+items.getOrdernumber(), Toast.LENGTH_SHORT).show();

                LayoutInflater inflater = getLayoutInflater();
                View alertLayout = inflater.inflate(R.layout.fragment_order_details, null);


                AlertDialog.Builder alert = new AlertDialog.Builder(getContext());

                // this is set the view from XML inside AlertDialog
                alert.setView(alertLayout);
                // disallow cancel of AlertDialog on click of back button and outside touch
                alert.setCancelable(false);
                alert.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getContext(), "Cancel clicked", Toast.LENGTH_SHORT).show();
                    }
                });

                alert.setPositiveButton("Done", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                AlertDialog dialog = alert.create();
                dialog.show();




            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));

        return view;
    }
    public void prepareMovieData(){

        NewOrdersItem newOrdersItem = new NewOrdersItem("101", "50000.00", "10-2-18", "8-2-18","Anup Dabadgavakar", "Ganesh Nagar Old Ausa Road,Latur", "D76GTYH768","9665664645");
        newOrderslist.add(newOrdersItem);
        newOrdersItem = new NewOrdersItem("102", "50000.00", "10-2-18", "8-2-18","Pravin Biradar", "Ganesh Nagar Old Ausa Road,Latur", "D76GTYH768","9665664645");
        newOrderslist.add(newOrdersItem);
        newOrdersItem = new NewOrdersItem("103", "50000.00", "10-2-18", "8-2-18","Sushilkumar Mule", "Ganesh Nagar Old Ausa Road,Latur", "D76GTYH768","9665664645");
        newOrderslist.add(newOrdersItem);
        newOrdersItem = new NewOrdersItem("104", "50000.00", "10-2-18", "8-2-18","Priyanka jedhe", "Ganesh Nagar Old Ausa Road,Latur", "D76GTYH768","9665664645");
        newOrderslist.add(newOrdersItem);
        newOrdersItem = new NewOrdersItem("105", "50000.00", "10-2-18", "8-2-18","Anand Dabadavakar", "Ganesh Nagar Old Ausa Road,Latur", "D76GTYH768","9665664645");
        newOrderslist.add(newOrdersItem);

    }
}
