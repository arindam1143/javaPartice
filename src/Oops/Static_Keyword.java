package Oops;


class Test{
	//static int a=10;//if a is static then a increasing time and time when call the constractor this is create in method and class area
	int a=10; //if a is not static then not increasing in many time this is create heap memory 
	Test(){
		a++;
		System.out.println(a);
	}
}
public class Static_Keyword {
	// static keyword only use class level not use in local level
	/*static int a=10; //this is true
	 void m() {
		static int b=20;//this is not true
	}
	*/
	static {
		System.out.print("hi");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(Test.a);//this is possible for static keyword
		new Test();
		new Test();
		
	}
	static {
		System.out.print("hello");
	}
	static {
		for(int i=0;i<1000;i++) {
			System.out.println(i);
		}
	}

}
