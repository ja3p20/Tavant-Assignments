package day1;
import java.util.Scanner;


public class MarkValidatorSwitchCase {

	public static String markGrade(int mark)
	{
		if (mark >= 0 && mark <=100) {
			for(int i=1;i<=4;i++)
			{
				switch(i)
				{
				case 1: if( mark >=90) return "Grade A";
						break;
				case 2: if(mark >=75 && mark<90) return "Grade B";
						break;
				case 3: if(mark >=60 && mark<75) return "Grade C";
						break;
				case 4: if(mark < 60) return "Grade D";

				}
			}
		} else {
			return "Enter valid marks";
		}
		return null;
		
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your marks");
		int mark = scanner.nextInt();
		System.out.println(markGrade(mark));
		scanner.close();
	}

}


