package backtracking;

import inputs.GraphInput;

public class Client {
	static GraphInput gr;
	@SuppressWarnings("unused")
	public static void main(String args[]){
		
//		AllBinaryString bs = new AllBinaryString(5);
		
//		AllSubset as = new AllSubset(5);
		
//		AllDirectedGraphs adg = new AllDirectedGraphs(3);
		
//		AllUnDirectedGraphs audg = new AllUnDirectedGraphs(3);
		
//		AllPermuations ap = new AllPermuations(3);
		
//		gr = new GraphInput(5);
//		int[][] graph = gr.getUnweightedUndirectedGraph(0);
//		AllHamiltonianCycles ah = new AllHamiltonianCycles(5,graph);
		
		gr = new GraphInput(5);
		int[][] graph = gr.getUnweightedUndirectedGraph(0);
		Automorphism ah = new Automorphism(5,graph);
		
	}
}
