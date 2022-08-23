package apanacollage;

public class funtionOverloading {
	//a function have tow parameters type is int both of tow
	public static int sum(int a,int b) {
		return a+b;
	}
	/*
	 * this is not function overloading return type dose not matter in this case
	public static float sum(int a,int b) {
		return a+b;
	}*/
	//this function have three parameters three are int type
	public static int sum(int a,int b,int c) {
		return a+b+c;
	}
    // this function have tow parameters both are float type
	public static float sum(float a,float b) {
		return a+b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(5,6));
		System.out.println(sum(5,6,3));
		System.out.println(sum(51f,6f));

	}

}
