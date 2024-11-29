/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uni.aed.arbolesdeexpansion;
import uni.aed.tda.linkedlistTDA.LinkedListTDA;
import uni.aed.tda.arraylistTDA.ArrayListTDA;

/**
 *
 * @author Max--
 */
class SimpleGraph implements Graph {
    private final int vertexCount;
    private LinkedListTDA<Edge> edges;

    public SimpleGraph(int vertexCount) {
        this.vertexCount = vertexCount;
        this.edges = new LinkedListTDA<>();
    }

    @Override
    public void addEdge(int src, int dest, int weight) {
        edges.add(new Edge(src, dest, weight));
    }

    @Override
    public LinkedListTDA<Edge> getEdges() {
        return edges;
    }

    @Override
    public int getVertexCount() {
        return vertexCount;
    }
}
