import java.util.Scanner;

public class modernart {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int M, N, K, num, gold;
        gold = 0;
        char var;
        M = input.nextInt();
        N = input.nextInt();
        K = input.nextInt();
        int[][] art = new int[M][N];
        for (int i = 0; i < K; i++) {
            var = input.next().charAt(0);
            num = input.nextInt();
            if (var == 'R') {
                for (int x = 0; x < N; x++) {
                    art[num - 1][x] += 1;
                }
            }
            if (var == 'C') {
                for (int b = 0; b < M; b++) {
                    art[b][num - 1] += 1;
                }
            }
        }
        for (int i = 0; i < M; i++) {
            for (int x = 0; x < N; x++) {
                int l = (art[i][x] % 2);
                if (l != 0) {
                    gold += 1;
                }
            }
        }
        System.out.println(gold);

    }
}
