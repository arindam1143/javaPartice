package srting;

public class sortestpath {
	public static float sortedpath(String str) {
		int x=0;
		int y=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='N') {
				y++;
			}
			else if(str.charAt(i)=='S') {
				y--;
			}
			else if(str.charAt(i)=='E') {
				x++;
			}
			else {
				x--;
			}
			
		}
		int x2=x*x;
		int y2=y*y;
		return (float)Math.sqrt(x2+y2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="NS";//"WNEENESENNN";
		System.out.print(sortedpath(str));
	}

}
