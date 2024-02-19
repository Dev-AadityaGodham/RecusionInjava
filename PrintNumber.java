/******************************************************************************

                recusion (function that call itself)

*******************************************************************************/
//this is simple program tha show how recusion works
public class Main
{
    public static void PrintNumbers(int n){
        
        //this is base case to overcome the stackoverflow problem
        
        if(n==0){
            return;
        }
        //what wrok w need to do in this function
        System.out.print(n);
        
        //recusion (function that call itself)
        PrintNumbers(n-1);
    }
	public static void main(String[] args) {
		PrintNumbers(5);
	}
}//output 54321
