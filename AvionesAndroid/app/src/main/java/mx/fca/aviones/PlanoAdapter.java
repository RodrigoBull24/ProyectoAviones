package mx.fca.aviones;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PlanoAdapter extends RecyclerView.Adapter<PlanoHolder> {

    ArrayList<Avion> plano;

    public PlanoAdapter(ArrayList<Avion> plano) {
        this.plano = plano;
    }

    @NonNull
    @Override
    public PlanoHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.avion_view, parent, false);
        return new PlanoHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PlanoHolder holder, int position) {

        /*
        Aqui va el mapeo.

        Position se va ejecutar el no. de elementos
        Ejemplo:
        Primer avion: (0,0,v)
        Segundo avion: (5,5,<)

        Aqui deberas hacer la logica de presentacion

        Si la posicion = 0,
        Avion avion = plano.get(x, y);
        if (tiene un avion en x, y) {
           holder.imgCuadro.setImageResource(avion.getImage());
        } else if (colisionExiste) {
            // Verificar si existe una colision
               holder.imgCuadro.setImageResource(R.mipmap.colision);
            }
        } else {
                  holder.imgCuadro.setImageResource(0);
                  holder.imgCuadro.setBackground(Color.white)
        }
         */
    }

    @Override
    public int getItemCount() {
        // Aqui tendras que regresar la cantidad de cuadros
        /* Ejemplo:
        Primer avion: (0,0,v)
        Segundo avion: (5,5,<)
        Return: 6*6
         */
        return 36;//aviones.size();
    }
}

//Cuantoa aviones hay que mostrar