package searchs_eigth_puzzle;

import aima.core.environment.eightpuzzle.*;



public class EigthPuzzle {

	//***Exemplo usado pelo aima com melhor resposta com apenas 3 passos.***//
	private static EightPuzzleBoard exampleSimple = new EightPuzzleBoard(new int[] { 1, 2, 5, 3, 4, 0, 6, 7, 8 });

	public static void main(String[] args) {
		
		System.out.println("Estado inicial:\n" + exampleSimple);
		
		//***Uso de fun��es para cada tipo de busca.***//
		EigthPuzzleDFS.quebraHead8DFSfunction(exampleSimple);   //**Busca em profundidade.**//
		EigthPuzzleDLS.quebraHead8DLSfunction(exampleSimple);   //**Busca em profundidade limitada.**//
		EigthPuzzleIDLS.quebraHead8IDLSfunction(exampleSimple); //**Busca em profundidade iterativa.**//
		EigthPuzzleBFS.quebraHead8BFSfunction(exampleSimple);   //**Busca em largura.**//
		EigthPuzzleUCS.quebraHead8UCSfunction(exampleSimple);   //**Busca com custo uniforme.**//
		EigthPuzzleBDS.quebraHead8BDSfunction(exampleSimple);   //**Busca bidirecional.**//
	}
	
}
