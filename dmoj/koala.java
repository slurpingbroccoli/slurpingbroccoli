import java.util.Scanner;

public class koala {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int a = 0;
        if(n%2 == 0){
            a = n-2;
        }
        if(n%2 != 0){
            a = n-1;
        }
        System.out.println(a);
    }
}
