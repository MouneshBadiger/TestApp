
package dp.creational.builder;

public class TestBuilderPattern {

	public static void main(String[] args) {
		//Using builder to get the object in a single line of code and 
                //without any inconsistent state or arguments management issues		
		
		Computer computer=new Computer.ComputerBuilder("550", "32").setBluetoothEnabled(true)
				.setGraphicsCardEnabled(true).build();
	}

}
