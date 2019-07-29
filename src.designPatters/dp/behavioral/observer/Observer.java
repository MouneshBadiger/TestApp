
package dp.behavioral.observer;

public interface Observer {
	
	//method to update the observer, used by subject
	public void update();
	
	//method to update the observer, for geting update using argument
	public void update(String msg);
	
	//attach with subject to observe
	public void setSubject(Subject sub);
}
