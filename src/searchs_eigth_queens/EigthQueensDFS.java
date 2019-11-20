package searchs_eigth_queens;

import aima.core.environment.nqueens.NQueensBoard;
import aima.core.environment.nqueens.QueenAction;
import aima.core.search.framework.SearchForActions;
import aima.core.search.framework.qsearch.TreeSearch;
import aima.core.search.uninformed.DepthFirstSearch;

public class EigthQueensDFS extends EigthQueensBase{

	public static void main(String[] args) {
		System.out.println("\n--- 8 Rainhas BFS ---");
		SearchForActions<NQueensBoard, QueenAction> search;
		search = new DepthFirstSearch<>(new TreeSearch<>());
		searchs(search);
	}

}
