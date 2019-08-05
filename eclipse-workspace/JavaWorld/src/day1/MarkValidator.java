package day1;

import java.util.Scanner;

public class MarkValidator {

	public String markGrade(int mark) {
		String grade="";
		if (mark >= 90 && mark <=100) {
			grade = "A";
		} else if (mark >= 75 && mark <90) {
			grade = "B";
		} else if (mark >= 60 && mark <75) {
			grade = "C";
		} else {
			grade = "D";
		}
		System.out.println(grade);
		return grade;
	}
	
	public String isPass(int mark) {
		String result="";
		if (mark >= 40 && mark <=100) {
			result = "Pass";
			markGrade(mark);
		} else if (mark >= 0  && mark <40){
			result = "Fail";
			markGrade(mark);
		}
		else {
			result = "Please enter valid marks";
		}
		System.out.println(result);
		return result;
	}
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your marks out of hundred");
		int mark = scanner.nextInt();
		MarkValidator mvobj = new MarkValidator();
		mvobj.isPass(mark);
		scanner.close();
	}

}
