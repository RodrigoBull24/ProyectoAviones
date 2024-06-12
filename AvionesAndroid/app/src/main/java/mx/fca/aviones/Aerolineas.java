package mx.fca.aviones;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Aerolineas {

    public static ArrayList<Avion> AEROMEXICO() {
        ArrayList<Avion> aviones = new ArrayList<>();
        aviones.add(new Avion(Direccion.EAST, 0, 0));
        aviones.add(new Avion(Direccion.WEST, 2, 0));
        aviones.add(new Avion(Direccion.NORTH, 1, 1));
        aviones.add(new Avion(Direccion.SOUTH, 1, 3));
        return aviones;
    }

    public static int encontrarMaxX(ArrayList<Avion> aviones) {
        int maxX = Integer.MIN_VALUE;
        for (Avion avion : aviones) {
            if (avion.getX() > maxX) {
                maxX = avion.getX();
            }
        }
        return maxX;
    }

    public static int encontrarMaxY(ArrayList<Avion> aviones) {
        int maxY = Integer.MIN_VALUE;
        for (Avion avion : aviones) {
            if (avion.getY() > maxY) {
                maxY = avion.getY();
            }
        }
        return maxY;
    }

    public static void main(String[] args) {
        ArrayList<Avion> aviones = AEROMEXICO();
        int maxX = encontrarMaxX(aviones);
        int maxY = encontrarMaxY(aviones);
        System.out.println("Max X: " + maxX);
        System.out.println("Max Y: " + maxY);
    }
}