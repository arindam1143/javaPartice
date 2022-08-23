package apanacollage;

public class primeinRange {

	public static boolean isprime(int n){
        if(n==2){
            return true;
        }
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void primeinRange(int low,int high){
        for(int i=low;i<=high;i++){
            
            if(isprime(i)==true){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args){
        boolean ans=isprime(12);
        System.out.println(ans);
        primeinRange(2,20);
    }

}
