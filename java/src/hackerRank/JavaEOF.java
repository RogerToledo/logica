package hackerRank;

import java.util.*;

public class JavaEOF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; scanner.hasNext(); i++) {
            System.out.println(i + " " + scanner.nextLine());
        }
        scanner.close();
    }
}
