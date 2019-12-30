package io.jomosquera.personalsoft.VideoJuegos;

public class Vehiculos {

    private int numeroPersonas;
    private double capacidadToneladas;
    private String listaArmamento;
    private int numeroMuniciones;

    public Vehiculos() {
    }

    public Vehiculos(int numeroPersonas, double capacidadToneladas, String listaArmamento, int numeroMuniciones) {
        this.numeroPersonas = numeroPersonas;
        this.capacidadToneladas = capacidadToneladas;
        this.listaArmamento = listaArmamento;
        this.numeroMuniciones = numeroMuniciones;
    }

    public int getNumeroPersonas() {
        return numeroPersonas;
    }

    public void setNumeroPersonas(int numeroPersonas) {
        this.numeroPersonas = numeroPersonas;
    }

    public double getCapacidadToneladas() {
        return capacidadToneladas;
    }

    public void setCapacidadToneladas(double capacidadToneladas) {
        this.capacidadToneladas = capacidadToneladas;
    }

    public String getListaArmamento() {
        return listaArmamento;
    }

    public void setListaArmamento(String listaArmamento) {
        this.listaArmamento = listaArmamento;
    }

    public int getNumeroMuniciones() {
        return numeroMuniciones;
    }

    public void setNumeroMuniciones(int numeroMuniciones) {
        this.numeroMuniciones = numeroMuniciones;
    }

    public void realizarAtaques(){

    }
}
