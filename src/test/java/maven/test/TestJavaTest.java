package maven.test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestJavaTest {
	

	@Test
	public void testAdd(){		
		TestJava test = new TestJava();
		int actual = test.add(2, 6);
		int expected = 8;
		assertEquals(expected, actual);		
	}
	
	@Test
	public void testAdd2(){		
		TestJava test = new TestJava();
		int actual = test.add(4, 6);
		int expected = 10;
		assertEquals(expected, actual);		
	}
	
	@Test
	public void testAdd3(){		
		TestJava test = new TestJava();
		int actual = test.add(8, 6);
		int expected = 14;
		assertEquals(expected, actual);		
	}
	
	@Test
	public void testSub(){		
		TestJava test = new TestJava();
		int actual = test.sub(6, 2);
		int expected = 4;
		assertEquals(expected, actual);		
	}
	
	
	
	

}
