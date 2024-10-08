import java.util.*;

// edges, vertices
public class graph {

    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge> network[]) {
        for (int i = 0; i < network.length; i++) {
            network[i] = new ArrayList<Edge>();
        }
        network[0].add(new Edge(0, 2));

        network[1].add(new Edge(1, 2));
        network[1].add(new Edge(1, 3));

        network[2].add(new Edge(2, 0));
        network[2].add(new Edge(2, 1));
        network[2].add(new Edge(2, 3));

        network[2].add(new Edge(3, 1));
        network[2].add(new Edge(3, 2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = 4;

        ArrayList<Edge> netwok[] = new ArrayList[V];
    }
}
