package uni.aed.arbolesdeexpansion;
import uni.aed.tda.linkedlistTDA.Iterador;
import uni.aed.tda.linkedlistTDA.LinkedListTDA;

public class ArbolesDeExpansion {
    public static void main(String[] args) {
        Graph graph = new SimpleGraph(4);
        graph.addEdge(0, 1, 10);
        graph.addEdge(0, 2, 6); 
        graph.addEdge(0, 3, 5);
        graph.addEdge(1, 3, 15);
        graph.addEdge(2, 3, 4);

        LinkedListTDA<Edge> mst = Kruskal.findMST(graph);

        System.out.println("Edges in the Minimum Spanning Tree:");
        Iterador<Edge> edgeIterator = new Iterador<>(mst);
        while (edgeIterator.hasNext()) {
            Edge edge = edgeIterator.next();
            System.out.println(edge.src + " - " + edge.dest + " : " + edge.weight);
        }
    }
}

