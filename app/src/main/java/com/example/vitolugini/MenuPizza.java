package com.example.vitolugini;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MenuPizza extends AppCompatActivity {
    TextView cantidad;
    TextView cantidad2;
    TextView cantidad3;
    TextView cantidadtotal;
    Button aumentar1, aumentar2, aumentar3, disminuir1, disminuir2, disminuir3, calcular;
    int valorPizza1 = 0;
    int valorPizza2 = 0;
    int valorPizza3 = 0;

    private static int valor1 =0;
    private static int valor2 =0;
    private static int valor3 =0;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_pizza);
        cantidad =(TextView) findViewById(R.id.txtcantidad);
        cantidad2 =(TextView) findViewById(R.id.txtcantidad2);
        cantidad3 =(TextView) findViewById(R.id.txtcantidad3);
        cantidadtotal =(TextView) findViewById(R.id.txtcantidadtotal);
        aumentar1 =(Button) findViewById(R.id.btnaumntar);
        aumentar2 =(Button) findViewById(R.id.btnaumntar2);
        aumentar3 =(Button) findViewById(R.id.btnaumntar3);
        disminuir1=(Button) findViewById(R.id.btndisminuir);
        disminuir2=(Button) findViewById(R.id.btndisminuir2);
        disminuir3=(Button) findViewById(R.id.btndisminuir3);
        calcular = (Button) findViewById(R.id.btncalcular);

        aumentar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    valorPizza1 = valorPizza1 + 120;
                    cantidad.setText(String.valueOf("Cantidad: " + ++valor1 + " \n" + "Total: $" + valorPizza1));
            }
        });
        disminuir1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valorPizza1 = valorPizza1 - 120;
                cantidad.setText(String.valueOf("Cantidad: " + --valor1 + " \n" + "Total: $" + valorPizza1));
            }
        });

        aumentar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valorPizza2 = valorPizza2 + 140;
                cantidad2.setText(String.valueOf("Cantidad: " + ++valor2 + " \n" + "Total: $" + valorPizza2));
            }
        });
        disminuir2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valorPizza2 = valorPizza2 - 140;
                cantidad2.setText(String.valueOf("Cantidad: " + --valor2 + " \n" + "Total: $" + valorPizza2));
            }
        });

        aumentar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valorPizza3 = valorPizza3 + 140;
                cantidad3.setText(String.valueOf("Cantidad: " + ++valor3 + " \n" + "Total: $" + valorPizza3));
            }
        });
        disminuir3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valorPizza3 = valorPizza3 - 140;
                cantidad3.setText(String.valueOf("Cantidad: " + --valor3 + " \n" + "Total: $" + valorPizza3));
            }
        });

        calcular.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View v) {

                   int val1 = valorPizza1;
                   int val2 = valorPizza2;
                   int val3 = valorPizza3;
                   String resultPrint = "";

                       //int result = val1 + val2;
                       resultPrint += val1 + val2 + val3;

               cantidadtotal.setText(String.valueOf("$" + resultPrint));


               //valorPizza3 = valorPizza3 + valorPizza1;
               //cantidadtotal.setText(String.valueOf("Pizza 1: " + valorPizza3));
            }
       });





    }

    public void Anterior (View view){
        Intent anterior = new Intent(this, MainActivity.class);
        startActivity(anterior);

    }
}