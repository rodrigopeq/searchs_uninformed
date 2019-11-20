package searchs_eigth_queens;

import java.util.List;
import java.util.Optional;

import aima.core.environment.nqueens.NQueensBoard;
import aima.core.environment.nqueens.NQueensFunctions;
import aima.core.environment.nqueens.QueenAction;
import aima.core.search.framework.SearchForActions;
import aima.core.search.framework.problem.Problem;

public abstract class EigthQueensBase {
	final private static int numberQueens = 8;
	
	public static void searchs (SearchForActions<NQueensBoard, QueenAction> search) {
		Problem<NQueensBoard, QueenAction> problem = NQueensFunctions.createIncrementalFormulationProblem(numberQueens);
		Optional<List<QueenAction>> actions = search.findActions(problem);
		actions.ifPresent(qActions -> qActions.forEach(System.out::println));
		System.out.println(search.getMetrics());
	}
}
