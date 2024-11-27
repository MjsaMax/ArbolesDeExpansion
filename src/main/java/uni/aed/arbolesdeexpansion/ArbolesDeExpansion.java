/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package uni.aed.arbolesdeexpansion;
import java.util.*;

/**
 *
 * @author Max--
 */
public class ArbolesDeExpansion {
    public static void main(String[] args) {
        Graph graph = new SimpleGraph(4);
        graph.addEdge(0, 1, 10);
        graph.addEdge(0, 2, 6); 
        graph.addEdge(0, 3, 5);
        graph.addEdge(1, 3, 15);
        graph.addEdge(2, 3, 4);

        List<Edge> mst = Kruskal.findMST(graph);

        System.out.println("Edges in the Minimum Spanning Tree:");
        for (Edge edge : mst) {
            System.out.println(edge.src + " - " + edge.dest + " : " + edge.weight);
        }
    }
}
