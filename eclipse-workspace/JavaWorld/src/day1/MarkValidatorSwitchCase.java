package day1;
import java.util.Scanner;

public class MarkValidatorSwitchCase {

	public boolean isPass(int mark) {
		return mark >= 40 ? true : false;	
	}
	public String markGrade(int mark)
	{
		if (mark >= 0 && mark <=100) {
			if(isPass(mark)) {
				for(int i=1;i<=4;i++)
				{
					switch(i)
					{
					case 1: if( mark >90) return "Grade A";
							break;
					case 2: if(mark >75 && mark<=90) return "Grade B";
							break;
					case 3: if(mark >60 && mark<=75) return "Grade C";
							break;
					case 4: if(mark <= 60) return "Grade D";
							break;
					}
				}
			}
			return "Fail";
		} else {
			return "Enter valid marks";
		}
		
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your marks out of hundred");
		int mark = scanner.nextInt();
		MarkValidatorSwitchCase markValidatorSwitchCase  = new MarkValidatorSwitchCase();
		System.out.println(markValidatorSwitchCase.markGrade(mark));
		scanner.close();
	}
}

/*
 -------OR-------
 
 public class MarkValidatorSwitchCase {
	
	public boolean isPass(int mark)
	{
		if(mark>=40)
			return true;
		else
			return false;
	}
	
	public String markGrade(int mark)
	{
		String grade = "";
		if(mark>=0 && mark<=100) {
			if (isPass(mark)) {
				switch(mark)
				{
					case 100: case 99: case 98: case 97: case 96: case 95: case 94: case 93: case 92: case 91:
						grade = "Grade A";
						break;
					
					case 90: case 89: case 88: case 87: case 86: case 85: case 84: case 83: case 82: case 81: case 80:
					case 79: case 78: case 77: case 76:
						grade = "Grade B";
						break;
					
					case 75: case 74: case 73: case 72: case 71: case 70: case 69: case 68: case 67: case 66: case 65:
					case 64: case 63: case 62: case 61:
						grade = "Grade C";
						break;
					
					default:
						grade = "Grade D";
						break;
				}
			} else {
				grade = "Fail";
			}
		} else {
			grade = "Enter valid marks";
		}
		
		return grade;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your marks");
		int mark = scanner.nextInt();
		MarkValidatorSwitchCase markValidatorSwitchCase  = new MarkValidatorSwitchCase();
		System.out.println(markValidatorSwitchCase.markGrade(mark));
		scanner.close();
	}
}

 */
