/******************************************************************************
                        FibonachiSeries
*******************************************************************************/

public class Main
{
    
    public static void Fibonachi(int n , int a , int b){
        if(n==0){
            return;
        }
        //fibonachi is the adddtion of last two numbers
        int c = a+b;
        System.out.print(c);
        
        //this will calculate n-1 and take last b value and new c value
        Fibonachi(n-1,b,c);
    }
	public static void main(String[] args) {
		int n=7;
		int a=0;
		int b=1;
		System.out.print(a);
		System.out.print(b);
		//n-2 becuse first two terms are a and b which are 0 and 1
		Fibonachi(n-2,a,b);
	}
}//output 0112358
