/******************************************************************************
    if you have same Character string like "aaa" the the subsequences of this tring result some
    repetaive stings there fore we intraduce the HashSet which contains only uniqe values
*******************************************************************************/
import java.util.HashSet;
public class Main
{   
   // hash declaration 
   //first import java.util.HastSet
   //HastSet<type> name = new HastSet<>();
    public static void subsequences(String str,int Index, String NewString,HashSet<String> set){
        if (Index == str.length()){
            //if set already contains NewString the do nothing 
            if(set.contains(NewString)){
                return;
            }else{
                //if set dose not contains NewString the add that to the set and print it
                System.out.println(NewString);
                set.add(NewString);
                return;
            }
        } 
        
        char currentChar = str.charAt(Index);
        //to be
        subsequences(str,Index+1,NewString+currentChar,set);
        
        //not to be
        subsequences(str,Index+1,NewString,set);
    }
    
	public static void main(String[] args) {
	    HashSet<String> set = new HashSet<>();
	    String str = "aaa";
	    subsequences(str,0,"",set);
	}
}//output 
// aaa
// aa
// a

