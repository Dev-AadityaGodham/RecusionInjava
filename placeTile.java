/******************************************************************************
      fint total number to place tiles of size 1xm for nxm              
*******************************************************************************/

public class Main
{   
    public static int placeTile(int n , int m){
        
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        
        //place vertically
        int VerticlPlace=placeTile(n-m,m);
        
        
        //place horizontally
        int HorizontalPlace=placeTile(n-1,m);
        
        return VerticlPlace + HorizontalPlace;
    }
	public static void main(String[] args) {
	    int n=4,m=2;
		System.out.println("Total number of ways you can place 1x"+m+" Tiles for "+n+"x"+m+" size is "+placeTile(n,m));
	}
// }output Total number of ways you can place 1x2 Tiles for 4x2 size is 5
