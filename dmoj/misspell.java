import java.util.Scanner;

public class misspell {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //read number of databases
        int M = input.nextInt();
        int [] num = new int[M];
        String [] words = new String[M];
        String misspelledWord;
        //read each integer M and word into an array
        for(int i = 0; i < M; i++){
            num[i] = input.nextInt();
            words[i] = (input.nextLine().strip());
        }
        //use that to remove the specific letter at M index and print it out
        for(int i = 0; i < M; i++){
            misspelledWord = words[i].substring(0, num[i]-1) + words[i].substring(num[i]);
            System.out.println((i + 1) + " " + misspelledWord);
        }
        
    }
}
