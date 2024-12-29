import java.util.ArrayList;

public class Graph {
    ArrayList<Vertex> arraylist;
    int matrix[][];

    public Graph(int size) {
        arraylist = new ArrayList<Vertex>();
        matrix = new int[size][size];
    }

    public void addVertex(Vertex vertex) {
        arraylist.add(vertex);
    }

    public void addEdge(int source, int destination) {
        matrix[source][destination] = 1;
    }

    public static void main(String[] args) {
        Graph g = new Graph(4);
        g.addVertex(new Vertex("Sam"));
        g.addVertex(new Vertex("Tom"));
        g.addVertex(new Vertex("Harry"));
        g.addVertex(new Vertex("Unique"));
        g.addEdge(0, 0);

    }
}
