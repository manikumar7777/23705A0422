public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(4);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(0, 3);
        graph.addEdge(1, 2);
        graph.printGraph();

        System.out.println("Edge between 0 and 1: " + graph.havingEdge(0, 1));
        System.out.println("Edge between 2 and 3: " + graph.havingEdge(2, 3));
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
}
