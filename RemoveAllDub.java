
import java.io.*;

class GFG {
    //remove all duplicates from the string
    
    public static boolean[] map = new boolean[26];
    public static void RemoveAllDub(int index,String str,String NewString){
        if(index == str.length()){
            System.out.print(NewString);
            return;
        }
        
        
        char currentChar = str.charAt(index);
        if (map[currentChar - 'a']==true){
            RemoveAllDub(index+1,str,NewString);
        } else{
            NewString += currentChar;
            map[currentChar - 'a']=true;
            RemoveAllDub(index+1,str,NewString);
        }
    }
   	public static void main (String[] args) {
	    String str = "axbcxxa";
		RemoveAllDub(0,str,"");
	}
}//output  axbc

