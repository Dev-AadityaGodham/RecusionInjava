/******************************************************************************
          //count total paths in a maze to move from (0,0) to (n,m)
*******************************************************************************/

public class Main
{   
    public static int countPaths(int i,int j,int n,int m){
        if (i == n-1 && j==m-1){
            return 1;
        } 
        
        if(i==n || j==m){
            return 0;
        }
        
        //move down
        int moveDown = countPaths(i+1,j,n,m);
        
        //move right
        int moveRight = countPaths(i,j+1,n,m);
        
        
        return moveDown + moveRight; 
    }
	public static void main(String[] args) {
		int n=3;
		int m=3;
		int TotalPath = countPaths(0,0,n,m);
		System.out.print(TotalPath);
	}
}
