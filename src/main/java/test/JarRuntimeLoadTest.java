package test;

import com.jar.test.JarLoadTest;

public class JarRuntimeLoadTest {

	public static void main(String[] args) {
		System.out.println("Calling External jar ");
		JarLoadTest test=new JarLoadTest();
		test.printMe();

	}

}
