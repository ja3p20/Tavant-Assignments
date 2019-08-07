package day1;

public class HelloWorldProgram {
	public String getMessage() {
        String str = "Hello World";
		return str;
	}
	public static void main(String args[]) {
	    HelloWorldProgram hwobj = new HelloWorldProgram();
	    hwobj.getMessage();
		System.out.println(hwobj.getMessage());
	}
}
