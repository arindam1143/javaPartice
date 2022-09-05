package srting;

public class stringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder st=new StringBuilder();
		String str="";
		for(char i='a';i<='z';i++) {
			st.append(i);
		}
		//st not astring this is a obj
		System.out.println(st);
		str=st.toString();
		//this is a string
		System.out.print(str);
	}

}
/*
  this is possible because this is a obj
public class Main
{
	public static void main(String[] args) {
    StringBuilder st=new StringBuilder("avi");
    String str=st.toString();
    System.out.println(str);
	}
}
int a=10;
a.toString()//not possible
Integer a=10;
a.toString()// this is possible
*/