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
    ArrayList<ArrayList<Integer>> graph;
    int vertices;

    public Graph(int vertices) {
        this.vertices = vertices;
        this.graph = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }
    }

    void addEdge(int src, int dest) {
        if (isValid(src, dest)) {
            graph.get(src).add(dest);
            graph.get(dest).add(src);
        } else {
            System.out.println("Invalid src and dest");
        }
    }

    void removeEdge(int src, int dest) {
        if (isValid(src, dest)) {
            graph.get(src).remove(Integer.valueOf(dest));
            graph.get(dest).remove(Integer.valueOf(src));
        } else {
            System.out.println("Invalid src and dest");
        }
    }

    public ArrayList<Integer> neighbours(int node) {
        if (node >= 0 && node < vertices)
            return graph.get(node);
        else
            return new ArrayList<>();
    }

    boolean isValid(int src, int dest) {
        return src >= 0 && dest >= 0 && src < vertices && dest < vertices && src != dest;
    }

    boolean ishavingEdge(int src, int dest) {
        if (isValid(src, dest)) {
            return graph.get(src).contains(dest);
        } else {
            System.out.println("Invalid source and destination");
            return false;
        }
    }

    void printGraph() {
        for (int i = 0; i < vertices; i++) {
            System.out.print("Node " + i + ": ");
            for (int node : graph.get(i)) {
                System.out.print(node + " ");
            }
            System.out.println();
        }
    }
}
