package Line_Comparison;

public class Line_Comparison {
	
	public static void main(String[] args) {
		
		String line1 = "Hi This is Java";
		String line2 = "Hi This is Java";
		String line3 = "hi this is java";
		String line4 = "HI this is java";
		
		System.out.println(line1.compareTo(line2));
		
		System.out.println(line1.compareTo(line3));
		
		System.out.println(line1.compareTo(line4));
	}

}
