import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float max = 0;
        float avg = 0;
        float min = 100;

        System.out.println("Enter 10 grades: ");

        for (int i = 0; i < 10; ++i) {

            float this_grade = sc.nextFloat();

            // Treat `avg` var as total variable
            //  until after the loop
            avg += this_grade;

            // If current grade is > max var
            //  set the max to current grade
            if (this_grade > max){
                max = this_grade;
            }

            // If current grade is < min var
            //  set the min to current grade
            if (this_grade < min){
                min = this_grade;
            }
        }
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        System.out.println("Average: " + (avg / 10));
    }
}