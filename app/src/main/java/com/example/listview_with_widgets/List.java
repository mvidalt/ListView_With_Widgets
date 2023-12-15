package com.example.listview_with_widgets;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class List extends Fragment {

    public List() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_list, container, false);
        return view;
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ListView myListView = view.findViewById(R.id.myListView);

        String[] elementos = {"Horas", "CheckBox", "RadioGroup","Linear Percent","URL"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(requireContext(), android.R.layout.simple_list_item_1, elementos);

        myListView.setAdapter(adapter);

        myListView.setOnItemClickListener((parent, view1, position, id) -> {
            if (position == 0) {
                Fragment fragmentHours = new Hours();
                getParentFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, fragmentHours)
                        .addToBackStack(null)
                        .commit();
            }
            if (position == 1) {
                Fragment fragmentCheckbox = new CheckBoxs();
                getParentFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, fragmentCheckbox)
                        .addToBackStack(null)
                        .commit();
            }
            if (position == 2) {
                Fragment fragmentRadioGroups = new RadioGroups();
                getParentFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, fragmentRadioGroups)
                        .addToBackStack(null)
                        .commit();
            }
            if (position == 3) {
                Fragment fragmentLinearPercent = new LinearPercent();
                getParentFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, fragmentLinearPercent)
                        .addToBackStack(null)
                        .commit();
            }
            if (position == 4) {
                Fragment fragmentLinearPercent = new URL();
                getParentFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, fragmentLinearPercent)
                        .addToBackStack(null)
                        .commit();
            }
        });
    }
}