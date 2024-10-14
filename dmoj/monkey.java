import java.util.Scanner;

public class monkey {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A, B, C, D;
        A = input.nextInt();
        B = input.nextInt();
        C = input.nextInt();
        D = input.nextInt();
        if(A < B && C < D)
        {
            System.out.println("Go to the department store");
        }
        
        else if(A < B)
        {
            System.out.println("Go to the grocery store");
        }

        else if(C < D){
            System.out.println("Go to the pharmacy");
        }

        else{
            System.out.println("Stay home");
        }
    }
}
