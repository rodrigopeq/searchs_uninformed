package searchs_eigth_queens;

import aima.core.environment.nqueens.NQueensBoard;
import aima.core.environment.nqueens.QueenAction;
import aima.core.search.framework.SearchForActions;
import aima.core.search.framework.qsearch.GraphSearch;
import aima.core.search.uninformed.UniformCostSearch;

public class EigthQueensUCS extends EigthQueensBase{

	public static void main(String[] args) {
		System.out.println("\n--- 8 Rainhas UCS ---");
		SearchForActions<NQueensBoard, QueenAction> search; 
		search = new UniformCostSearch<>(new GraphSearch<>());
		searchs(search);

	}

}
