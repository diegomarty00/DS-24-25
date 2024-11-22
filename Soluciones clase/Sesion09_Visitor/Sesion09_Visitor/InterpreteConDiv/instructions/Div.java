package instructions;

import vm.State;

public class Div extends AbstractInstruction {

	@Override
	protected void doExecute(State state) {
		int op1 = state.pop();
		int op2 = state.pop();
		state.push(op2 / op1);
	}
}
