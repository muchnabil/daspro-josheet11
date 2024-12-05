import java.util.Scanner;
public class Assignment2_14 {
    public static int[][] inputScore(String[] student){
        Scanner input = new Scanner(System.in);
        int[][] score = new int[student.length][7];

        System.out.println("Input student score : ");
        for (int i = 0; i < student.length; i++){
            System.out.println("Enter student score for " + student [i] + " for 7 week : ");
            for (int j = 0; j < 7; j++){
                System.out.print("Week " + (j + 1) + " : ");
                score[i][j] = input.nextInt();
            }
        }
        return score;
    }
    public static void displaySales (String[] student, int[][] score){
        System.out.println("Student score data : ");
        for (int i = 0; i < student.length; i++){
            System.out.println(student[i] + " ");
            for (int j = 0; j < 7; j++){
                System.out.println("Week " + (j + 1) + " : " + score[i][j]);
            }
            System.out.println();
        }
    }
    public static void weekWithHighestScore (int[][] score){
        int highScore = 0;
        int highWeek = 0;
        for (int week = 0; week < 7; week++){
            int totalScore = 0;
            for (int std = 0; std < 7; std++){
                totalScore += score[std][week];
            }
            if (totalScore > highScore){
                highScore = totalScore;
                highWeek = week + 1;
            }
        }
        System.out.println("Week with the highest total score : Week " + highWeek + " (Total score : " + highScore + ")");
    }
    public static void srudentWithHighestGrade (String[] student, int[][] score){
        int highestScore = 0;
        int highestStudent = 0;
        for (int i = 0; i < student.length; i++){
            int totalScore = 0;
            for (int j = 0; j < 7; j++){
                totalScore += score[i][j];
            }
            if (totalScore > highestScore){
                highestScore = totalScore;
                highestStudent = i;
            }
        }
        System.out.println("\nStudent with the highest total score : ");
        System.out.println("Name : " + student[highestStudent]);
        System.out.println("Total score : " + highestScore);
        for (int j = 0; j < 7; j++){
            System.out.println("Week " + (j + 1) + " : " + score[highestStudent][j]);
        }
    }
    public static void main(String[] args) {
        String[] student = {"Sari", "Rina", "Yani", "Dwi", "Lusi"};
        int[][] score = inputScore(student);
        displaySales(student, score);
        weekWithHighestScore(score);
        srudentWithHighestGrade(student, score);
    }
}