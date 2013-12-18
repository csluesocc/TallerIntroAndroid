package com.example.comunidad;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	//Creamos un objeto de tipo TextView para poder
	//controlar la vista desde JAVA
	private TextView saludo;
	private Button siguiente;
    @Override
    //Este es un método que se ejecuta al cargar
    //la aplicación.
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Esta propiedad nos sirve para decirle a Java
        //que el contenido será lo que se encuentra en
        //activity_main que es un XML en la carpeta Layout.
        setContentView(R.layout.activity_main);
        //Buscamos los elementos por identificador
        saludo = (TextView) findViewById(R.id.saludo);
        saludo.setText("Saludos GNU/Linux");
        siguiente = (Button) findViewById(R.id.button1);
    }
    //Método para invocar otros componentes
    public void pulsaSiguiente (View view){
    	//Un intent sirve para invocar otros componentes
    	//en este caso, una nueva Activity
    	Intent i = new Intent(this, otra_activity.class);
    	startActivity(i);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
