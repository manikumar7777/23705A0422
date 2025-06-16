import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(3, 4);
        g.printGraph();

        System.out.println("Neighbours of node 1: " + g.neighbours(1));
    }
}

class Graph {
    int[][] graph;
    int vertices;
    boolean isDirected;

    public Graph(int vertices) {
        this.vertices = vertices;
        this.graph = new int[vertices][vertices];
        this.isDirected = false;
    }

    void addEdge(int src, int dest) {
        if (isValid(src, dest)) {
            graph[src][dest] = 1;
            if (!isDirected) graph[dest][src] = 1;
        } else {
            System.out.println("Invalid src and dest");
        }
    }

    void removeEdge(int src, int dest) {
        if (isValid(src, dest)) {
            graph[src][dest] = 0;
            if (!isDirected) graph[dest][src] = 0;
        } else {
            System.out.println("Invalid src and dest");
        }
    }

    boolean isValid(int src, int dest) {
        return src >= 0 && dest >= 0 && src < vertices && dest < vertices && src != dest;
    }

    boolean havingEdge(int src, int dest) {
        if (isValid(src, dest)) {
            return graph[src][dest] == 1;
        }
        System.out.println("Invalid source and destination");
        return false;
    }

    void printGraph() {
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
    }

    public ArrayList<Integer> neighbours(int node) {
        ArrayList<Integer> n = new ArrayList<Integer>();
        for (int i = 0; i < vertices; i++) {
            if (graph[node][i] == 1) {
                n.add(i);
            }
        }
        return n;
    }
}
