package controller;

import model.Carrera;
import model.Coche;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class CarreraController {
    private Carrera carrera;
    private Random random;

    public CarreraController(Carrera carrera){
        this.carrera = carrera;
        this.random = new Random();
    }

    public void empezarCarrera(){

        carrera.resetCarrera();
        Collections.shuffle(carrera.getCorredores());

        boolean carreraAcabada = false;

        while (!carreraAcabada){
            for (Coche coche : carrera.getCorredores()){
                int vueltaKm = random.nextInt(31) + 20;
                int vueltaTiempo = random.nextInt(5) + 20;

                coche.sumarTiempoUltV(vueltaTiempo);
                coche.sumarKm(vueltaKm);

                if (coche.getKm() >= carrera.getTotalKm()){
                    carreraAcabada = true;
                    coche.restarTiempo(25);
                    break;
                }
            }
        }
    }

    public void verResultadosKm(){

        ArrayList<Coche> resultados = carrera.getCorredores();
        resultados.sort(Comparator.comparingInt(Coche::getKm).reversed().thenComparingInt(Coche::getTiempoUltV));

        System.out.println("--- Resultados ---");

        int limite = Math.min(3, carrera.getCorredores().size());

        for (int i = 0; i < limite; i++) {
            Coche coche = carrera.getCorredores().get(i);
            System.out.println((i+1) + "º -> " + coche.getInfo());
        }
    }
    public void addPuntos(){

        ArrayList<Coche> resultados = carrera.getCorredores();
        resultados.sort(Comparator.comparingInt(Coche::getKm).reversed());

        for (int i = 0; i < 3; i++) {
            resultados.get(i).sumarPuntos(10-(i*2));
        }

        resultados.sort(Comparator.comparingInt(Coche::getPuntos).reversed().thenComparingInt(Coche::getTiempoUltV));
    }
    public void verResultadoPuntos(){
        System.out.println("--- Resultados ---");

        int limite = Math.min(3, carrera.getCorredores().size());

        for (int i = 0; i < limite; i++) {
            Coche coche = carrera.getCorredores().get(i);
            System.out.println((i+1) + "º -> " + coche.getInfoAll());
        }
    }
}
