import java.util.*;
public class Main {
   
    public static void PrimrOrNot(int n, int index, int counter) {
        if (index > n) {
            if (counter == 2) {
                System.out.print(n+" is a prime number");
            } else {
                System.out.print(n+" is not a prime number");
            }
            return;
        }
        if (n % index == 0) {
            counter++;
        }
        PrimrOrNot(n, index + 1, counter); // Recursive call with updated index and counter
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        PrimrOrNot(n, 1, 0); // Start with counter = 0
    }
// }output
// Enter the number : 
// 5
// 5 is a prime number


