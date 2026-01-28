package model;

public class Coche {

    private String marca;
    private String modelo;
    private int km;
    private int puntos;
    private int piloto;
    private int tiempoUltV;

    public Coche(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
        this.km = 0;
        this.puntos = 0;
        this.piloto = 0;
        this.tiempoUltV = 0;
    }

    public void sumarKm(int km){
        this.km += km;
    }
    public void resetKm(){
        this.km = 0;
    }
    public int getKm(){
        return km;
    }

    public void sumarPuntos(int puntos){
        this.puntos += puntos;
    }
    public int getPuntos(){
        return puntos;
    }
    public void resetPuntos(){
        this.puntos = 0;
    }

    public String getInfo(){
        return "| " + "Piloto Nº " + piloto + " | " + marca + " " + modelo + " " + " | Km: " + km + " | " + "Tiempo Ultima Vuelta: " + tiempoUltV + "s |";
    }
    public String getInfoAll(){
        return "| " + "Piloto Nº " + piloto + " | " + marca + " " + modelo + " " + " | Km: " + km + " | " + "Tiempo Ultima Vuelta: " + tiempoUltV + "s" + " | Puntos: " + puntos + " |";
    }
    public String getInfoPil(){
        return "| " + "Piloto Nº " + piloto + " | " + marca + " " + modelo + " " + " |";
    }

    public void setPiloto(int piloto){
        this.piloto = piloto;
    }

    public void sumarTiempoUltV(int tiempoUltV){
        this.tiempoUltV += tiempoUltV;
    }
    public int getTiempoUltV(){
        return tiempoUltV;
    }
    public void restarTiempo(int tiempoUltV){
        this.tiempoUltV -= tiempoUltV;
    }
    public void resetTiempo(){
        this.tiempoUltV = 0;
    }

}