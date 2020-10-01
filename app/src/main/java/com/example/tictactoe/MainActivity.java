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

    // initialisation
    private void init() {
        ecouteBouton();
    }

    // attend les clics et écrit dans les boutons
    private void ecouteBouton() {
        ArrayList<Button> listeBoutons = new ArrayList<>();

        listeBoutons.add(( findViewById(R.id.button)));
        listeBoutons.add(( findViewById(R.id.button2)));
        listeBoutons.add(( findViewById(R.id.button3)));
        listeBoutons.add(( findViewById(R.id.button4)));
        listeBoutons.add(( findViewById(R.id.button5)));
        listeBoutons.add(( findViewById(R.id.button6)));
        listeBoutons.add(( findViewById(R.id.button7)));
        listeBoutons.add(( findViewById(R.id.button8)));
        listeBoutons.add(( findViewById(R.id.button9)));
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

                    finDePartie();
                    gagnant();
                }
            });
        }

    }

    // Prend le tour actuel et le change au prochain tour.
    private String tourJoueur() {
        if (turn.equals("X") || turn.equals("")) {
            turn = "O";
            return "X";
        } else {
            turn = "X";
            return "O";
        }
    } // détermine tour du joueur et change le nom du prochain

    // Prend un bouton en paramètre et retourne vrai ou faux s'il est activé ou non.
    private boolean testBouton(Button btn) {
        return !btn.isEnabled();
    }

    // Fin de partie si l'ensemble des boutons a été utilisé, retourne true (partie finie) ou false.
    private void finDePartie() {
        if (testBouton(((Button) findViewById(R.id.button))) && testBouton(((Button) findViewById(R.id.button2))) && testBouton(((Button) findViewById(R.id.button3))) && testBouton(((Button) findViewById(R.id.button4))) && testBouton(((Button) findViewById(R.id.button5))) && testBouton(((Button) findViewById(R.id.button6))) && testBouton(((Button) findViewById(R.id.button7))) && testBouton(((Button) findViewById(R.id.button8))) && testBouton(((Button) findViewById(R.id.button9)))) {
            Toast.makeText(MainActivity.this,"Fin", Toast.LENGTH_SHORT).show();
        }
    }

    // Détermination du gagnant avec analyse du plateau, retourne le gagnant.
    private void gagnant() {

        // XXX
        // ???
        // ???

        if ((( findViewById(R.id.button)).getText().equals("X")) && (((Button) findViewById(R.id.button2)).getText().equals("X")) && (((Button) findViewById(R.id.button3)).getText().equals("X")) || (((Button) findViewById(R.id.button)).getText().equals("O")) && (((Button) findViewById(R.id.button2)).getText().equals("O")) && (((Button) findViewById(R.id.button3)).getText().equals("O"))) {
            if ((( findViewById(R.id.button)).getText().equals("X"))) {
                Toast.makeText(MainActivity.this,"X a gagné", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(MainActivity.this,"O a gagné", Toast.LENGTH_SHORT).show();
            }
            disableButtons();
        }

        // X??
        // ?X?
        // ??X

        else if (((( findViewById(R.id.button)).getText().equals("X")) && (((Button) findViewById(R.id.button5)).getText().equals("X")) && (((Button) findViewById(R.id.button9)).getText().equals("X"))) || ((((Button) findViewById(R.id.button)).getText().equals("O")) && (((Button) findViewById(R.id.button5)).getText().equals("O")) && (((Button) findViewById(R.id.button9)).getText().equals("O")))) {
            if ((((Button) findViewById(R.id.button)).getText().equals("X"))) {
                Toast.makeText(MainActivity.this,"X a gagné", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(MainActivity.this,"O a gagné", Toast.LENGTH_SHORT).show();
            }
            disableButtons();
        }

        /*
            X??
            X??
            X??
        */

        else if (((((Button) findViewById(R.id.button)).getText().equals("X")) && (((Button) findViewById(R.id.button4)).getText().equals("X")) && (((Button) findViewById(R.id.button7)).getText().equals("X"))) || ((((Button) findViewById(R.id.button)).getText().equals("O")) && (((Button) findViewById(R.id.button4)).getText().equals("O")) && (((Button) findViewById(R.id.button7)).getText().equals("O")))) {
            if ((((Button) findViewById(R.id.button)).getText().equals("X"))) {
                Toast.makeText(MainActivity.this,"X a gagné", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(MainActivity.this,"O a gagné", Toast.LENGTH_SHORT).show();
            }
            disableButtons();
        }

        /*
            ???
            XXX
            ???
        */

        else if (((( findViewById(R.id.button4)).getText().equals("X")) && (((Button) findViewById(R.id.button5)).getText().equals("X")) && (((Button) findViewById(R.id.button6)).getText().equals("X"))) || ((((Button) findViewById(R.id.button4)).getText().equals("O")) && (((Button) findViewById(R.id.button5)).getText().equals("O")) && (((Button) findViewById(R.id.button6)).getText().equals("O")))) {
            if ((((Button) findViewById(R.id.button4)).getText().equals("X"))) {
                Toast.makeText(MainActivity.this,"X a gagné", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(MainActivity.this,"O a gagné", Toast.LENGTH_SHORT).show();
            }
            disableButtons();
        }

        /*
            ?X?
            ?X?
            ?X?
        */

        else if (((( findViewById(R.id.button2)).getText().equals("X")) && (((Button) findViewById(R.id.button5)).getText().equals("X")) && (((Button) findViewById(R.id.button8)).getText().equals("X"))) || ((((Button) findViewById(R.id.button2)).getText().equals("O")) && (((Button) findViewById(R.id.button5)).getText().equals("O")) && (((Button) findViewById(R.id.button8)).getText().equals("O")))) {
            if ((((Button) findViewById(R.id.button2)).getText().equals("X"))) {
                Toast.makeText(MainActivity.this,"X a gagné", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(MainActivity.this,"O a gagné", Toast.LENGTH_SHORT).show();
            }
            disableButtons();
        }

        /*
            ??X
            ??X
            ??X
        */

        else if (((( findViewById(R.id.button3)).getText().equals("X")) && (((Button) findViewById(R.id.button6)).getText().equals("X")) && (((Button) findViewById(R.id.button9)).getText().equals("X"))) || ((((Button) findViewById(R.id.button3)).getText().equals("O")) && (((Button) findViewById(R.id.button6)).getText().equals("O")) && (((Button) findViewById(R.id.button9)).getText().equals("O")))) {
            if ((((Button) findViewById(R.id.button3)).getText().equals("X"))) {
                Toast.makeText(MainActivity.this,"X a gagné", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(MainActivity.this,"O a gagné", Toast.LENGTH_SHORT).show();
            }
            disableButtons();
        }

        /*
            ??X
            ?X?
            X??
        */

        else if (((( findViewById(R.id.button3)).getText().equals("X")) && (((Button) findViewById(R.id.button5)).getText().equals("X")) && (((Button) findViewById(R.id.button7)).getText().equals("X"))) || ((((Button) findViewById(R.id.button3)).getText().equals("O")) && (((Button) findViewById(R.id.button5)).getText().equals("O")) && (((Button) findViewById(R.id.button7)).getText().equals("O")))) {
            if ((((Button) findViewById(R.id.button3)).getText().equals("X"))) {
                Toast.makeText(MainActivity.this,"X a gagné", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(MainActivity.this,"O a gagné", Toast.LENGTH_SHORT).show();
            }
            disableButtons();
        }

        /*
            ???
            ???
            XXX
        */

        else if (((( findViewById(R.id.button7)).getText().equals("X")) && (((Button) findViewById(R.id.button8)).getText().equals("X")) && (((Button) findViewById(R.id.button9)).getText().equals("X"))) || ((((Button) findViewById(R.id.button7)).getText().equals("O")) && (((Button) findViewById(R.id.button8)).getText().equals("O")) && (((Button) findViewById(R.id.button9)).getText().equals("O")))) {
            if ((((Button) findViewById(R.id.button7)).getText().equals("X"))) {
                Toast.makeText(MainActivity.this,"X a gagné", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(MainActivity.this,"O a gagné", Toast.LENGTH_SHORT).show();
            }
            disableButtons();
        }

    }

    private void disableButtons() {
        findViewById(R.id.button).setEnabled(false);
        findViewById(R.id.button2).setEnabled(false);
        findViewById(R.id.button3).setEnabled(false);
        findViewById(R.id.button4).setEnabled(false);
        findViewById(R.id.button5).setEnabled(false);
        findViewById(R.id.button6).setEnabled(false);
        findViewById(R.id.button7).setEnabled(false);
        findViewById(R.id.button8).setEnabled(false);
        findViewById(R.id.button9).setEnabled(false);
    }
}
