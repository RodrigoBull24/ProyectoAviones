package mx.fca.aviones;

import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    Button btnNext;
    Plano plano;
    RecyclerView listaAviones;
    PlanoAdapter adapter;

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaAviones = findViewById(R.id.listaAviones);
        btnNext = findViewById(R.id.btnNext);
        plano =  Planificador.crearRutaInicial();
        adapter = new PlanoAdapter(plano.aviones);
        listaAviones.setAdapter(adapter);
        // Aqui tienes que poner cuantas columnas
        listaAviones.setLayoutManager(new GridLayoutManager(this, 5));

        btnNext.setOnClickListener(v -> {
            plano = plano.next();
            adapter.notifyDataSetChanged();
        });

        // Aqui te falta btnBack
        /*
        btnBack.setOnClickListener(v -> {
            plano = plano.back();
            adapter.notifyDataSetChanged();
        });

         */

        // Aqui te falta reset
        /*
        btnReset.setOnClickListener(v -> {
            plano = plano.reset();
            adapter.notifyDataSetChanged();
        });
         */
    }
}