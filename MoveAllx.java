//move all x at the end of the string using recusion
import java.io.*;

class GFG {
    //move all x at the end of the string
   public static void MoveAllx(String str,int index,int count,String newString){
       if(index == str.length()){
           for (int i=0;i<count ;i++ ){
               newString += 'x';
           } 
           System.out.print(newString);
           return;
       }
       
       char currentchar=str.charAt(index);
       if(currentchar == 'x'){
           count ++;
           MoveAllx(str,index+1,count,newString);
       }else{
           newString += currentchar;
           MoveAllx(str,index+1,count,newString);
       }
   }
	public static void main (String[] args) {
	    String str = "axbcxxa";
		MoveAllx(str,0,0,"");
	}
}//output  abcaxxx

