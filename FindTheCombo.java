/******************************************************************************

purane phones me jo keypad hota he na to specific number pe kya possible outcomes
                        ate the vo find krna he

*******************************************************************************/

public class Main
{   
    //first declare array according to the keypad of old phones
    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    
    
    public static void printCombo(String str,int index,String comdination){
        
        if (index==str.length()){
            System.out.println(comdination);
            return;
        } 
        char currentChar = str.charAt(index);
        
        //string mapping use to map the current number mens currentChar is 2 and 2 - 0 is 2 there fore 2nd index of keypad
        String mapping = keypad[currentChar - '0'];
        //this for loop use for get "abc" these Characters 
        for (int i=0;i< mapping.length() ;i++ ){
            printCombo(str,index+1,comdination+mapping.charAt(i));
        } 
    }
	public static void main(String[] args) {
	    String str ="23";
	    printCombo(str,0,"");
	}
}//output
// dg
// dh
// di
// eg
// eh
// ei
// fg
// fh
// fi
