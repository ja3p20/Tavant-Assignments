package day1;

import java.util.Scanner;

public class MarkValidator {

	public boolean isPass(int mark) {
		return mark >= 40 ? true : false;
		
	}
	
	public String markGrade(int mark) {
		if (mark>=0 && mark <=100) {
			if (isPass(mark)) {
				if (mark > 90)
					return "Grade A";
				if (mark > 75)
					return "Grade B";
				if (mark > 60)
					return "Grade C";
				return "Grade D";
			}
			return "Fail";
		}
		return "Enter Valid Marks to Calculate Grade";
		
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your marks out of hundred");
		int mark = scanner.nextInt();
		MarkValidator markValidator = new MarkValidator();
		markValidator.isPass(mark);
		System.out.println(markValidator.markGrade(mark));
		scanner.close();
		
	}
}