package searchs_eigth_puzzle;


import aima.core.agent.Action;
import aima.core.environment.eightpuzzle.*;
import aima.core.search.agent.SearchAgent;
import aima.core.search.framework.SearchForActions;
import aima.core.search.framework.problem.Problem;
import aima.core.search.framework.qsearch.GraphSearch;
import aima.core.search.uninformed.BreadthFirstSearch;

import java.util.Properties;


public class EigthPuzzleBFS {
	
	//***Par�metros: board inicial do quebra cabe�a.***//
	//***Retorno: nulo.***//
	public static void quebraHead8BFSfunction (EightPuzzleBoard inicial) {
		
		System.out.println("\nQuebra cabeca de 8 pecas (BFS)\n");
		try {
			Problem<EightPuzzleBoard, Action> problem = new BidirectionalEightPuzzleProblem(inicial);
			SearchForActions<EightPuzzleBoard, Action> search = new BreadthFirstSearch<>(new GraphSearch<EightPuzzleBoard, Action>());
			SearchAgent<Object, EightPuzzleBoard, Action> agent = new SearchAgent<>(problem, search);
			printMetrics(agent.getInstrumentation());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		
	private static void printMetrics(Properties properties) {
		properties.keySet().stream().map(key -> key + " = " + properties.get(key)).forEach(System.out::println);
	}

}
