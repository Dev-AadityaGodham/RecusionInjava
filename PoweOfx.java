public class Main
{
    
    public static int CalculatePowerOfx(int x ,int n){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        
        int powerOfxnm1=CalculatePowerOfx(x,n-1);
        int powerOfx = x*powerOfxnm1;
        return powerOfx;
        
    }
	public static void main(String[] args) {
		int power=CalculatePowerOfx(3,2);
		System.out.print(power);
	}
}//9

//--------------------------------or-------------------------------

public class Main
{
    
    public static int CalculatePowerOfx(int x ,int n){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        
        if(n%2==0){
            return CalculatePowerOfx(x,n/2)*CalculatePowerOfx(x,n/2);
        }else{
            return CalculatePowerOfx(x,n/2)*CalculatePowerOfx(x,n/2)*x;
        }
        
    }
	public static void main(String[] args) {
		int power=CalculatePowerOfx(3,2);
		System.out.print(power);
	}
}//9
