import java.util.Arrays;
import java.util.Scanner;

public class list {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arrayLength = input.nextInt();
        int nums[] = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            nums[i] = input.nextInt();
        }

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        input.close();
    }
}
