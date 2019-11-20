package searchs_map_agent;

import aima.core.environment.map.MoveToAction;
import aima.core.search.framework.SearchForActions;
import aima.core.search.uninformed.IterativeDeepeningSearch;

public class MapAgentIDS extends MapAgentBase {
	public static void main(String[] args) {
		SearchForActions<String, MoveToAction> search;
		search = new IterativeDeepeningSearch<String, MoveToAction>();
		searchs(search);
	}
}