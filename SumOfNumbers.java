/******************************************************************************
                recusion (function that call itself)
*******************************************************************************/
//simpel program tha shows how recusion works (addition of first n numbers)
public class Main
{
    public static void sumOfNumbers(int i,int n,int sum){
        //base case
        if(i>n){
            System.out.print(sum);
            return;
        }
        //what function do
        sum += i;
        //recusion
        sumOfNumbers(i+1,n,sum);
        }
	public static void main(String[] args) {
	    sumOfNumbers(1,5,0);
		
	}
}//output 15
