package com.example.listview_with_widgets;

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

        String[] elementos = {"Horas", "CheckBox", "RadioGroup", "Linear Percent", "URL", "OverLap", "ScrollView", "IMEDEMO1","ListView","Alert Dialog"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(requireContext(), android.R.layout.simple_list_item_1, elementos);

        myListView.setAdapter(adapter);

        myListView.setOnItemClickListener((parent, view1, position, id) -> {
            Fragment fragment = null;

            switch (position) {
                case 0:
                    fragment = new Hours();
                    break;
                case 1:
                    fragment = new CheckBoxs();
                    break;
                case 2:
                    fragment = new RadioGroups();
                    break;
                case 3:
                    fragment = new LinearPercent();
                    break;
                case 4:
                    fragment = new URL();
                    break;
                case 5:
                    fragment = new OverLap();
                    break;
                case 6:
                    fragment = new ScrollView();
                    break;
                case 7:
                    fragment = new IMEDemo1();
                    break;
                case 8:
                    fragment = new ListViewDemo();
                    break;
                case 9:
                    fragment = new AlertDialogDemo();
                    break;
                default:
                    break;
            }

            if (fragment != null) {
                getParentFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, fragment)
                        .addToBackStack(null)
                        .commit();
            }
        });
    }
}