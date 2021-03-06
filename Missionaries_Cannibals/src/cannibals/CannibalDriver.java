/*
 * COSC:176 Artificial Intelligence.
 * Assignment 1 : Missionaries and Cannibals Problem.
 * Author : Mahesh Devalla
 * Submission Date : 09/20/2016
 * Acknowledgement : Professor Devin Balkcom for providing the stubs.
 * 
 */
package cannibals;

import java.util.List;

public class CannibalDriver {
	public static final int MAXDEPTH = 5000;
	
	public static void main(String args[]) {
	
		// interesting starting state:  
		//  8, 5, 1  (IDS slow, but uses least memory.)


		// set up the "standard" 331 problem:
		CannibalProblem mcProblem = new CannibalProblem(8, 5, 1, 0, 0, 0);
	
		List<UUSearchProblem.UUSearchNode> path;
		
		
		path = mcProblem.breadthFirstSearch();	
		System.out.println("bfs path length:  " + path.size() + " " + path);
		//System.out.println(path);
		mcProblem.printStats();
		System.out.println("--------");
		
	
		path = mcProblem.depthFirstMemoizingSearch(MAXDEPTH);	
		System.out.println("dfs memoizing path length:" + path.size());
		//System.out.println(path);
		mcProblem.printStats();
		System.out.println("--------");
		
		path = mcProblem.depthFirstPathCheckingSearch(MAXDEPTH);
		System.out.println("dfs path checking path length:" + path.size());
		//System.out.println(path);
		mcProblem.printStats();
		
		
		System.out.println("--------");
		path = mcProblem.IDSearch(MAXDEPTH);
		System.out.println("Iterative deepening (path checking) path length:" + path.size());
		//System.out.println(path);
		mcProblem.printStats();	
	}
}