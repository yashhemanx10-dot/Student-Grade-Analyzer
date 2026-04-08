import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task2 {

    public static  void main(String[] args) {

        int[] grades = new int[5];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < grades.length; i++) {
            System.out.print("Enter grade for student " + (i + 1) + ": ");
            grades[i] = scanner.nextInt();
        }

        System.out.println("\nAverage grade: " + calculateAverage(grades));
        System.out.println("Highest grade: " + findHighest(grades));
        System.out.println("Lowest grade: " + findLowest(grades));
        System.out.println("Number of students who passed: " + countPassing(grades));
        System.out.println("Deduplicated list of grades: " + Arrays.toString(deduplicatedGrades(grades)));

    }

    public static double calculateAverage(int[] grades) {
        int sum = 0;
        for (int grade : grades) { //this is called a for-each loop
            sum+= grade;
        }
        return (double) sum / grades.length;
    }

    public static int findHighest(int[] grades){
        int Highest = 0;
        for (int grade : grades){
            if (grade > Highest){
                Highest = grade;
            }
        }
        return Highest;
    }

    public static int findLowest(int[] grades){
        int Lowest = 101;
        for (int grade : grades){
            if (grade < Lowest){
                Lowest = grade;
            }
        }
        return Lowest;
    }

    public static int countPassing(int[] grades){
        int totalPassed = 0;
        for (int grade : grades) {
            if (grade >= 60){
                totalPassed++;
            }
        }
        return totalPassed;
    }

    public static int[] deduplicatedGrades(int[] grades){
        boolean isDuplicate;
        ArrayList<Integer> deduplicated = new ArrayList<>();

        for (int grade : grades){
            isDuplicate  = false;
            for (int i : deduplicated){
                if (grade == i){
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate){
                deduplicated.add(grade);
            }
        }

        int[] newArray = new int[deduplicated.size()];

        for (int i = 0; i < deduplicated.size(); i++){
            newArray[i] = deduplicated.get(i);
        }

        return newArray;
    }
}
