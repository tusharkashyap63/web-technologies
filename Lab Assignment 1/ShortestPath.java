import java.util.*;

public class ShortestPath {
    static class Edge {
        int x, y, weight;
        Edge(int a, int b, int c) {
            x = a;
            y = b;
            weight = c;
        }
    };
    private static void dfs(ArrayList < ArrayList < Integer >> graph, boolean[] visited, List < Integer > tempPath, Integer src, Integer dest) {

        if (src == dest) {
            System.out.println(tempPath);
            return;
        }

        visited[src] = true;
        for (Integer i: graph.get(src)) {
            if (!visited[i]) {
                tempPath.add(i);
                dfs(graph, visited, tempPath, i, dest);
                tempPath.remove(i);
            }
        }

        visited[src] = false;
    }
    private static void bellmanFord(Edge[] graph, int V, int E, int src, int dest) {

        int parent[] = new int[V];
        int distance[] = new int[V];
        for (int i = 0; i < V; i++) {
            parent[i] = i;
            distance[i] = Integer.MAX_VALUE;
        }
        distance[src] = 0;
        int j = 0;
        while (j < V - 1) {
            for (Edge edge: graph) {
                int u = edge.x;
                int v = edge.y;
                int wt = edge.weight;

                if (distance[u] != Integer.MAX_VALUE && distance[u] + wt < distance[v]) {
                    parent[v] = u;
                    distance[v] = distance[u] + wt;
                }
            }
            j++;
        }

        for (int i = 0; i < E; i++) {
            Edge edge = graph[i];
            int u = edge.x;
            int v = edge.y;
            int wt = edge.weight;

            if (distance[u] != Integer.MAX_VALUE && distance[u] + wt < distance[v]) {
                System.out.println("Negative cycle exists in graph");
                return;
            }
        }

        System.out.println();
        System.out.println("The shortest distance between " + src + " and " + dest + " is: " + distance[dest] + " and the shortest path is: ");

        Stack < Integer > stack = new Stack < Integer > ();
        stack.push(dest);
        while (parent[dest] != dest) {
            stack.push(parent[dest]);
            dest = parent[dest];
        }

        while (stack.size() != 0) {
            Integer y = (Integer) stack.pop();
            System.out.print(y + " ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of vertices V: ");
        int V = Integer.parseInt(sc.nextLine());

        System.out.print("Enter the number of edges E: ");
        int E = Integer.parseInt(sc.nextLine());

        Edge graph[] = new Edge[E];
        ArrayList < ArrayList < Integer >> adj = new ArrayList < > ();
        for (int i = 0; i < V; i++)
            adj.add(i, new ArrayList < Integer > ());

        for (int i = 0; i < E; i++) {
            System.out.println("Enter the edges(0 based indexing) in the form: u v w , w is the weight");
            int u = sc.nextInt();
            int v = sc.nextInt();
            int wt = sc.nextInt();

            graph[i] = new Edge(u, v, wt);
            adj.get(u).add(v);
        }

        int src, dest;
        System.out.println("Enter the source and destination in the form: u v ");
        src = sc.nextInt();
        dest = sc.nextInt();
        bellmanFord(graph, V, E, src, dest);
        ArrayList < Integer > tempPath = new ArrayList < > ();
        tempPath.add(src);
        sc.close();
        boolean visited[] = new boolean[V];
        System.out.println("All paths between " + src + " and " + dest + " are: ");
        dfs(adj, visited, tempPath, src, dest);

    }
}