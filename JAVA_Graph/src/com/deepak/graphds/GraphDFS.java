package com.deepak.graphds;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class GraphDFS {

	int V;
	List<Integer>adj[];
	
	GraphDFS(int count) {
		this.V = count;
		adj = new LinkedList[this.V];
		for(int i =0; i < this.V; ++i) {
			adj[i] = new LinkedList<Integer>();
		}
		
	}
	public void addEdge(int v, int w) {
		adj[v].add(w);
	}
	
	private void DFSUtill(int s, boolean[] visited) {
		
		visited[s] = true;
		System.out.println(s +"");
		Iterator<Integer> it = adj[s].listIterator();
		
		while(it.hasNext()) {
			int n = it.next();
			if(!visited[n]) {
				DFSUtill(n, visited);
			}
			
		}
	}
	public void DFS(int s) {
		boolean[] visited = new boolean[this.V];
		
		DFSUtill(s, visited);
	}
	
	
	public static void main(String[] args) {
		GraphDFS g = new GraphDFS(4);
		g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        
        g.DFS(0);
        
	}
}
