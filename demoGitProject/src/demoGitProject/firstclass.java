package demoGitProject;

public class firstclass {

	public static void main(String[] args) {
		int x=5;
		int y=7;
		System.out.println("Adding two numbers");
		System.out.println("Result is: "+ add(x,y));
		//add(x,y);
		System.out.println("Hi");

	}
	
	public static int add(int x, int y){
		int result=x+y;
		return result ;
	}

}
