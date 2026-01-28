package controller;

import model.Coche;
import java.util.ArrayList;

public class CocheController {

    private ArrayList<Coche> coches;

    public CocheController(){
        coches = new ArrayList<>();
    }

    public void crearCoche(String marca, String modelo){
        Coche coche = new Coche(marca, modelo);
        coche.setPiloto(cantidadCoches()+1);
        coches.add(coche);
    }

    public void listarCoches1(){
        for (Coche coche : coches){
            System.out.println(coche.getInfoPil());
        }
    }
    public void listarCoches2(){
        for (Coche coche : coches){
            System.out.println(coche.getInfoAll());
        }
    }

    public int cantidadCoches(){
         return coches.size();
    }

    public Coche getCoche(int index){
        return coches.get(index);
    }

    public void resetPuntos(){
        for (Coche coche : coches){
            coche.resetPuntos();
        }
    }

}
