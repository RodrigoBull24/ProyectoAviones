package mx.fca.aviones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Analizador {

    static HashMap<Integer, Plano> memoria = new HashMap<>();

    public static Plano inicializa(Plano plano) {
        memoria.put(0, plano);
        return plano;
    }

    public static Plano next(int noPaso, Plano plano){
        if (memoria.containsKey(noPaso)){
            return memoria.get(noPaso);
        } else {
            Plano planoNuevo;
            ArrayList<Avion> nuevosAviones = new ArrayList<>();

            // Calcular colision aquí:
            ArrayList<Colision> colisiones = new ArrayList<>();

            //Csambiar nombres de variables

            // Cuantas colisiones hay en este plano ?

            ///// AQUIIIIII SE HACE EL CALCULO DE LAS COLISION


            // Esta calculando la sig. iteracion
            // (0,0,>), (2,0,<) NO PASO = 0
            // NO PASO = 1 + 1 COLISION EN DONDE? ((1,0,>), (1,0,<) )



            // Mapa para almacenar las posiciones y detectar colisiones
            HashMap<String, Avion> posiciones = new HashMap<>();
            Set<Avion> avionesColisionados = new HashSet<>();


            for (Avion avion: plano.aviones) {
                // Calcular movimiento
                switch (avion.direccion){
                    case NORTH:
                        avion.y = avion.y - 1;
                        break;
                    case SOUTH:
                        avion.y = avion.y + 1;
                        break;
                    case EAST:
                        avion.x = avion.x + 1;
                        break;
                    case WEST:
                        avion.x = avion.x - 1;
                        break;
                }
                nuevosAviones.add(avion);
            }

            Avion aviones = null;
            String posicion = aviones.x + "," + aviones.y;

            // Verificar colisiones
            if (posiciones.containsKey(posicion)) {
                // Si ya existe una avion en esta posición, es una colisión
                Avion avionColisionado = posiciones.get(posicion);
                colisiones.add(new Colision(avionColisionado, aviones));
                avionesColisionados.add(avionColisionado);
                avionesColisionados.add(aviones);
            } else {
                posiciones.put(posicion, aviones);
            }

            // Eliminar aviones que han colisionado
            for (Avion avion : plano.aviones) {
                if (!avionesColisionados.contains(avion)) {
                    nuevosAviones.add(avion);
                }
            }

            planoNuevo = new Plano(noPaso, nuevosAviones);
            planoNuevo = new Plano(noPaso, nuevosAviones, colisiones);
            memoria.put(noPaso, planoNuevo);
            return planoNuevo;
        }
    }

    public static Plano prev(int noPaso) {
        return memoria.get(noPaso);
    }
}
