import java.util.Scanner;
public class Assignment2A_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of student : ");
        int numStudent = input.nextInt();

        System.out.print("Enter the number of weeks : ");
        int numWeeks = input.nextInt();

        String[] student = new String[numStudent];
        for (int i = 0; i < numStudent; i++){
            System.out.print("Enter the name of student " + (i + 1) + " : ");
            student[i] = input.next();
        }
        int[][] scores = inputScore(student, numWeeks);
        displayStudent(student, scores, numWeeks);
        weekWithHighestScore(scores, numWeeks);
        studentWithHighestGrade(student, scores, numWeeks);
    }
    public static int[][] inputScore(String[] student, int numWeeks){
        Scanner input = new Scanner(System.in);
        int[][] scores = new int[student.length][numWeeks];
        System.out.println("Input the student score : ");
        for (int i = 0; i < student.length; i++){
            System.out.println("Enter score for " + student[i] + " : ");
            for (int j = 0; j < numWeeks; j++){
                System.out.print("Week " + (j + 1) + " : ");
                scores[i][j] = input.nextInt();
            }
        }
        return scores;
    }
    public static void displayStudent(String[] student, int[][] scores, int numWeeks){
        System.out.println("Student score data : ");
        for (int i = 0; i < student.length; i++){
            System.out.println(student[i] + " : ");
            for (int j = 0; j < numWeeks; j++){
                System.out.println("Week "+ (j + 1) + " : " + scores[i][j]);
            }
            System.out.println();
        }
    }
    public static void weekWithHighestScore(int[][] scores, int numWeeks){
        int highScore = 0;
        int highWeek = 0;
        for (int week = 0; week < numWeeks; week++){
            int totalScore = 0;
            for(int student = 0; student < scores.length; student++){
                totalScore += scores[student][week];
            }
            if (totalScore > highScore){
                highScore = totalScore;
                highWeek = week + 1;
            }
        }
        System.out.println("Week with the highest score : Week " + highWeek + " (Total score : "+ highScore + ")");
    }
    public static void studentWithHighestGrade(String[] student,int[][] scores, int numWeeks){
        int highestScore = 0;
        int highestStudent = 0;
        for (int i = 0; i < student.length; i++){
            int totalScore = 0;
            for (int j = 0; j < numWeeks; j++){
                totalScore += scores[i][j];
            }
            if (totalScore > highestScore){
                highestScore = totalScore;
                highestStudent = i;
            }
        }
        System.out.println("\nStudent with the highest total score : ");
        System.out.println("Name : " + student[highestStudent]);
        System.out.println("Total score : " + highestScore);
        for (int j = 0; j < numWeeks; j++){
            System.out.println("Week " + (j + 1) + " : " + scores[highestStudent][j]);
        }
    }
}