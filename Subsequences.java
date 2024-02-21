/******************************************************************************
                        Subsequences
*******************************************************************************/

public class Main
{
	public static void Subsequences(String str,int Index,String NewString){
	    if (Index==str.length()){
	        System.out.println(NewString);
	        return;
	    } 
	    char CurrentChar = str.charAt(Index);
	    
	    //to be
	    Subsequences(str,Index+1,NewString+CurrentChar);
	    
	    //not to bew
	    
	    Subsequences(str,Index+1,NewString);
	}
   	public static void main (String[] args) {
	    String str = "abc";
		Subsequences(str,0,"");
	}
}//out put
// abc
// ab
// ac
// a
// bc
// b
// c
