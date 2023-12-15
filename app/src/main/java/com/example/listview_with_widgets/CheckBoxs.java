package com.example.listview_with_widgets;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import androidx.fragment.app.Fragment;

public class CheckBoxs extends Fragment implements CompoundButton.OnCheckedChangeListener {

    CheckBox cb;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_check_box, container, false);

        cb = view.findViewById(R.id.check);
        cb.setOnCheckedChangeListener(this);

        return view;
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (isChecked) {
            cb.setText("This checkbox is: checked");
        } else {
            cb.setText("This checkbox is: unchecked");
        }
    }
}
