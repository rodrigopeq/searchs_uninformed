package searchs_map_agent;

import aima.core.environment.map.MoveToAction;
import aima.core.search.framework.SearchForActions;
import aima.core.search.framework.qsearch.BidirectionalSearch;
import aima.core.search.uninformed.BreadthFirstSearch;

public class MapAgentBDS extends MapAgentBase{
	public static void main(String[] args) {
		SearchForActions<String, MoveToAction> search;
		search = new BreadthFirstSearch<>(new BidirectionalSearch<>());
		searchs(search);
	}
}