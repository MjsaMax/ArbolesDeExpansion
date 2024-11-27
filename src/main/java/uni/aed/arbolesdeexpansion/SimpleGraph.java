/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uni.aed.arbolesdeexpansion;
import java.util.*;
/**
 *
 * @author Max--
 */
public class SimpleGraph implements Graph {
    private int vertexCount;
    private List<Edge> edges;

    public SimpleGraph(int vertexCount) {
        this.vertexCount = vertexCount;
        this.edges = new ArrayList<>();
    }

    @Override
    public void addEdge(int src, int dest, int weight) {
        edges.add(new Edge(src, dest, weight));
    }

    @Override
    public List<Edge> getEdges() {
        return edges;
    }

    @Override
    public int getVertexCount() {
        return vertexCount;
    }
}
