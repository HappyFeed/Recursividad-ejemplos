package ui;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {
    Main m= new Main();
	void setUpEscenary1() {
		
	}
	
	@Test
	void testFactorial() {
		assertTrue("fail",m.factorial(3)==6);
		assertTrue("fail",m.factorial(5)==120);
		assertTrue("fail",m.factorial(0)==1);
	}
	@Test
	void testFibonachi() {
		assertTrue("fail",m.fibonachi(5)==5);
		assertTrue("fail",m.fibonachi(0)==0);
		assertTrue("fail",m.fibonachi(8)==21);
	}
	@Test
	void testSuma() {
		int[] a= {1,2,3};
		int[] b= {1,2,3,4,5};
		int[] c= {1,2,3,4,5,6,7};
		assertTrue("fail",m.suma(a.length-1,a)==6);
		assertTrue("fail",m.suma(b.length-1,b)==15);
		assertTrue("fail",m.suma(c.length-1,c)==28);
	}

}
