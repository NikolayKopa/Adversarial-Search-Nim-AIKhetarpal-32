package nim;

import gamealgorithms.*;

/**
 * Applies Minimax search and alpha-beta pruning to find optimal moves for the
 * Nim game.
 * 
 * @author Ishan Khetarpal
 * @author Ruediger Lunde
 */
public class NimDemo {
	public static void main(String[] args) {
		System.out.println("NIM DEMO");
		System.out.println("");
		startMinimaxDemo();
		startAlphaBetaDemo();
	}

	private static void startMinimaxDemo() {
		System.out.println("MINI MAX DEMO\n");
		NimGame game = new NimGame();
		NimState currState = game.getInitialState();
		AdversarialSearch<NimState, Integer> search = MinimaxSearch
				.createFor(game);
		while (!(game.isTerminal(currState))) {
			System.out.println(game.getPlayer(currState) + "  playing ... ");
			Integer action = search.makeDecision(currState);
			currState = game.getResult(currState, action);
			System.out.println(currState);
		}
		System.out.println("MINI MAX DEMO done");
	}

	private static void startAlphaBetaDemo() {
		System.out.println("ALPHA BETA DEMO\n");
		NimGame game = new NimGame();
		NimState currState = game.getInitialState();
		AdversarialSearch<NimState, Integer> search = AlphaBetaSearch
				.createFor(game);
		while (!(game.isTerminal(currState))) {
			System.out.println(game.getPlayer(currState) + "  playing ... ");
			Integer action = search.makeDecision(currState);
			currState = game.getResult(currState, action);
			System.out.println(currState);
		}
		System.out.println("ALPHA BETA DEMO done");
	}
}