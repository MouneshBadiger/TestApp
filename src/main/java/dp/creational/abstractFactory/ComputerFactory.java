
package dp.creational.abstractFactory;

import dp.creational.factory.Computer;

public class ComputerFactory {

	public static Computer getComputer(ComputerAbstractFactory factory){
		return factory.createComputer();
	}
}
