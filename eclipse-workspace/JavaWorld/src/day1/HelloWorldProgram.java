package day1;

public class HelloWorldProgram {
	public String getMessage() {
        String str = "Hello World";
		return str;
	}
	public static void main(String[] args) {
	    HelloWorldProgram helloWorld = new HelloWorldProgram();
	    helloWorld.getMessage();
		System.out.println(helloWorld.getMessage());
	}
}