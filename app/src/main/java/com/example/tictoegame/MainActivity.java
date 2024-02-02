package com.example.tictoegame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9,Reset;
TextView x,y;
    String b1, b2, b3, b4, b5, b6, b7, b8, b9;
    int flag = 0;
    int count = 0;
    int m=1;
    int n=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

    }

    private void init() {
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        Reset = findViewById(R.id.Reset);
        x =findViewById(R.id.x);
        y =findViewById(R.id.y);
    }

    public void check(View view) {
        Button btncurrent = (Button) view;
        //m=1;
        //n=1;
        if (btncurrent.getText().toString()=="") {
            count++;

            if (flag == 0) {

                btncurrent.setText("X");
                flag = 1;
            } else {
                btncurrent.setText("O");
                flag = 0;
            }
            if (count > 4) {
                b1 = btn1.getText().toString();
                b2 = btn2.getText().toString();
                b3 = btn3.getText().toString();
                b4 = btn4.getText().toString();
                b5 = btn5.getText().toString();
                b6 = btn6.getText().toString();
                b7 = btn7.getText().toString();
                b8 = btn8.getText().toString();
                b9 = btn9.getText().toString();

                if (b1.equals(b2) && b2.equals(b3) && !b1.equals("")) {
                    Toast.makeText(this, "Winner is: " + b1+" ", Toast.LENGTH_SHORT).show();
                    if(b1.equals("X")) {
                        x.setText("X wins: "+ m++);
                    } if(b1.equals("O")){
                        y.setText("O wins: "+ n++);
                    }
                    Reset2(btncurrent);


                } else if (b4.equals(b5) && b5.equals(b6) && !b4.equals("")) {
                    Toast.makeText(this, "Winner is: " + b4+" ", Toast.LENGTH_SHORT).show();
                    if(b4.equals("X")) {
                        x.setText("Player X wins: "+ m++);
                    } if(b4.equals("O")){
                        y.setText("Player O wins: "+ n++);
                    }
                    Reset2(btncurrent);

                } else if (b7.equals(b8) && b8.equals(b9) && !b7.equals("")) {
                    Toast.makeText(this, "Winner is: " + b7+" ", Toast.LENGTH_SHORT).show();
                    if(b7.equals("X")) {
                        x.setText("Player X wins: "+ m++);
                    } if(b7.equals("O")){
                        y.setText("Player O wins: "+ n++);
                    }
                    Reset2(btncurrent);

                } else if (b1.equals(b5) && b5.equals(b9) && !b1.equals("")) {
                    Toast.makeText(this, "Winner is: " + b1+" ", Toast.LENGTH_SHORT).show();
                    if(b1.equals("X")) {
                        x.setText("Player X wins: "+ m++);
                    } if(b1.equals("O")){
                        y.setText("Player O wins: "+ n++);
                    }
                    Reset2(btncurrent);

                } else if (b3.equals(b5) && b5.equals(b7) && !b3.equals("")) {
                    Toast.makeText(this, "Winner is: " + b3+" ", Toast.LENGTH_SHORT).show();
                    if(b3.equals("X")) {
                        x.setText("Player X wins: "+ m++);
                    } if(b3.equals("O")){
                        y.setText("Player O wins: "+ n++);
                    }
                    Reset2(btncurrent);

                } else if (b1.equals(b4) && b4.equals(b7) && !b1.equals("")) {
                    Toast.makeText(this, "Winner is: " + b1+" ", Toast.LENGTH_SHORT).show();
                    if(b1.equals("X")) {
                        x.setText("Player X wins: "+ m++);
                    } if(b1.equals("O")){
                        y.setText("Player O wins: "+ n++);
                    }
                    Reset2(btncurrent);

                } else if (b2.equals(b5) && b5.equals(b8) && !b2.equals("")) {
                    Toast.makeText(this, "Winner is " + b2+" ", Toast.LENGTH_SHORT).show();
                    if(b2.equals("X")) {
                        x.setText("Player X wins: "+ m++);
                    } if(b2.equals("O")){
                        y.setText("Player O wins: "+ n++);
                    }
                    Reset2(btncurrent);

                } else if (b3.equals(b6) && b6.equals(b9) && !b3.equals("")) {
                    Toast.makeText(this, "Winner is " + b3+" ", Toast.LENGTH_SHORT).show();
                    if(b3.equals("X")) {
                        x.setText("Player X wins: "+ m++);
                    } if(b3.equals("O")){
                        y.setText("Player O wins: "+ n++);
                    }
                    Reset2(btncurrent);

                } else if (count == 9) {
                    Toast.makeText(this, " Draw ", Toast.LENGTH_LONG).show();
                    Reset2(btncurrent);
                }
            }
        }
    }
    public void Reset(View md){
        Toast.makeText(this, "Reset! "+"Enjoy", Toast.LENGTH_SHORT).show();
        x.setText("");
        y.setText("");
        m=1;
        n=1;
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        count = 0;
        flag = 0;
    }
    public void Reset2(View md){
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        count = 0;
        flag = 0;
    }
}