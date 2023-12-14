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

        // Datos a mostrar en el ListView
        String[] elementos = {"Horas"};

        // Crear un adaptador para el ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<>(requireContext(), android.R.layout.simple_list_item_1, elementos);

        // Establecer el adaptador en el ListView
        myListView.setAdapter(adapter);

        // Manejar el clic en un elemento del ListView
        myListView.setOnItemClickListener((parent, view1, position, id) -> {
            if (position == 0) { // Si se hace clic en "Horas" (posición 0)
                // Ir al fragment_hours.xml al hacer clic en "Horas"
                Fragment fragment = new Hours(); // Reemplaza HoursFragment con el nombre de tu fragmento Hours
                getParentFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, fragment)
                        .addToBackStack(null)
                        .commit();
            }
        });
    }


}