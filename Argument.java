package CipherSchoolCourse2;

public class Argument {
	
	//this keyword
	
	int arg = 5;
	
	Argument(){
		System.out.println("Hello ! I am defalut constructor");
	}
	Argument(int arg) {
		this();
		this.arg=arg;
	}
	
	public static void main(String[] args) {
		int arg=10;
		
		Argument obj = new Argument();
		
		System.out.println(obj.arg);
	}
}
