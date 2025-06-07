import java.util.Scanner;

//Learning Java 11

public class HelloWorld {

    public static void announceDeveloperTeaTime()
    {
        System.out.println("Waiting for developer tea time...");
        System.out.println("Type anything and press enter to start developer tea time");
        Scanner input = new Scanner(System.in);
        input.next();
        System.out.println("It's developer tea time!");
    }

    public static double calculateTotalMealPrice(double listedMealPrice, double tipRate, double taxRate)
    {
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tip + tax;
        return result;
    }

    public static void main(String[] args)
    {
        //BASIC DATA TYPES
/*
        int studentAge = 17;
        double studentGPA = 3.4;
        boolean hasPerfectAttendance = false;
        String studentFullName = "Ashtyn Roman";
        char studentFirstInitial = studentFullName.charAt(0);
        char studentLastInitial = 'R';

        System.out.println("Students Age: " + studentAge);
        System.out.println("Students GPA: " + studentGPA);
        System.out.println("Students Initials: " + studentFirstInitial + studentLastInitial);
        System.out.println("Students has perfect attendance: " + hasPerfectAttendance);
        System.out.println("Student Name: " + studentFullName);

        System.out.println(studentFullName + " has a GPA of " + studentGPA);
        System.out.println("What do you want to update the GPA to?");

        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();

        System.out.println(studentFullName + "has a new GPA of " + studentGPA);
*/


        //CH 3 - CONTROL FLOW STATEMENTS
        //If statements
/*
        System.out.println("Pick a number between 1 and 10.");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if(number < 5)
        {
            System.out.println("Enjoy the good luck a friend brings you.");
        }
        else
        {
            System.out.println("Your shoe selection will make you happy today.");
        }

        //While loops
        boolean isCurrentSongOnRepeat = true;
        Scanner input = new Scanner(System.in);

        while (isCurrentSongOnRepeat) { 
            System.out.println("Playing same song again...");
            System.out.println("Would you like to take the song off repeat?");
            String userInput = input.next();
            if(userInput.equals("yes"))
            {
                isCurrentSongOnRepeat = false;
            }
        }

        System.out.println("Playing next song");
*/

        //NO CODE FOR CH 4 - GOES OVER DEBUGGING

        //CH 5 - FUNCTOINS
/*
        announceDeveloperTeaTime();

        double groupMealCost = calculateTotalMealPrice(90, 0.10, 0.08);
        double individualMealCost = groupMealCost / 5;
        System.out.println(individualMealCost);
    
        ///CODING CHALLENGE
        static String moveCapitalLettersToFront(String s)
        {
                    StringBuilder result = new StringBuilder();
        int capitalIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(Character.isUpperCase(ch))
            {
                result.insert(capitalIndex++,ch);
            }
            else
            {
                result.append(ch);
            }
        }
        return result.toString();
        }
*/

    //CH 6: CLASSES

    Triangle triangleA = new Triangle(15,8,15,8,17);
    Triangle triangleB = new Triangle(3,2.598,3,3,3);

    double triangleAArea = triangleA.findArea();
    double triangleBArea = triangleB.findArea();

    System.out.println("The area of triangle A is: " + triangleAArea);
    System.out.println("The area of triangle B is: " + triangleBArea);
    }
}