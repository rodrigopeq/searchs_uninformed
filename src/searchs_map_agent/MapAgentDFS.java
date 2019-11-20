package searchs_map_agent;

import aima.core.environment.map.MoveToAction;
import aima.core.search.framework.SearchForActions;
import aima.core.search.framework.qsearch.GraphSearch;
import aima.core.search.uninformed.DepthFirstSearch;

public class MapAgentDFS extends MapAgentBase {
	public static void main(String[] args) {
		SearchForActions<String, MoveToAction> search;
		search = new DepthFirstSearch<>(new GraphSearch<>());
		searchs(search);
	}
}