package com.example.exercicio4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.*;

public class MainActivity extends AppCompatActivity {

    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                EditText nascimento = findViewById(R.id.nascimento);
                EditText atual = findViewById(R.id.atual);
                TextView idade = findViewById(R.id.idade);
                TextView idade2050 = findViewById(R.id.idade2050);

                Integer anos = Integer.parseInt(atual.getText().toString()) - Integer.parseInt(nascimento.getText().toString());
                Integer anos2050 = 2050 - Integer.parseInt(nascimento.getText().toString());
                //   Toast.makeText(MainActivity.this, "Nome não inserido", LENGTH_SHORT).show();
                idade.setText("Tem " + anos + " anos de idade");
                idade2050.setText("Em 2050 você terá " + anos2050 + " anos!");


            }
        });
    }
}
