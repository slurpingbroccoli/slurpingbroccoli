import java.util.Scanner;

public class spooky2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int N, L, S, a, b, s;
    N = input.nextInt();
    L = input.nextInt();
    S = input.nextInt();
    // create an array that keeps track of the spookiness of each house
    int[] spookiness = new int[L];
    // outer loop to read the range of indexes
    for (int i = 0; i < N; i++) {
      a = input.nextInt();
      b = input.nextInt();
      s = input.nextInt();
      // inner loop to calculate the spookiness in that range
      for (int x = a - 1; x < b; x++) {
        spookiness[x] += s;
      }
    }
    // loop that counts which house kenny can get candy from
    int count = 0;
    for (int i = 0; i < L; i++) {
      if (spookiness[i] < S) {
        count++;
      }
    }
    System.out.println(count);
  }
}