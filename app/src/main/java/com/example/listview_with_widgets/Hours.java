package com.example.listview_with_widgets;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import java.util.Date;

public class Hours extends Fragment implements View.OnClickListener {
    Button btn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_hours, container, false);

        btn = view.findViewById(R.id.button);
        btn.setOnClickListener(this);
        updateTime();

        return view;
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.button) {
            updateTime();
        }
    }

    private void updateTime() {
        if (btn != null) {
            btn.setText(new Date().toString());
        }
    }
}
