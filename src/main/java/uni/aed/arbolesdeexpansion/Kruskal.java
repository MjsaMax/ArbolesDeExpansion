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
public class Kruskal {
    public static List<Edge> findMST(Graph graph) {
        List<Edge> mst = new ArrayList<>();
        List<Edge> edges = graph.getEdges();
        int vertexCount = graph.getVertexCount();

        Collections.sort(edges);

        DisjointSet disjointSet = new DisjointSet(vertexCount);

        for (Edge edge : edges) {
            int x = disjointSet.find(edge.src);
            int y = disjointSet.find(edge.dest);

            if (x != y) {
                mst.add(edge);
                disjointSet.union(x, y);
            }
        }

        return mst;
    }
}