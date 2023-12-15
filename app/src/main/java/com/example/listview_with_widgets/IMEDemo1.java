package com.example.listview_with_widgets;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.Calendar;

public class IMEDemo1 extends Fragment {

    private EditText dateEditText;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_i_m_e_demo1, container, false);

        dateEditText = rootView.findViewById(R.id.dateEditText);

        dateEditText.setOnClickListener(v -> showDatePickerDialog());

        return rootView;
    }

    private void showDatePickerDialog() {
        final Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog datePickerDialog = new DatePickerDialog(requireContext(),
                (datePicker, selectedYear, selectedMonth, selectedDay) -> {
                    // Maneja la fecha seleccionada aquí como prefieras
                    String selectedDate = selectedDay + "/" + (selectedMonth + 1) + "/" + selectedYear;
                    dateEditText.setText(selectedDate);
                }, year, month, dayOfMonth);

        datePickerDialog.show();
    }
}
