import java.util.Scanner;

public class spooky {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int N, L, S;
    N = input.nextInt();
    L = input.nextInt();
    S = input.nextInt();

    int[] aValues = new int[N];
    int[] bValues = new int[N];
    int[] sValues = new int[N];

    for (int i = 0; i < N; i++) {
      aValues[i] = input.nextInt();
      bValues[i] = input.nextInt();
      sValues[i] = input.nextInt();
    }

    int maxB = 0;
    int minA = aValues[0];
    for (int i = 0; i < N; i++) {
      if (bValues[i] > maxB) {
        maxB = bValues[i];
      }
      if (aValues[i] < minA) {
        minA = aValues[i];
      }
    }

    int[] spookiness = new int[(maxB - minA) + 1];
    for (int i = 0; i < N; i++) {
      for (int x = aValues[i] - minA; x <= (bValues[i] - minA); x++) {
        spookiness[x] += sValues[i];
      }
    }

    int count = 0;
    for (int i = 0; i < spookiness.length; i++) {
      if (spookiness[i] >= S) {
        count++;
      }
    }
    int total = L - count;
    System.out.println(total);
    input.close();
  }
}