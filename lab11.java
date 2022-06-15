package Lab11;

import junit.framework.Test;
import junit.framework.TestSuite;

class UnitTest {

	public static boolean Numb(int a) {
		boolean res;
		if (a % 2 == 0) {
			System.out.print("THE NUMBER IS EVEN: " + a);
			res= true;
		} else {
			System.out.print("THE NUMBER IS ODD: " + a);
			res= false;
		}
		return res;
	}

	public static boolean Prime(int num) {
		boolean tes;
		boolean flag = false;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {

				flag = true;
				break;
			}

		}
		if (!flag) {
			System.out.println(num + " THE NUMBER IS PRIME NUMBER");
			tes= true;
		} else {
			System.out.println(num + "THE NUMBER IS NOT A PRIME NUMBER");
			tes= false;
		}
		return tes;


	}

	public static int Factorial(int fac) {

		int res = 1;
		for (int i = 1; i <= fac; i++) {

			res = res * i;
		}
		
		return res;
	}

}

public class lab11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UnitTest.Factorial(5);
		UnitTest.Numb(2);
		System.out.println();
		UnitTest.Prime(3);

	}

	public static Test suite() {
		TestSuite suite = new TestSuite(lab11.class.getName());
		//$JUnit-BEGIN$

		//$JUnit-END$
		return suite;
	}

}
