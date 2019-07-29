
package dp.behavioral.observer;

public class ObserverPatternTest {

	public static void main(String[] args) {
		//create subject
		MyTopic topic = new MyTopic();
		
		//create observers
		Observer obs1 = new MyTopicSubscriber("Obj1");
		Observer obs2 = new MyTopicSubscriber("Obj2");
		Observer obs3 = new MyTopicSubscriber("Obj3");
		
		//register observers to the subject
		topic.register(obs1);
		topic.register(obs2);
		topic.register(obs3);//observable.subscriber(observer)
		
		//attach observer to subject
		obs1.setSubject(topic);
		obs2.setSubject(topic);
		obs3.setSubject(topic);
		
		//check if any update is available
		obs1.update();
		
		//now send message to subject
		topic.postMessage("New Message");
	}

}
