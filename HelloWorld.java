//LinkedIn Learning
//Learning Java 11

public class HelloWorld {
    public static void main(String[] args)
    {
        System.out.println("Java Basics Class");

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
    }
}