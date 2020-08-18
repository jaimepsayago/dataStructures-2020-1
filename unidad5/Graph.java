package unidad5;

import java.util.ArrayList;

public class Graph {

	//agregar vertices
	public void addEdge(ArrayList<ArrayList<Integer>>
	adj, int u, int v) {
		
		adj.get(u).add(v);
		adj.get(v).add(u);
	}
	
	//representar o graficar
	public void printGraph(ArrayList<ArrayList<Integer>> adj) {
		for (int i = 0; i<adj.size(); i++) {
			System.out.println("\n lista de adyacencia del vertice"+i);
			System.out.print("head");
			for(int j= 0; j<adj.get(i).size();j++) {
				System.out.print("->"+adj.get(i).get(j));
			}
		}
	}
	
	

}
