
package dp.creational.factory;
/**Factory design pattern is used when we have a super class with multiple sub-classes and based on input, 
 * we need to return one of the sub-class. This pattern take out the responsibility of instantiation of a class 
 * from client program to the factory class.*/
public class ComputerFactory {

	public static Computer getComputer(String type, String ram, String hdd, String cpu){
		
		if("PC".equalsIgnoreCase(type)) 
			return new PC(ram, hdd, cpu);
		else if("Server".equalsIgnoreCase(type))
			return new Server(ram, hdd, cpu);
		
		return null;
	}
}
/*
 * Factory Design Pattern Advantages

1.Factory design pattern provides approach to code for interface rather than implementation.
2.Factory pattern removes the instantiation of actual implementation classes from client code. Factory pattern makes our code more robust, less coupled and easy to extend. For example, we can easily change PC class implementation because client program is unaware of this.
3.Factory pattern provides abstraction between implementation and client classes through inheritance.

Factory Design Pattern Examples in JDK
1.java.util.Calendar, ResourceBundle and NumberFormat getInstance() methods uses Factory pattern.
2.valueOf() method in wrapper classes like Boolean, Integer etc*/