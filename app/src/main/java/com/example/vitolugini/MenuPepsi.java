package com.example.vitolugini;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MenuPepsi extends AppCompatActivity {
    TextView cantidadpepsi, cantidadpepsilight, cantidadpepsikick, cantidadmirinda, cantidad7up, cantidadmanzanita, cantidadtotal;
    Button aumentarPepsi, aumentarPepsiLight, aumentarPepsiKick,aumentar1, aumentar2, aumentar3;
    Button disminuirPepsi, disminuirPepsiLight, disminuirPepsiKick, disminuir1, disminuir2, disminuir3;
    Button calcular;
    int valorPepsi = 0;
    int valorPepsiLight = 0;
    int valorPepsiKick = 0;
    int valorMirinda = 0;
    int valor7Up = 0;
    int valorManzanita = 0;

    private static int valor1 =0;
    private static int valor2 =0;
    private static int valor3 =0;
    private static int valor4 =0;
    private static int valor5 =0;
    private static int valor6 =0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_pepsi);

        cantidadpepsi = (TextView) findViewById(R.id.txtcantidadpepsi);
        cantidadpepsilight =(TextView) findViewById(R.id.txtcantidadpepsilight);
        cantidadpepsikick = (TextView) findViewById(R.id.txtcantidadpepsikick);
        cantidadmirinda = (TextView) findViewById(R.id.txtcantidadmirinda);
        cantidad7up = (TextView) findViewById(R.id.txtcantidad7up);
        cantidadmanzanita = (TextView) findViewById(R.id.txtcantidadmanzanita);
        cantidadtotal = (TextView) findViewById(R.id.txtcantidadtotal);

        disminuirPepsi =(Button) findViewById(R.id.btndisminuirpepsi);
        disminuirPepsiLight =(Button) findViewById(R.id.btndisminuirpepsilight);
        disminuirPepsiKick =(Button) findViewById(R.id.btndisminuirpepsikic);

        disminuir1=(Button) findViewById(R.id.btndisminuirmirinda);
        disminuir2=(Button) findViewById(R.id.btndisminuir7up);
        disminuir3=(Button) findViewById(R.id.btndisminuirmanzanita);


        aumentarPepsi =(Button)findViewById(R.id.btnaumntarpepsi);
        aumentarPepsiLight =(Button)findViewById(R.id.btnaumntarpepsilight);
        aumentarPepsiKick =(Button)findViewById(R.id.btnaumntarpepsikick);

        aumentar1 =(Button) findViewById(R.id.btnaumntarmirinda);
        aumentar2 =(Button) findViewById(R.id.btnaumntar7up);
        aumentar3 =(Button) findViewById(R.id.btnaumntarmanzanita);

        calcular = (Button) findViewById(R.id.btncalcular);



        aumentarPepsi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valorPepsi = valorPepsi + 14;
                cantidadpepsi.setText(String.valueOf("Cantidad: " + ++valor1 + " \n" + "Total: $" + valorPepsi));
            }
        });
        disminuirPepsi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valorPepsi = valorPepsi - 14;
                cantidadpepsi.setText(String.valueOf("Cantidad: " + --valor1 + " \n" + "Total: $" + valorPepsi));
            }
        });

        aumentarPepsiLight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valorPepsiLight = valorPepsiLight + 14;
                cantidadpepsilight.setText(String.valueOf("Cantidad: " + ++valor2 + " \n" + "Total: $" + valorPepsiLight));
            }
        });
        disminuirPepsiLight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valorPepsiLight = valorPepsiLight - 14;
                cantidadpepsilight.setText(String.valueOf("Cantidad: " + --valor2 + " \n" + "Total: $" + valorPepsiLight));
            }
        });

        aumentarPepsiKick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valorPepsiKick = valorPepsiKick + 14;
                cantidadpepsikick.setText(String.valueOf("Cantidad: " + ++valor3 + " \n" + "Total: $" + valorPepsiKick));
            }
        });
        disminuirPepsiKick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valorPepsiKick = valorPepsiKick - 14;
                cantidadpepsikick.setText(String.valueOf("Cantidad: " + --valor3 + " \n" + "Total: $" + valorPepsiKick));
            }
        });


        aumentar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valorMirinda = valorMirinda + 12;
                cantidadmirinda.setText(String.valueOf("Cantidad: " + ++valor4 + " \n" + "Total: $" + valorMirinda));
            }
        });
        disminuir1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valorMirinda = valorMirinda - 12;
                cantidadmirinda.setText(String.valueOf("Cantidad: " + --valor4 + " \n" + "Total: $" + valorMirinda));
            }
        });

        aumentar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valor7Up  = valor7Up  + 12;
                cantidad7up.setText(String.valueOf("Cantidad: " + ++valor5 + " \n" + "Total: $" + valor7Up));
            }
        });
        disminuir2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valor7Up  = valor7Up  - 12;
                cantidad7up.setText(String.valueOf("Cantidad: " + --valor5 + " \n" + "Total: $" + valor7Up ));
            }
        });

        aumentar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valorManzanita = valorManzanita + 12;
                cantidadmanzanita.setText(String.valueOf("Cantidad: " + ++valor6 + " \n" + "Total: $" + valorManzanita));
            }
        });
        disminuir3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valorManzanita = valorManzanita - 12;
                cantidadmanzanita.setText(String.valueOf("Cantidad: " + --valor6 + " \n" + "Total: $" + valorManzanita));
            }
        });

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int val1 = valorMirinda;
                int val2 = valor7Up;
                int val3 = valorManzanita;
                int var4 = valorPepsi;
                int var5 = valorPepsiLight;
                int var6 = valorPepsiKick;
                String resultPrint = "";

                //int result = val1 + val2;
                resultPrint += val1 + val2 + val3 + var4 + var5 + var6;

                cantidadtotal.setText(String.valueOf("$" + resultPrint));


                //valorPizza3 = valorPizza3 + valorPizza1;
                //cantidadtotal.setText(String.valueOf("Pizza 1: " + valorPizza3));
            }
        });



    }
}