//******************************************************
//              Find the Occurance
//******************************************************
import java.io.*;

class GFG {
    //first is not equal to zero becuse string countiong starts from zero 
    //there fore what if a found at zero itt show error
    public static int first =-1;
    public static int last =-1;
    public static void Occurance(char Element,String str,int index){
        if(index==str.length()){
            System.out.println(Element+" first time at "+first);
            System.out.println(Element+" last time at "+last);
            return;
        }
        //CurrentElement use to keep track at character and index
        char CurrentElement = str.charAt(index);
        if(CurrentElement==Element){
            if(first==-1){
                first=index;
            }else{
                last = index;
            }
        }
        Occurance(Element,str,index+1);
    }
	public static void main (String[] args) {
	    String str = "abca";
		Occurance('a',str,0);
	}
}

