package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

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
        ecouteBouton();
    }

    private void ecouteBouton() {
        ArrayList<Button> listeBoutons = new ArrayList<Button>();

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
                    value.setTextColor(Color.BLUE);
                    value.setText("X");
                }
            });
        }

    }

    private String winner(String gg) {
        String gagnant = "Joueur" + gg + "a gagné !";
        return gagnant;
    }
}
