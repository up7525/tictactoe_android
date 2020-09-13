package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    String turn = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        ecouteBouton(); // attend les clics et écrit dans les boutons
    }

    public void ecouteBouton() { // attend les clics et écrit dans les boutons
        ArrayList<Button> listeBoutons = new ArrayList<>();

        listeBoutons.add(((Button) findViewById(R.id.button)));
        listeBoutons.add(((Button) findViewById(R.id.button2)));
        listeBoutons.add(((Button) findViewById(R.id.button3)));
        listeBoutons.add(((Button) findViewById(R.id.button4)));
        listeBoutons.add(((Button) findViewById(R.id.button5)));
        listeBoutons.add(((Button) findViewById(R.id.button6)));
        listeBoutons.add(((Button) findViewById(R.id.button7)));
        listeBoutons.add(((Button) findViewById(R.id.button8)));
        listeBoutons.add(((Button) findViewById(R.id.button9)));

        for (final Button value : listeBoutons) {
            value.setOnClickListener(new Button.OnClickListener(){
                public void onClick(View v) {
                    value.setText(tourJoueur());
                    value.setEnabled(false);

                    if (value.getText() == "X" || value.getText() == "") {
                        value.setTextColor(Color.BLUE);
                    } else {
                        value.setTextColor(Color.RED);
                    }
                }
            });
        }

    }

    private String tourJoueur() {
        if (turn.equals("X") || turn.equals("")) {
            turn = "O";
            return "X";
        } else {
            turn = "X";
            return "O";
        }
    } // détermine tour du joueur et change le nom du prochain

    private void finDePartie() { // Détermination des cas qui engendrent une fin de partie

    }
}
