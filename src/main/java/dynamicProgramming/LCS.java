package dynamicProgramming;

import java.util.Arrays;

public class LCS {


    public static void main(String[] args) {
        String s1 = "AXYZ";
        String s2 = "BAZ";
        int result = lcs(s1,s2,s1.length(),s2.length());
        System.out.println(result);
        int m = s1.length();
        int n = s2.length();

        int[][] memo = new int[m+1][n+1];
        for ( int i =0 ; i<=m ;i++) {
            for (int j = 0; j <= n; j++) {
                memo[i][j] = -1;
            }
        }
        for ( int i =0 ; i<=m ;i++) {
            for ( int j =0 ;j <= n ; j++) {
                System.out.println(i + " " + j + " " + memo[i][j]);

            }
        }
        int result2 = dplcs(s1,s2,s1.length(),s2.length(),memo);
        System.out.println(result2);

    }

    private static int dplcs(String s1, String s2, int m, int n,int[][] memo) {
        if ( memo[m][n] != -1) {
            return memo[m][n];
        }
        if ( m==0 || n==0 ) {
            memo[m][n] =0;
        } else {
            if ( s1.charAt(m-1) == s2.charAt(n-1)) {
                memo[m][n] = 1+ dplcs(s1,s2,m-1,n-1,memo);
            }else {
                memo[m][n] = Math.max(dplcs(s1,s2,m-1,n,memo), dplcs(s1,s2,m,n-1,memo));
            }
        }
        return memo[m][n];


    }

    private static int lcs(String s1, String s2, int m, int n) {
        if (m==0 || n==0) {
            return 0;
        }
        if ( s1.charAt(m-1) == s2.charAt(n-1)) {
            return 1+ lcs(s1,s2,m-1,n-1);

        }else {
            return Math.max(lcs(s1,s2,m-1,n), lcs(s1,s2,m,n-1));
        }


    }
}
