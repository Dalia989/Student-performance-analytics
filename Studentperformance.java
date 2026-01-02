public class StudentPerformance {

    public static void main(String[] args) {



        int[] marks = {60, 45, 80, 30, 55};

        int n = marks.length;

        int i = 0;



        while (i <=n-1) {

            if (marks[i] >= 50) {

                System.out.println("Student " + (i + 1) + ": Pass");

            } else {

                System.out.println("Student " + (i + 1) + ": Fail");

            }

            i++;

        }

    }



