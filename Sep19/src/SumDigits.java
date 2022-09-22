
public class SumDigits {

	
	//solution
	public static int sumDigits(String s) {
		
		int sum = 0;
		char c;
		
		for(int i = 0; i < s.length(); i++) {
			c = s.charAt(i);
			if(Character.isDigit(c)) {
				sum += Integer.parseInt(String.valueOf(c));
			}
		}
		
		
		return sum;
	}
	
	
	//main for testing
	public static void main(String[] args) {
		//expect 10
		System.out.println(sumDigits("ab23cd5"));
		
		//expect 0
		System.out.println(sumDigits("abcdefg"));
		
		//expect 20
		System.out.println(sumDigits("12344321"));

	}

}
