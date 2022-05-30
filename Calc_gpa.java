import java.util.Scanner;

public class Calc_gpa {
	int[] marks = new int[6];
	int[] weights = new int[6];
	
	public static void main(String args[]) throws Exception {
		Calc_gpa cg = new Calc_gpa();
		cg.solve();
	}

	public void solve() throws Exception {
		System.out.println("enter grades and weights.");
		takeInput(this.marks, this.weights);
		double result = calc_gpa(this.marks, this.weights);
		System.out.println("your final result is " + Math.round(result*100.0)/100.0);
		System.out.println("You got " + getECTS_stub(result));
	}

	public void takeInput(int[] marks, int[] weights) {

		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < marks.length; i++) {
			marks[i] = scanner.nextInt();
			weights[i] = scanner.nextInt();
		}
		scanner.close();
	}

	public static double calc_gpa(int[] points, int[] weights) throws Exception {
		double den = 0, num = 0;
		float[] marks = convert_to_gpa(points);
		for (int i = 0; i < marks.length; i++) {
			num += marks[i] * weights[i];
		}
		for (int j = 0; j < marks.length; j++) {
			den += weights[j];
		}
		return num / den;
	}

	public static String getECTS_stub(double gpa) {
		if (gpa == 4) {
			return "A+";
		} else if (gpa == 3) {
			return "B";
		} else if (gpa == 2.3) {
			return "C+";
		}
		return "unknown";
	}
	public static String getECTS(double gpa) {
		
		return "ECTS";
	}

	public static String getRank(double gpa) throws Exception {
		if(gpa < 0) {
			throw new Exception();
		}
		if (gpa < 60) {
			return "F";
		} else if (gpa >= 97 && gpa <= 100) {
			return "A+";
		} else if (gpa >= 93 && gpa < 97) {
			return "A";
		} else if (gpa >= 90 && gpa < 93) {
			return "A-";
		} else if (gpa >= 87 && gpa < 90) {
			return "B+";
		} else if (gpa >= 83 && gpa < 87) {
			return "B";
		} else if (gpa >= 80 && gpa < 83) {
			return "B-";
		} else if (gpa >= 77 && gpa < 80) {
			return "C+";
		} else if (gpa >= 73 && gpa < 77) {
			return "C";
		} else if (gpa >= 70 && gpa < 73) {
			return "C-";
		} else if (gpa >= 67 && gpa < 70) {
			return "D+";
		} else if (gpa >= 60 && gpa < 67) {
			return "D";
		}
		return "unknown";
	}

	public static float[] convert_to_gpa(int[] marks) throws Exception {
		float gpa[] = new float[6];
		for (int i = 0; i < marks.length; i++) {
			
			if(marks[i] < 0) throw new Exception();
			if(marks[i] > 100) throw new Exception();
			if (marks[i] < 60) {
				gpa[i] = 0.0f;
			} else if (marks[i] >= 94) {
				gpa[i] = 4f;
			} else if (marks[i] >= 90) {
				gpa[i] = 3.7f;
			} else if (marks[i] >= 87) {
				gpa[i] = 3.3f;
			} else if (marks[i] >= 83) {
				gpa[i] = 3f;
			} else if (marks[i] >= 80) {
				gpa[i] = 2.7f;
			} else if (marks[i] >= 77) {
				gpa[i] = 2.3f;
			} else if (marks[i] >= 73) {
				gpa[i] = 2f;
			} else if (marks[i] >= 70) {
				gpa[i] = 1.7f;
			} else if (marks[i] >= 67) {
				gpa[i] = 1.3f;
			} else if (marks[i] >= 60) {
				gpa[i] = 1.0f;
			}
		}
		return gpa;
	}
}
