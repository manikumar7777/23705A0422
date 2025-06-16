import java.util.*;

class Graph {
    int vertices;
    boolean isDirected;
    ArrayList<HashSet<Integer>> graph;

    public Graph(int vertices, boolean isDirected) {
        this.vertices = vertices;
        this.isDirected = isDirected;
        graph = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            graph.add(new HashSet<>());
        }
    }

    public void addEdge(int src, int dest) {
        if (isValid(src, dest)) {
            graph.get(src).add(dest);
            if (!isDirected) {
                graph.get(dest).add(src);
            }
        } else {
            System.out.println("Invalid src or dest");
        }
    }

    public void removeEdge(int src, int dest) {
        if (isValid(src, dest)) {
            graph.get(src).remove(dest);
            if (!isDirected) {
                graph.get(dest).remove(src);
            }
        } else {
            System.out.println("Invalid src or dest");
        }
    }

    boolean isHavingEdge(int src, int dest) {
        return graph.get(src).contains(dest);
    }

    HashSet<Integer> getNeighbours(int src) {
        if (src >= 0 && src < vertices) return graph.get(src);
        throw new IndexOutOfBoundsException("Invalid vertex index");
    }

    boolean isValid(int src, int dest) {
        return src >= 0 && dest >= 0 && src < vertices && dest < vertices && src != dest;
    }

    void printGraph() {
        for (int i = 0; i < vertices; i++) {
            System.out.println(i + ": " + graph.get(i));
        }
    }

    void dfs(int start, boolean[] visited) {
        visited[start] = true;
        System.out.print(start + " ");
        for (int neighbour : getNeighbours(start)) {
            if (!visited[neighbour]) {
                dfs(neighbour, visited);
            }
        }
    }

    void bfs() {
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[vertices];
        q.add(0);
        while (!q.isEmpty()) {
            int current = q.remove();
            if (!visited[current]) {
                visited[current] = true;
                System.out.print(current + " ");
                for (int neighbour : getNeighbours(current)) {
                    if (!visited[neighbour]) {
                        q.add(neighbour);
                    }
                }
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(5, false);
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 4);
        graph.addEdge(1,3);
        graph.addEdge(3, 4);
        graph.addEdge(0, 3);

        System.out.println("Graph:");
        graph.printGraph();

        System.out.println("\nDFS:");
        graph.dfs(0, new boolean[5]);

        System.out.println("\n\nBFS:");
        graph.bfs();
    }
}
