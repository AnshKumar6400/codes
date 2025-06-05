import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        if (n == 0) {
            System.out.println(0);
            return;
        }

        int res = 1;
        int curr = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] < nums[i]) {
                curr++;
            } else {
                res = Math.max(res, curr);
                curr = 1;
            }
        }
        res = Math.max(res, curr);
        System.out.println(res);
    }
}