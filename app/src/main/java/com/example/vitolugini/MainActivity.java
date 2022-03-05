package com.example.vitolugini;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText user;
    Button iniciar, salir;
    String nombre="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Inicializar nuestros elementos
        user=(EditText) findViewById(R.id.eiduser);
        iniciar=(Button) findViewById(R.id.btninicio);
        salir=(Button) findViewById(R.id.btncancelar);



        iniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Este bloque se ejecuta al dar click en el boton iniciar
                Intent intent = new Intent(getApplicationContext(), Menu.class);
                startActivity(intent);
                Log.i("ERROR4", "Hiciste click en el boton iniciar");
                nombre=user.getText().toString();
                intent.putExtra("NombreUser", nombre);
                //Toast.makeText(getApplicationContext(), "Bienvenid@" +nombre, Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }
        });



        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Bloque que se ejecuta
                Toast.makeText(getApplicationContext(), "By Ibrahin Canto Almeida\n" + "Curso de Titulación Lic. en Informatica", Toast.LENGTH_LONG).show();
                Log.i("ERROR1", "Diste click en salir");
                finish();
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });









    }
}