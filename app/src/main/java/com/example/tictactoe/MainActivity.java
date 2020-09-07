package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {

    }

    private void ecouteBouton(Button btn) {
        btn.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v) {

            }
        });
    }

    private String winner(String gg) {
        String gagnant = "Joueur" + gg + "a gagné !";
        return gagnant;
    }
}
