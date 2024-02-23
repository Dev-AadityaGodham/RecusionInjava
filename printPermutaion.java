/******************************************************************************
            print all possible permutaion of string
*******************************************************************************/

public class Main
{   
    public static void printPermutaion(String str, String combination){
        if(str.length()==0){
            System.out.println(combination);
            return;
        }
        
        
        for(int i=0;i<str.length();i++){
            char currentChar=str.charAt(i);
            String newString = str.substring(0,i) + str.substring(i+1);
            printPermutaion(newString,combination+currentChar);
        }
    }
	public static void main(String[] args) {
		String str ="abc";
		printPermutaion(str,"");
	}
}//output
// abc
// acb
// bac
// bca
// cab
// cba
