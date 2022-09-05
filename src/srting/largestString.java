package srting;

public class largestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//this is laxicographic sequence means a<b;
		String[] arr= {"arindam","panja","sabang"};
		String large=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(large.compareTo(arr[i])<0) {
				large=arr[i];
			}
		}
		System.out.println(large);
	}

}
//there are two function one is compareTo() =)here A !=a;
//other is comepareToIgnoreCase() A=a;