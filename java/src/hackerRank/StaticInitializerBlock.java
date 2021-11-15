package hackerRank;

import java.util.*;


public class StaticInitializerBlock {
    public static int b;
    public static int h;
    private static boolean flag = false;

    static {
        Scanner scanner = new Scanner(System.in);
        b = scanner.nextInt();
        h = scanner.nextInt();

        if ( (b > 0 && h > 0) ) {
            flag = true;
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }

    }

    public static void main(String[] args){

        if(flag){
            int area = b * h;
            System.out.print(area);
        }

    }//end of main

}//end of class

