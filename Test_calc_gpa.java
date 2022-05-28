import static org.junit.Assert.*;

import org.junit.Test;

public class Test_calc_gpa {

	// Testing using boundaries value technique
	// out of boundaries
	@Test (expected = Exception.class)
	public void testCase1() throws Exception {
		int[] marks = new int[] { -1,-1,-1,-1,-1,-1 };
		int[] weights = new int[] { 3, 3, 3, 3, 3, 3 };
		Calc_gpa.calc_gpa(marks, weights);
	}
	
	// minimum value
	@Test
	public void testCase2() throws Exception {
		int[] marks = new int[] { 0, 0, 0, 0, 0, 0 };
		int[] weights = new int[] { 3, 3, 3, 3, 3, 3 };
		double expected = 0;
		double actual = Calc_gpa.calc_gpa(marks, weights);
		assertEquals(expected, actual,0.01);
	}
	
	@Test
	public void testCase3() throws Exception {
		int[] marks = new int[] { 1,1,1,1,1,1};
		int[] weights = new int[] { 3, 3, 4, 3, 2, 3 };
		double expected = 0;
		double actual = Calc_gpa.calc_gpa(marks, weights);
		actual = Math.round(actual*100.0)/100.0;
		assertEquals(expected, actual,0.01);
	}
	
	@Test
	public void testCase4() throws Exception {
		int[] marks = new int[] { 65, 70, 40, 61, 70, 80 };
		int[] weights = new int[] { 3, 3, 4, 3, 2, 3 };
		double expected = 1.26;
		double actual = Calc_gpa.calc_gpa(marks, weights);
		assertEquals(expected, actual,0.01);
	}
	
	@Test
	public void testCase5() throws Exception {
		int[] marks = new int[] { 70, 70, 80, 61, 70, 80 };
		int[] weights = new int[] { 3, 4, 4, 3, 2, 3 };
		double expected = 1.96;
		double actual = Calc_gpa.calc_gpa(marks, weights);
		assertEquals(expected, actual,0.01);
	}
	
	@Test
	public void testCase6() throws Exception {
		int[] marks = new int[] { 75, 68, 96, 63, 70, 80 };
		int[] weights = new int[] { 3, 4, 4, 3, 2, 3 };
		double expected = 2.19;
		double actual = Calc_gpa.calc_gpa(marks, weights);
		assertEquals(expected, actual,0.01);
	}
	
	@Test
	public void testCase7() throws Exception {
		int[] marks = new int[] { 75, 68, 96, 76, 86, 91 };
		int[] weights = new int[] { 3, 4, 4, 3, 2, 3 };
		double expected = 2.65;
		double actual = Calc_gpa.calc_gpa(marks, weights);
		assertEquals(expected, actual,0.01);
	}

	@Test
	public void testCase8() throws Exception {
		int[] marks = new int[] { 81, 88, 79, 84, 95, 91 };
		int[] weights = new int[] { 3, 4, 4, 3, 2, 3 };
		double expected = 3.08;
		double actual = Calc_gpa.calc_gpa(marks, weights);
		assertEquals(expected, actual,0.01);
	}
	
	@Test
	public void testCase9() throws Exception {
		int[] marks = new int[] { 99, 99, 99, 99, 99, 99 };
		int[] weights = new int[] { 3, 4, 4, 3, 2, 3 };
		double expected = 4;
		double actual = Calc_gpa.calc_gpa(marks, weights);
		assertEquals(expected, actual,0.01);
	}
	
	@Test
	public void testCase10() throws Exception {
		int[] marks = new int[] { 100, 100, 100, 100, 100, 100 };
		int[] weights = new int[] { 3, 4, 4, 3, 2, 3 };
		double expected = 4;
		double actual = Calc_gpa.calc_gpa(marks, weights);
		assertEquals(expected, actual,0.01);
	}

	
	
	@Test (expected = Exception.class)
	public void testCase11() throws Exception {
		int[] marks = new int[] { 101, 101, 101, 101, 101, 101 };
		int[] weights = new int[] { 3, 3, 3, 3, 3, 3 };
		Calc_gpa.calc_gpa(marks, weights);
	}

}
