import java.util.*;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(4, true);
        graph.addEdge(0, 1);
        graph.addEdge(0, 3);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.printGraph();
    }
}

class Edge {
    int dest;
    int weight;

    public Edge(int dest, int weight) {
        this.dest = dest;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "(" + dest + ", weight=" + weight + ")";
    }
}

class Graph {
    List<List<Edge>> adjList;
    int vertices;
    boolean isDirected;

    Graph(int vertices, boolean isDirected) {
        this.vertices = vertices;
        this.isDirected = isDirected;
        adjList = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdge(int src, int dest) {
        addEdge(src, dest, 1); // default weight
    }

    public void addEdge(int src, int dest, int weight) {
        if (isValid(src, dest)) {
            adjList.get(src).add(new Edge(dest, weight));
            if (!isDirected) {
                adjList.get(dest).add(new Edge(src, weight));
            }
        } else {
            System.out.println("Invalid src or dest: " + src + " -> " + dest);
        }
    }

    public void removeEdge(int src, int dest) {
        if (isValid(src, dest)) {
            adjList.get(src).removeIf(edge -> edge.dest == dest);
            if (!isDirected) {
                adjList.get(dest).removeIf(edge -> edge.dest == src);
            }
        } else {
            System.out.println("Invalid src or dest for removal");
        }
    }

    public boolean isValid(int src, int dest) {
        return src >= 0 && dest >= 0 && src < vertices && dest < vertices && src != dest;
    }

    public void printGraph() {
        for (int i = 0; i < vertices; i++) {
            System.out.print("Vertex " + i + ": ");
            for (Edge edge : adjList.get(i)) {
                System.out.print(edge + " ");
            }
            System.out.println();
        }
    }
}
