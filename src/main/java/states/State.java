package states;

import statemachine.Isa88StateMachine;

public abstract class State implements IState {

	/**
	 * Execute an action, complete this state and transition to the next state 
	 * @param stateMachine The current state machine instance
	 */
	public void executeActionAndComplete(Isa88StateMachine stateMachine) {
		// Default implementation: Do nothing
		// Acting states have to override this method in order to automatically complete
	}
	
	/**
	 * Default of a simple runAction implementation. Could be overriden if e.g. an action has to run in a separate thread
	 * @param action {@link IStateAction} that is going to be executed
	 */
	protected void executeAction(IStateAction action) {
		action.execute();
	}
	

}
