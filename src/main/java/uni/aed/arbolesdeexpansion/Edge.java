package uni.aed.arbolesdeexpansion;

public class Edge implements Comparable<Edge> {
    int src, dest, weight;

    public Edge(int src, int dest, int weight) {
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }

    @Override
    public int compareTo(Edge other) {
        return Integer.compare(this.weight, other.weight);
    }

    @Override
    public String toString() {
        return "Edge{" + "src=" + src + ", dest=" + dest + ", weight=" + weight + '}';
    }
}

