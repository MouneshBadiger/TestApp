
package dp.behavioral.State;

public class TVRemote {

	public static void main(String[] args) {
		TVContext context = new TVContext();
		State tvStartState = new TVStartState();
		State tvStopState = new TVStopState();
		
		context.setState(tvStartState);
		context.doAction();
		
		context.setState(tvStopState);
		context.doAction();
		
		context.setState(new TVMuteStatus());
		context.doAction();
		
	}

}
