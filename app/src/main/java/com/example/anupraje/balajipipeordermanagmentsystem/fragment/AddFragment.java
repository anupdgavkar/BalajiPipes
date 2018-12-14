package com.example.anupraje.balajipipeordermanagmentsystem.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


import com.example.anupraje.balajipipeordermanagmentsystem.Activity.AddCustomer;
import com.example.anupraje.balajipipeordermanagmentsystem.Activity.AddProduct;
import com.example.anupraje.balajipipeordermanagmentsystem.Activity.AddReceiver;
import com.example.anupraje.balajipipeordermanagmentsystem.Activity.AddSalesManagaer;
import com.example.anupraje.balajipipeordermanagmentsystem.ItemAdapter;
import com.example.anupraje.balajipipeordermanagmentsystem.Items;
import com.example.anupraje.balajipipeordermanagmentsystem.R;
import com.example.anupraje.balajipipeordermanagmentsystem.RecyclerTouchListener;

public class AddFragment extends Fragment {

    private List<Items> itemsList = new ArrayList<>();
    private RecyclerView recyclerView;
    private ItemAdapter mAdapter;
    FragmentTransaction transaction;
    Intent intent;


    public AddFragment() {
        // Required empty public constructor
    }

    public static AddFragment newInstance(String param1, String param2) {
        AddFragment fragment = new AddFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_store, container, false);

        recyclerView = (RecyclerView)view.findViewById(R.id.recycler_view);

        mAdapter = new ItemAdapter(itemsList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        prepareMovieData();
        recyclerView.addOnItemTouchListener(new RecyclerTouchListener(view.getContext(), recyclerView, new RecyclerTouchListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                Items items=itemsList.get(position);


                if(items.getTitle().equals("Add Product")){
                    intent=new Intent(getContext(),AddProduct.class);
                    startActivity(intent);
                }else if(items.getTitle().equals("Add Receiver")){
                    intent=new Intent(getContext(),AddReceiver.class);
                    startActivity(intent);
                }else if(items.getTitle().equals("Add Sales Manager")){
                    intent=new Intent(getContext(),AddSalesManagaer.class);
                    startActivity(intent);
                }else if(items.getTitle().equals("Add Customer")){
                    intent=new Intent(getContext(),AddCustomer.class);
                    startActivity(intent);
                }


            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));

        return view;
    }


    private void prepareMovieData() {
        Items items = new Items("Add Product");
        itemsList.add(items);

        items = new Items("Add Receiver");
        itemsList.add(items);

        items = new Items("Add Sales Manager");
        itemsList.add(items);

        items = new Items("Add Customer");
        itemsList.add(items);

        mAdapter.notifyDataSetChanged();
    }
    }


