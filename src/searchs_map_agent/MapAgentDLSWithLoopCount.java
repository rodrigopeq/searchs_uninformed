package searchs_map_agent;

import aima.core.environment.map.MoveToAction;
import aima.core.search.framework.SearchForActions;
import aima.core.search.uninformed.DepthLimitedSearch;

public class MapAgentDLSWithLoopCount extends MapAgentBase {
	public static void main(String[] args) {
		long inicio;
		float total = 0f;
		int execucoes = 1000000;
		for (int i = 0; i < execucoes; i++) {
			inicio = System.currentTimeMillis();

			SearchForActions<String, MoveToAction> search;
			search = new DepthLimitedSearch<>(3);
			searchs(search);

			total += System.currentTimeMillis() - inicio;
		}

		System.out.println("Tempo médio de execução: " + total / execucoes + ", tempo total: " + (int) total / 1000);
	}
}