import java.util.Scanner;

public class Main
{
    public static void main(String args[]){
        int[] marks = {90, 90, 80, 70, 40, 80};
        float[] gpas = conver_to_gpa(marks);
        
        int[] weights = {4, 3,3,2,3, 4};
        double gpa = calc_gpa(marks, weights);
        System.out.println(gpa);
        System.out.println(getRank(gpa));
        for (int i = 0; i < gpas.length; i++){
            System.out.print(gpas[i] + " ");
        }
        
    }
	public static void takeInput(int[] marks, int[] weights) {
		
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < 6; i++) {
			marks[i] = scanner.nextInt();
			weights[i] = scanner.nextInt();
			}
		scanner.close();
	}
	
	public static double calc_gpa (int[] marks, int[] weights){
		int den = 0, num = 0;
		for(int i = 0; i < marks.length; i++) {
			den += weights[i];
		}
		for(int i = 0; i < marks.length; i++) {
			num += marks[i]*weights[i];
		}
		double gpa = num/(double)den;
		return gpa;
	}
	
	
	
	public static String getRank(double gpa) {
		if(gpa<60)
        {
            return "F";
        }
        else if(gpa>=97 && gpa<=100)
        {
            return "A+";
        }
        else if(gpa>=93 && gpa<97)
        {
        	return "A";
        }
        else if(gpa>=90 && gpa<93)
        {
        	return "A-";
        }
        else if(gpa>=87 && gpa<90)
        {
        	return "B+";
        }
        else if(gpa>=83 && gpa<87)
        {
        	return"B";
        }
        else if(gpa>=80 && gpa<83)
        {
         	return "B-";
        }
        else if(gpa>=77 && gpa<80)
        {
        	return "C+";
        }
        else if(gpa>=73 && gpa<77)
        {
        	return "C";
        }
        else if(gpa>=70 && gpa<73)
        {
        	return "C-";
        }
        else if(gpa>=67 && gpa<70)
        {
        	return "D+";
        }
        else if(gpa>=60 && gpa<67)
        {
        	return "D";
        }
        return "unknown";
    }
	
		
	public static float[] conver_to_gpa(int[] marks) {
		float gpa[] = new float[6];
		for(int i = 0; i < marks.length; i++){
		    
		if(marks[i]<60)
        {
            gpa[i] = 0.0f;
        }
        else if(marks[i]>=94 && marks[i]<=100)
        {
            gpa[i] = 4f;
        }
        
        else if(marks[i]>=90 && marks[i]<94)
        {
        	gpa[i] = 3.7f;
        }
        else if(marks[i]>=87 && marks[i]<90)
        {
        	gpa[i] = 3.3f;
        }
        else if(marks[i]>=83 && marks[i]<87)
        {
         	gpa[i] = 3f;
        }
        else if(marks[i]>=80 && marks[i]<83)
        {
        	gpa[i] = 2.7f;
        }
        else if(marks[i]>=77 && marks[i]<80)
        {
        	gpa[i] = 2.3f;
        }
        else if(marks[i]>=73 && marks[i]<77)
        {
        	gpa[i] = 2f;
        }
        else if(marks[i]>=70 && marks[i]<73)
        {
        	gpa[i] = 1.7f;
        }
        else if(marks[i]>=67 && marks[i]<70)
        {
        	gpa[i] = 1.3f;
        }
        else if(marks[i]>=60 && marks[i]<67)
        {
        	gpa[i] = 1.0f;
        }
    }
    return gpa;
}
	       
}
