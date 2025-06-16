public class practice{
    public static void main(String[] args){
        Graph graph=new Graph(4);
        graph.addEdge(0,1);
        graph.printGraph();
    }
}
class Graph{
    int[] graph;
    int vertices;
    Graph(int vertices){
        graph=new int[vertice][vertices];
        this.vertices=vertices;
    }
    void addEdge(int src,int dest){
        if(isValid(int src,int dest)){
            graph[src][dest]=1;
            graph[dest][src]=1;
        }
        else{
            System.out.println(invalid source and destination");
        }
    }
    void removeEdge(int scr,int dest){
        if(isValid(int src,int dest)){
            graph[src][dest]=0;
            graph[dest][src]=0;
        }else{
            System.out.println("invalid source and destination");
        }
    }
    boolean isValid(int src,int dest){
        return src>=0 & dest>=0 && src<vertices && dest>vertices && src!=dest;
    }
    boolean havingEdge(int src,int dest){
        if(isvalid(src,dest)){
            if(graph[src][dest]==1) return true;
        else
            return false;
        }
        System.out.println("invalid soursce and destination");
        return false;
    }
    void printGraph(){
        for(int i=0;i<vertices;i++){
            for
        }
    }