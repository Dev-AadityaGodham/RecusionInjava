/******************************************************************************
                        TowerOfHanoi
        The Tower of Hanoi is a mathematical problem formed of three towers. 
        The purpose of the puzzle is to push the whole stack to another bar. 
        While moving the stacks, we need to obey some simple rules: we can only remove one disk at a time.
*******************************************************************************/

public class Main
{
    
    public static void TowerOfHanoi(int n , String sorce, String helper , String destination){
        //base case
        if(n==1){
            System.out.println("Disk "+n+" going from "+sorce+" to "+destination);
            return;
        }
        //first we need to move n-1 disks to the helper tower
        TowerOfHanoi(n-1,sorce ,destination, helper);
        //this will keed track of the disks and towers
        System.out.println("Disk "+n+" going from "+sorce+" to "+destination);
        
        //now this will move all n-1 disks from helper to the destination by using sorce as helper
        TowerOfHanoi(n-1,helper,sorce,destination);
        
    }
	public static void main(String[] args) {
		int n=2;
		TowerOfHanoi(n,"src","helper","des");
	}
}//output
// Disk 1 going from src to helper
// Disk 2 going from src to des
// Disk 1 going from helper to des
