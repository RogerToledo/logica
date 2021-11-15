package hackerRank;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);

        int divers = scan.nextInt();

        if (divers >= 0 && divers <=100) {
            for (int i = 1; i <= divers; i++) {
                String name = scan.next();
                double difficulty = scan.nextDouble();

                if (difficulty >= 1.2 && difficulty <= 3.8) {
                    List<Double> scoreList = new ArrayList<>();
                    for (int j = 1; j <= 7; j++) {
                        Double score = scan.nextDouble();
                        scoreList.add(score);
                    }

                    double finalScore = finalScore(scoreList, difficulty);
                    System.out.println(name + " " + new DecimalFormat("#,##0.00").format(finalScore));
                }

            }
        }

    }

    private static double finalScore(List<Double> scoreList, double difficulty) {
        Collections.sort(scoreList);
        scoreList.remove(0);
        scoreList.remove(5);
        double sum = 0;
        for (double score : scoreList) {
            sum = sum + score;
        }

        return sum * difficulty;

    }
}