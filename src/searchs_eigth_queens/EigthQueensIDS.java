package searchs_eigth_queens;

import aima.core.environment.nqueens.NQueensBoard;
import aima.core.environment.nqueens.QueenAction;
import aima.core.search.framework.SearchForActions;
import aima.core.search.uninformed.IterativeDeepeningSearch;


public class EigthQueensIDS extends EigthQueensBase{

	public static void main(String[] args) {
		System.out.println("\n--- 8 Rainhas BFS ---");
		SearchForActions<NQueensBoard, QueenAction> search;
		search = new IterativeDeepeningSearch<NQueensBoard, QueenAction>();
		searchs(search);
		
	}

}