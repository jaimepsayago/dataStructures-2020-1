package unidad5;

import java.util.ArrayList;

public class AppGraph {

	public static void main(String[] args) {

		//grafo con 5 vertices
		int V = 5;
		ArrayList<ArrayList<Integer>> adj =
				new ArrayList<ArrayList<Integer>> (V);
		Graph adj1 = new Graph();
		
		for (int i = 0; i< V; i++) {
			adj.add(new ArrayList<Integer>());
		}
		adj1.addEdge(adj, 0, 1);
		adj1.addEdge(adj, 0, 4);
		adj1.addEdge(adj, 1, 2);
		adj1.addEdge(adj, 1, 3);
		adj1.addEdge(adj, 1, 4);
		adj1.addEdge(adj, 2, 3);
		adj1.addEdge(adj, 3, 4);
		adj1.printGraph(adj);
		
		

	}

}
