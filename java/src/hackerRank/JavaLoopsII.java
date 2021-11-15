package hackerRank;

import java.util.*;

public class JavaLoopsII {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);

        //int q = in.nextInt();
        int q = 1;
        StringBuilder sb = new StringBuilder();

        if (q >= 0 && q <= 500) {
            for(int i = 0; i < q; i++){
                //int a = in.nextInt();
                //int b = in.nextInt();
                //int n = in.nextInt();
                int a = 5;
                int b = 3;
                int n = 5;

                for (int j = 1; j <= n; j++) {
                    sb.append(soluction(a, b, j));
                    sb.append("\n");
                }
            }
            System.out.println(sb);
        }

        in.close();
    }

    private static String soluction(int a, int b, int j) {
        String result = "";
        int calc = 0;
        int m = 1;
        for (int i = 1; i <= j; i++) {
            if (i == 1) {
                calc = a + (m * b);
                result = String.format("s%d = %d + %d x %d", j-1, a, m, b);
            } else {
                m += m;
                calc += (m * b);
                result += String.format(" + %d x %d", m, b);
            }
        }

        result += " = " + calc;

        return result;
    }
}

/*
We use the integers , , and  to create the following series:

You are given  queries in the form of , , and . For each query, print the series corresponding to the given , , and  values as a single line of  space-separated integers.

Input Format

The first line contains an integer, , denoting the number of queries.
Each line  of the  subsequent lines contains three space-separated integers describing the respective , , and  values for that query.

Constraints

Output Format

For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of  space-separated integers.

Sample Input

2
0 2 10
5 3 5
Sample Output

2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98

Explanation

We have two queries:

We use , a=0, b=2 , and n=10 to produce some series s0, s1, ..., sn-1:
s0 = 0 + 1 x 2 = 2
s1 = 0 + 1 x 2 + 2 x 2 = 6
s2 = 0 + 1 x 2 + 2 x 2 + 4 x 2 = 14
... and so on.

Once we hit , we print the first ten terms as a single line of space-separated integers.

We use a=5, b=3, n=5 and  to produce some series s0, s1, ..., sn-1:
s0 = 5 + 1 x 3 = 8
s1 = 5 + 1 x 3 + 2 x 3 = 14
s2 = 5 + 1 x 3 + 2 x 3 + 4 x 3 = 26
s3 = 5 + 1 x 3 + 2 x 3 + 4 x 3 + 8 x 3 = 50
s4 = 5 + 1 x 3 + 2 x 3 + 4 x 3 + 8 x 3 + 16 x 3 = 98
We then print each element of our series as a single line of space-separated values.

*/
