package FlowControl.Practice;

public class UserInfo {
    public static void main(String[] args) {


        String userName = "Vaibhav Sabale";
        int userAge = 22;
        String userCollege = "SGU Kop";
        String userTech = "B.Tech AIML";
        String userEmail = "vaibhavsabale123@gmail.com";

        int choice = 9;

        switch (choice)
        {
            case 1 :
                System.out.println(userName);
                break;
            case 2 :
                System.out.println(userAge);
                break;
            case 3 :
                System.out.println(userCollege);
                break;
            case 4 :
                System.out.println(userTech);
                break;
            case 5 :
                System.out.println(userEmail);
                break;
            default:
                System.out.println("Invalid Input, Choice Should Be Between 1 - 5");

        }


    }
}
