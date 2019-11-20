package searchs_eigth_puzzle;


import aima.core.agent.Action;
import aima.core.environment.eightpuzzle.*;
import aima.core.search.agent.SearchAgent;
import aima.core.search.framework.SearchForActions;
import aima.core.search.framework.problem.Problem;
import aima.core.search.uninformed.DepthLimitedSearch;

import java.util.Properties;


public class EigthPuzzleDLS {
	
	//***Par�metros: board inicial do quebra cabe�a.***//
	//***Retorno: nulo.***//	
	public static void quebraHead8DLSfunction (EightPuzzleBoard inicial) {
		
		System.out.println("\nQuebra cabeca de 8 pecas (DLS)\n");
		try {
			Problem<EightPuzzleBoard, Action> problem = new BidirectionalEightPuzzleProblem(inicial);
			SearchForActions<EightPuzzleBoard, Action> search = new DepthLimitedSearch<>(10);
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
