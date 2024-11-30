/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uni.aed.proyectofinal;

/**
 *
 * @author Max--
 */
class Arista implements Comparable<Arista> {
    private int origen;
    private int destino;
    private int peso;

    public Arista(int origen, int destino, int peso) {
        this.origen = origen;
        this.destino = destino;
        this.peso = peso;
    }

    public int getOrigen() {
        return origen;
    }

    public int getDestino() {
        return destino;
    }

    public int getPeso() {
        return peso;
    }

    @Override
    public int compareTo(Arista otra) {
        return Integer.compare(this.peso, otra.peso);
    }
}
