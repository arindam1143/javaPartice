package Oops;

/*public class Method_Overloading {
	
	static int add(int a,int b) {
		return a+b;
	}
	static int add(int a,int b,int c) {
		return a+b+c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(10,20));
		System.out.println(add(10,20,30));
		

	}

}
 Method Overloading: changing no. of arguments
out put=>30,60
*//*
public class Method_Overloading {
	
	static int add(int a,int b) {
		return a+b;
	}
	//static int add(double a, double b) {
		//return (int)(a+b);
	//}
	//^^ this is also possible for method overloading
	static double add(double a, double b) {
		System.out.println("this is doubel method");
		return (a+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(10,20));
		System.out.println(add(10,20.5));

	}

}
*//*
public class Method_Overloading {
	
	static int add(int a,int b) {
		return a+b;
	}
	static double add(int a,int b) {
		return a+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(10,20));

	}

}
this is ambiguity error for same parameter and different parameter
*/

//Can we overload java main() method?
//Yes, by method overloading. You can have any number of main methods in a class by method overloading. 
//But JVM calls main() method which receives string array as arguments only. Let's see the simple example:

public class Method_Overloading {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}