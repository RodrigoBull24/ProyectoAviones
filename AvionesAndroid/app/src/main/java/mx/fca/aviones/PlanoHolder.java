package mx.fca.aviones;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PlanoHolder extends RecyclerView.ViewHolder {
    ImageView imgCuadro;
    public PlanoHolder(@NonNull View itemView) {
        super(itemView);
        imgCuadro = itemView.findViewById(R.id.imgAvion);
    }
}
