package nim;

import gamealgorithms.*;
import java.util.*;

// Data type of state of game is custom class -- NimState
// Data type of moves is integer (number of dragons to subtract)
// Data type of player is integer (1=MAX first / 2=MINNIE second)
public class NimGame implements Game<NimState, Integer, Integer> {

  public static final int NDRAGONS = 15;
  public static final int FATAL_STATE = 1;
  public static final int[] MOVES = new int[] {-2, -3};

  private NimState initialState = new NimState();
  private Integer[] players = {1, 2};

  public NimState getInitialState() {
    return initialState;
  }

  public Integer[] getPlayers() {
    return players;
  }

  public Integer getPlayer(NimState s) {
    return s.getPlayerToMove();
  }

  public List<Integer> getActions(NimState s) {
    return s.getValidMoves();
  }

  public NimState getResult(NimState s, Integer move) {
    NimState newState = s.clone();
    newState.enact(move);
    return newState;
  }

  public boolean isTerminal(NimState s) {
    return s.isTerminal();
  }

  public double getUtility(NimState s, Integer player) {
    return s.getUtility();
  }
  
}