package com.example.anupraje.balajipipeordermanagmentsystem.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.anupraje.balajipipeordermanagmentsystem.ItemAdapter;
import com.example.anupraje.balajipipeordermanagmentsystem.Items;
import com.example.anupraje.balajipipeordermanagmentsystem.R;
import com.example.anupraje.balajipipeordermanagmentsystem.Records;
import com.example.anupraje.balajipipeordermanagmentsystem.RecordsAdapter;

import java.util.ArrayList;
import java.util.List;


public class AllRecordsFragment extends Fragment {
    private List<Records> recordList = new ArrayList<>();
    private RecyclerView recordrecyclerView;
    private RecordsAdapter recordsAdapter;

    public AllRecordsFragment() {

    }

    public static AllRecordsFragment newInstance(String param1, String param2) {
        AllRecordsFragment fragment = new AllRecordsFragment();
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

        recordrecyclerView = (RecyclerView)view.findViewById(R.id.recycler_view);

        recordsAdapter = new RecordsAdapter(recordList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        recordrecyclerView.setLayoutManager(mLayoutManager);
        recordrecyclerView.setItemAnimator(new DefaultItemAnimator());
        recordrecyclerView.setAdapter(recordsAdapter);

        prepareMovieData();

        return view;
    }
    private void prepareMovieData() {
        Records records = new Records("Product List");
        recordList.add(records);

        records = new Records("Receiver List");
        recordList.add(records);

        records = new Records("Sales Manager List");
        recordList.add(records);

        records = new Records("Customer List");
        recordList.add(records);

        recordsAdapter.notifyDataSetChanged();
    }
}