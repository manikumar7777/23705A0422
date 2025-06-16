import java.util.*;

class Edge {
    int src;
    int dest;
    int weight;

    Edge(int src, int dest, int weight) {
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }

    Edge(int src, int dest) {
        this(src, dest, 1); // default weight 1
    }

    // Override equals and hashCode for HashSet to work properly
   
    public String toString() {
        return "(" + src + " -> " + dest + ", weight=" + weight + ")";
    }
}

class Graph {
    int vertices;
    boolean isDirected;
    HashSet<Edge> edges;

    public Graph(int vertices, boolean isDirected) {
        this.vertices = vertices;
        this.isDirected = isDirected;
        edges = new HashSet<>();
    }

    public boolean isValid(int src, int dest) {
        return src >= 0 && dest >= 0 && src < vertices && dest < vertices && src != dest;
    }

    public void addEdge(int src, int dest) {
        addEdge(src, dest, 1);
    }

    public void addEdge(int src, int dest, int weight) {
        if (!isValid(src, dest)) {
            System.out.println("Invalid src or dest");
            return;
        }
        Edge e = new Edge(src, dest, weight);
        edges.add(e);
        if (!isDirected) {
            Edge rev = new Edge(dest, src, weight);
            edges.add(rev);
        }
    }

    public void removeEdge(int src, int dest) {
        edges.removeIf(e -> e.src == src && e.dest == dest);
        if (!isDirected) {
            edges.removeIf(e -> e.src == dest && e.dest == src);
        }
    }

    public boolean isHavingEdge(int src, int dest) {
        for (Edge e : edges) {
            if (e.src == src && e.dest == dest) return true;
        }
        return false;
    }

    public List<Integer> getNeighbours(int src) {
        if (src < 0 || src >= vertices) {
            throw new IndexOutOfBoundsException("Invalid vertex index");
        }
        List<Integer> neighbours = new ArrayList<>();
        for (Edge e : edges) {
            if (e.src == src) {
                neighbours.add(e.dest);
            }
        }
        return neighbours;
    }

    public void printGraph() {
        System.out.println("Graph edges:");
        for (Edge e : edges) {
            System.out.println(e);
        }
    }

    public void dfs(int start, boolean[] visited) {
        visited[start] = true;
        System.out.print(start + " ");
        for (int neighbour : getNeighbours(start)) {
            if (!visited[neighbour]) {
                dfs(neighbour, visited);
            }
        }
    }

    public void bfs() {
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        while (!queue.isEmpty()) {
            int current = queue.poll();
            if (!visited[current]) {
                visited[current] = true;
                System.out.print(current + " ");
                for (int neighbour : getNeighbours(current)) {
                    if (!visited[neighbour]) {
                        queue.add(neighbour);
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
        graph.addEdge(1, 3);
        graph.addEdge(3, 4);
        graph.addEdge(0, 3);
        graph.removeEdge(1, 2);

        System.out.println("Graph:");
        graph.printGraph();

        System.out.println("\nDFS:");
        graph.dfs(0, new boolean[5]);

        System.out.println("\n\nBFS:");
        graph.bfs();
    }
}
