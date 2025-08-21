import java.io.*;
import java.util.*;

class Solution {
    static final long MOD = 1000000007;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            String[] parts = br.readLine().trim().split(" ");
            int N = Integer.parseInt(parts[0]);
            long M = Long.parseLong(parts[1]);
            int X = Integer.parseInt(parts[2]);

            long[] arr = new long[N];
            String[] arrStr = br.readLine().trim().split(" ");
            for (int i = 0; i < N; i++) {
                arr[i] = Long.parseLong(arrStr[i]);
            }

            // dp[r] = minimum total power with remainder r
            long[] dp = new long[X];
            Arrays.fill(dp, Long.MAX_VALUE);
            dp[(int)(M % X)] = M;

            for (long val : arr) {
                long[] newDp = Arrays.copyOf(dp, X);
                for (int r = 0; r < X; r++) {
                    if (dp[r] != Long.MAX_VALUE) {
                        int newR = (int)((r + val) % X);
                        long newVal = dp[r] + val;
                        if (newVal < newDp[newR]) {
                            newDp[newR] = newVal;
                        }
                    }
                }
                dp = newDp;
            }

            if (dp[0] == Long.MAX_VALUE) {
                System.out.println(-1);
            } else {
                System.out.println(dp[0] % MOD);
            }
        }
    }
}
