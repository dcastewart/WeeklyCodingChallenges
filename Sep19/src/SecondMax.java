import java.util.Arrays;
import java.util.Scanner;

public class SecondMax {

	
	//solution
	
	public static void secondMax(int N, int[][] vals) {
		
		for(int i = 0; i < N; i++) {
			Arrays.sort(vals[i]);
			System.out.println(vals[i][1]);
		}
		
	}
	
	
	
	
	
	//INPUTTED VALUES MUST BE SEPARATED BY A SINGLE SPACE WITH 3 VALUES PER LINE
	//(just like the problem statement)
	
	//main for inputs and testing
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Number of values: ");
		int N = s.nextInt();
		
		int[][] x = new int[N][3];
		
		System.out.println("Insert values in groups of 3: ");
		
		//consume '\n'
		s.nextLine();
		
		for(int i = 0; i < N; i++) {
			
			String[] line = s.nextLine().strip().split(" ");
			x[i][0] = Integer.parseInt(line[0]);
			x[i][1] = Integer.parseInt(line[1]);
			x[i][2] = Integer.parseInt(line[2]);
			
		}
		
		System.out.println("Solutions: ");
		secondMax(N, x);
		
		s.close();

	}

}
