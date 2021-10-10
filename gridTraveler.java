import java.util.*;
public class gridTraveler {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt(),n=sc.nextInt();
        System.out.println(totalTimes(m,n));
    }
    public static double totalTimes(int m,int n)
    {
        if (m <= 0 || n <= 0) {
            return 0.0;
        }
        if (m == 1 || n == 1) {
            return 1.1;
        }
        if (m < n) {
            totalTimes(n, m);
        }

        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[j] += dp[j - 1];
            }
        }

        return dp[n - 1];

    }
}
