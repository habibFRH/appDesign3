package com.example.exo2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Référence aux éléments de l'interface utilisateur
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        textView = findViewById(R.id.textView);

        // Configuration des écouteurs de clic pour les boutons
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateTextAndShowToast("Button 1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateTextAndShowToast("Button 2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateTextAndShowToast("Button 3");
            }
        });
    }

    private void updateTextAndShowToast(String buttonName) {
        // Met à jour le texte du TextView
        textView.setText("Button clicked: " + buttonName);

        // Affiche une notification Toast
        Toast.makeText(this, "Button clicked: " + buttonName, Toast.LENGTH_SHORT).show();
    }

    // Méthode onClick définie dans le fichier XML pour tous les boutons
    public void onButtonClick(View view) {
        Button clickedButton = (Button) view;
        updateTextAndShowToast(clickedButton.getText().toString());
    }
}