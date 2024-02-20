/******************************************************************************
                        ReversString
*******************************************************************************/

public class Main
{
    
   public static void ReversString(int index,String str){
       if(index==0){
           System.out.print(str.charAt(index));
           return;
       }
       System.out.print(str.charAt(index));
       ReversString(index-1,str);
   }
	public static void main(String[] args) {
		String str="abcdefg";
		ReversString(str.length()-1,str);
	}
}//gfedcba
