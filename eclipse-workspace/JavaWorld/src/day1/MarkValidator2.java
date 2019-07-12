package day1;

public class MarkValidator2 {
	
	static String markGrade(int mark) {
		
		String grade = "";
		for(int i=1;i<=4;i++) {
			switch(i) {
			case 1:
					if(mark >=60 && mark <74) grade = "C";
					break;
					
			case 2: if(mark >=75 && mark <90) grade = "B";
					break;
					
			case 3: if(mark >=90 && mark <=100) grade = "A";
					break;
			case 4:
					grade = "D";
					break;
			}
		}
		
		//System.out.println(grade);
		return grade;
		
	}
	
	public static void main(String[] args) {
		System.out.println(markGrade(45));
	}
}


//or

/*
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
		System.out.println(markGrade(90));
	}
}

*/


