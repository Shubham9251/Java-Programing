package main.java.shubham.Graph;
import java.util.Arrays;
import java.util.Scanner;

//creating graph by adjacency matrix...

public class CreatingGraph_01 {

    static int[][] adjM;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter number of nodes ");
        n =  sc.nextInt();

        int m;
        System.out.println("Enter number of edges ");
        m =  sc.nextInt();

        adjM = new int[n][n];

        System.out.println("Enter all edges: ");
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            // creating adjacency matrix...
            // false --> unDirected Graph
            //true --> Directed Graph
            CreatingGraph_01.addEdge(u,v,false);
        }

        CreatingGraph_01.printGraph(n);

        System.out.println("enter node for its degree");
        int node = sc.nextInt();
        CreatingGraph_01.printDegree(node, n);
    }

    public static void addEdge(int u, int v, boolean f) {

        //false --> unDirected Graph
        //true --> Directed Graph

        if (!f) {
            // pitting 1 on if both having connection
            if (u != v) {
                adjM[u][v] = 1;
                adjM[v][u] = 1;
            }
        }
        else{

            if (adjM[v][u] != 1){
                adjM[u][v] = 1;
            }

        }
    }

    public static void printGraph(int nodes) {
        for (int i = 0; i < nodes; i++) {
            System.out.println(Arrays.toString(adjM[i]));
        }
    }

    public static void printDegree(int node, int nodes) {
        int degree = 0;
        for (int i = 0; i < nodes; i++) {
            if (adjM[node][i] == 1)
                degree += 1;
        }

        System.out.println(degree);
    }
}

//class Graph {
//    static int n;
//    static int[][] adjM = new int[n][n];
//
//    Graph (int n) {
//        Graph.n = n;
//    }
//
//    public static void addEdge(int u, int v, boolean f) {
//        //false --> unDirected Graph
//        //true --> Directed Graph
//
//        if (!f) {
//            // pitting 1 on if both having connection
//            if (u != v) {
//                adjM[u][v] = 1;
//                adjM[v][u] = 1;
//            }
//        }
//        else{
//
//            if (adjM[v][u] != 1){
//                adjM[u][v] = 1;
//            }
//
//        }
//    }
//
//    public static void printGraph() {
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(adjM[i][j]);
//            }
//            System.out.println();
//        }
//    }
//}
