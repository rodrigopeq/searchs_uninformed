package searchs_map_agent;

import aima.core.environment.map.MoveToAction;
import aima.core.search.framework.SearchForActions;
import aima.core.search.uninformed.BreadthFirstSearch;

public class MapAgentBFS extends MapAgentBase {
	public static void main(String[] args) {
		SearchForActions<String, MoveToAction> search;
		search = new BreadthFirstSearch<>();
		searchs(search);
	}
}