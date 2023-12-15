package com.example.listview_with_widgets;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

public class RadioGroups extends Fragment implements RadioGroup.OnCheckedChangeListener {
    RadioGroup orientation;
    RadioGroup gravity;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_radio_groups, container, false);

        orientation = view.findViewById(R.id.orientation);
        orientation.setOnCheckedChangeListener(this);
        gravity = view.findViewById(R.id.gravity);
        gravity.setOnCheckedChangeListener(this);

        return view;
    }


    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        if (checkedId == R.id.horizontal) {
            orientation.setOrientation(LinearLayout.HORIZONTAL);
        } else if (checkedId == R.id.vertical) {
            orientation.setOrientation(LinearLayout.VERTICAL);
        } else if (checkedId == R.id.left) {
            gravity.setGravity(Gravity.LEFT);
        } else if (checkedId == R.id.center) {
            gravity.setGravity(Gravity.CENTER_HORIZONTAL);
        } else if (checkedId == R.id.right) {
            gravity.setGravity(Gravity.RIGHT);
        }
    }
}