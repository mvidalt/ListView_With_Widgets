package com.example.listview_with_widgets;

import android.app.AlertDialog;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;

public class URL extends Fragment {

    public URL() {
        // Constructor vacío requerido
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_u_r_l, container, false);

        EditText editText = view.findViewById(R.id.entry);
        editText.setText("https://www.google.com"); // URL predeterminada

        Button okButton = view.findViewById(R.id.ok);
        okButton.setOnClickListener(v -> {
            String url = editText.getText().toString();

            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));

            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
            builder.setTitle("Abrir con...");

            // Agregar opciones manualmente al diálogo
            builder.setPositiveButton("Chrome", (dialog, which) -> {
                intent.setPackage("com.android.chrome");
                startActivity(intent);
            });

            builder.setNegativeButton("Navegador por defecto", (dialog, which) -> {
                intent.setPackage(null);
                startActivity(intent);
            });

            builder.setNeutralButton("Cancelar", (dialog, which) -> dialog.dismiss());

            builder.create().show();
        });

        return view;
    }



}
