/******************************************************************************
      print all the subset of first n natural numbers             
*******************************************************************************/
import java.util.*;
public class Main
{   
    public static void printSubset(ArrayList<Integer> subSet){
        for(int i=0;i<subSet.size();i++){
            System.out.print(subSet.get(i));
        }
        System.out.println();
    }
    public static void FindSubSet(int n, ArrayList<Integer> subSet){
        if (n==0){ 
            printSubset(subSet);
            return;
        }
        //to be
        subSet.add(n);
        FindSubSet(n-1,subSet);
       
        //not to be
        subSet.remove(subSet.size()-1);
        FindSubSet(n-1,subSet);
    }
	public static void main(String[] args) {
	    int n=3;
	    ArrayList<Integer> subSet = new ArrayList<>();
	    FindSubSet(3,subSet);
	}
}
// 321
// 32
// 31
// 3
// 21
// 2
// 1


