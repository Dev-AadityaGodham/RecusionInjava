/******************************************************************************
                recusion (function that call itself)
*******************************************************************************/
//this is simple program to calculate factorial by using recusion
//i done this program as sum of first n numbers below there is another way to do same thing
public class Main
{
    public static void CalculateFactorial(int n , int factorial){
        //base case 
        if(n==1 || n==0){
            System.out.print(factorial);
            return;
        }
        //waht to do
        factorial *= n;
        //recusion
        CalculateFactorial(n-1,factorial);
    }
    
    
	public static void main(String[] args) {
	    CalculateFactorial(5,1);
		
	}
}//output 120

//------------------------------------------OR-------------------------------------
// public class Main
// {
//     public static int CalculateFactorial(int n){
//         //base case 
//         if(n==1 || n==0){
//             return 1;
//         }
        
//         //waht to do and recusion
//         int factorial_nm1=CalculateFactorial(n-1);
//         int factorial_n= n*factorial_nm1;
//         return factorial_n;
//     }
    
    
// 	public static void main(String[] args) {
// 	    int ans=CalculateFactorial(5);
// 	    System.out.print(ans);
		
// 	}
// }//output 120
