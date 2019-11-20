package searchs_map_agent;

import aima.core.environment.map.MoveToAction;
import aima.core.search.framework.SearchForActions;
import aima.core.search.uninformed.DepthLimitedSearch;

public class MapAgentDLS extends MapAgentBase {
	public static void main(String[] args) {
		SearchForActions<String, MoveToAction> search;
		search = new DepthLimitedSearch<>(20);
		searchs(search);
	}
}