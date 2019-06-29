package day1;

public class MarkValidator2 {
	
	static String markGrade(int mark) {
		String grade = "";
		mark = mark/10;
		switch(mark) {
			case 6:
					grade = "D";
					break;
			case 7:
					grade = "C";
					break;
					
			case 8: grade = "B";
					break;
					
			case 9: grade = "A";
					break;
			default:
					break;
		}
		//System.out.println(grade);
		return grade;
		
	}
	
	public static void main(String[] args) {
		System.out.println(markGrade(75));
	}
}
