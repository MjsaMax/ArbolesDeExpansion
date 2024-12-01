/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uni.aed.proyectofinal;

/**
 *
 * @author Max--
 */
import java.util.*;

class Grafo {
    private List<Vertice> vertices;
    private List<Arista> aristas;
    int sumPeso;

    public Grafo() {
        vertices = new ArrayList<>();
        aristas = new ArrayList<>();
    }

    public void agregarVertice(int id) {
        vertices.add(new Vertice(id));
    }

    public void agregarArista(int origen, int destino, int peso) {
        Arista arista = new Arista(origen, destino, peso);
        aristas.add(arista);
    }

    public boolean borrarVertice(int id) {
        Vertice aRemover = null;
        for (Vertice v : vertices) {
            if (v.getId() == id) {
                aRemover = v;
                break;
            }
        }
        if (aRemover != null) {
            vertices.remove(aRemover);
            aristas.removeIf(a -> a.getOrigen() == id || a.getDestino() == id);
            return true;
        }
        return false;
    }

    public boolean borrarArista(int origen, int destino) {
        return aristas.removeIf(a -> (a.getOrigen() == origen && a.getDestino() == destino) || 
                                     (a.getOrigen() == destino && a.getDestino() == origen));
    }

    public List<Arista> kruskal() {
        List<Arista> resultado = new ArrayList<>();
        List<Arista> aristasOrdenadas = new ArrayList<>(aristas);
        Collections.sort(aristasOrdenadas);
        
        Map<Integer, Integer> conjuntos = new HashMap<>();
        for (Vertice v : vertices) {
            conjuntos.put(v.getId(), v.getId());
        }

        for (Arista a : aristasOrdenadas) {
            int raizOrigen = encontrarRaiz(conjuntos, a.getOrigen());
            int raizDestino = encontrarRaiz(conjuntos, a.getDestino());
            
            if (raizOrigen != raizDestino) {
                sumPeso=sumPeso+a.getPeso();
                resultado.add(a);
                conjuntos.put(raizOrigen, raizDestino);
            }
        }

        return resultado;
    }

    private int encontrarRaiz(Map<Integer, Integer> conjuntos, int id) {
        while (conjuntos.get(id) != id) {
            id = conjuntos.get(id);
        }
        return id;
    }

    public List<Arista> getAristas() {
        return aristas;
    }

    public Vertice getVertice(int id) {
        for (Vertice v : vertices) {
            if (v.getId() == id) {
                return v;
            }
        }
        return null;
    }
}

