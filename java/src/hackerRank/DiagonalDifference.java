package hackerRank;
import java.io.*;
import java.util.*;

import static java.util.stream.Collectors.joining;

public class DiagonalDifference {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        int d1 = 0;
        int d2 = 0;

        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).size(); j++) {
                if (arr.get(i).get(j) <= -100 && arr.get(i).get(j) >= 100) {
                    return 0;
                }

                if (i == j) {
                    d1 = d1 + arr.get(i).get(j);
                }
            }
        }

        int j = arr.size() - 1;
        for (int i = 0; i < arr.size(); i++) {
            d2 = d2 + arr.get(i).get(j);
            j--;
        }

        System.out.println(d1 + " , " + d2);
        return Math.abs(d1 - d2);
    }

}

class Solution {
    public static void main(String[] args) throws IOException {

        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> list0 = new ArrayList<>();
        list0.add(6);
        list0.add(6);
        list0.add(7);
        list0.add(-10);
        list0.add(9);
        list0.add(-3);
        list0.add(8);
        list0.add(9);
        list0.add(-1);
        arr.add(0, list0);

        List<Integer> list1 = new ArrayList<>();
        list1.add(9);
        list1.add(7);
        list1.add(-10);
        list1.add(6);
        list1.add(4);
        list1.add(1);
        list1.add(6);
        list1.add(1);
        list1.add(1);
        arr.add(1, list1);

        List<Integer> list2 = new ArrayList<>();
        list2.add(-1);
        list2.add(-2);
        list2.add(4);
        list2.add(-6);
        list2.add(1);
        list2.add(-4);
        list2.add(-6);
        list2.add(3);
        list2.add(9);
        arr.add(2, list2);

        List<Integer> list3 = new ArrayList<>();
        list3.add(-8);
        list3.add(7);
        list3.add(6);
        list3.add(-1);
        list3.add(-6);
        list3.add(-6);
        list3.add(6);
        list3.add(-7);
        list3.add(2);
        arr.add(3, list3);

        List<Integer> list4 = new ArrayList<>();
        list4.add(-10);
        list4.add(-4);
        list4.add(9);
        list4.add(1);
        list4.add(-7);
        list4.add(8);
        list4.add(-5);
        list4.add(3);
        list4.add(-5);
        arr.add(4, list4);

        List<Integer> list5 = new ArrayList<>();
        list5.add(-8);
        list5.add(-3);
        list5.add(-4);
        list5.add(2);
        list5.add(-3);
        list5.add(7);
        list5.add(-5);
        list5.add(1);
        list5.add(-5);
        arr.add(5, list5);

        List<Integer> list6 = new ArrayList<>();
        list6.add(-2);
        list6.add(-7);
        list6.add(-4);
        list6.add(8);
        list6.add(3);
        list6.add(-1);
        list6.add(8);
        list6.add(2);
        list6.add(3);
        arr.add(6, list6);

        List<Integer> list7 = new ArrayList<>();
        list7.add(-3);
        list7.add(4);
        list7.add(6);
        list7.add(-7);
        list7.add(-7);
        list7.add(-8);
        list7.add(-3);
        list7.add(9);
        list7.add(-6);
        arr.add(7, list7);

        List<Integer> list8 = new ArrayList<>();
        list8.add(-2);
        list8.add(0);
        list8.add(5);
        list8.add(4);
        list8.add(4);
        list8.add(4);
        list8.add(-3);
        list8.add(3);
        list8.add(0);
        arr.add(8, list8);

        int result = DiagonalDifference.diagonalDifference(arr);

        System.out.println(result);

    }
}

