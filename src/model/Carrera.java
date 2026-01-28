package model;

import java.util.ArrayList;

public class Carrera {

    private ArrayList<Coche> corredores;
    private int totalKm;

    public Carrera(int totalKm){
        this.totalKm = totalKm;
        this.corredores = new ArrayList<>();
    }


    public void addCoche(Coche coche){
        corredores.add(coche);
    }

    public ArrayList<Coche> getCorredores(){
        return corredores;
    }

    public int getTotalKm(){
        return totalKm;
    }

    public void resetCarrera(){
        for (Coche coche : corredores){
            coche.resetKm();
            coche.resetTiempo();
        }
    }


}
