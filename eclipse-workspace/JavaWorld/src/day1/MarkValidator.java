package day1;

import java.util.Scanner;

public class MarkValidator {

	public String markGrade(int mark) {
		String grade="";
		if (mark >= 90) {
			grade = "A";
		} else if (mark >= 75) {
			grade = "B";
		} else if (mark >= 60) {
			grade = "C";
		} else {
			grade = "D";
		}
		System.out.println(grade);
		return grade;
	}
	
	public String isPass(int mark) {
		String res="";
		if (mark >= 40) {
			res = "Pass";
		} else {
			res = "Fail";
		}
		System.out.println(res);
		return res;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks");
		int mark = sc.nextInt();
		MarkValidator mvobj = new MarkValidator();
		mvobj.isPass(mark);
		mvobj.markGrade(mark);
		sc.close();
	}

}
