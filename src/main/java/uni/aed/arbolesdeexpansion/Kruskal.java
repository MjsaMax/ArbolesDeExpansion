package uni.aed.arbolesdeexpansion;
import uni.aed.tda.listTDA.ListTDA;
import Complementos.Sort;
import uni.aed.tda.linkedlistTDA.Iterador;
import uni.aed.tda.linkedlistTDA.LinkedListTDA;

public class Kruskal {
    public static LinkedListTDA<Edge> findMST(Graph graph) {
        LinkedListTDA<Edge> mst = new LinkedListTDA<>();
        LinkedListTDA<Edge> edges = graph.getEdges();
        int vertexCount = graph.getVertexCount();
        Sort.sort(edges); // Assuming this correctly sorts the edges by weight
        DisjointSet disjointSet = new DisjointSet(vertexCount);
        
        Iterador<Edge> edgeIterator = new Iterador<>(edges);
        
        while (edgeIterator.hasNext()) {
            Edge currentEdge = edgeIterator.next();
            int x = disjointSet.find(currentEdge.src);
            int y = disjointSet.find(currentEdge.dest);

            if (x != y) {
                mst.add(currentEdge);
                disjointSet.union(x, y);
            }
        }

        return mst;
    }
}

