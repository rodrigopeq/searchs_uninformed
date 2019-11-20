package searchs_map_agent;

import aima.core.environment.map.MoveToAction;
import aima.core.search.framework.SearchForActions;
import aima.core.search.framework.qsearch.GraphSearch;
import aima.core.search.framework.qsearch.TreeSearch;
import aima.core.search.uninformed.UniformCostSearch;

public class MapAgentUCS extends MapAgentBase {
	public static void main(String[] args) {
		SearchForActions<String, MoveToAction> search;
		
		System.out.println("----------------------------------------");
		System.out.println("-------------- TreeSearch --------------");
		System.out.println("----------------------------------------");
		search = new UniformCostSearch<>(new TreeSearch<>());
		searchs(search);
		
		
		System.out.println("\n\n");
		System.out.println("----------------------------------------");
		System.out.println("-------------- GraphSearch -------------");
		System.out.println("----------------------------------------");
		search = new UniformCostSearch<>(new GraphSearch<>());
		searchs(search);
	}
}