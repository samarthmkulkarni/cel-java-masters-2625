package FlowControl.Practice;

public class GradeGenerator {

    public static void main(String[] args) {

        int marks = 85;

        if(marks<0 || marks>100)
        {
            System.out.println("Invalid Input, Marks Should Be Between 0 - 100 !");
        }
        else {
            if (marks >= 80 && marks <= 100) {
                System.out.println("Grade A");
            } else if (marks >= 60 && marks < 80) {
                System.out.println("Grade B");
            } else if (marks >= 35 && marks < 60) {
                System.out.println("Grade C");
            } else {
                System.out.println("Grade F - Fail !");
            }
        }

    }

}
