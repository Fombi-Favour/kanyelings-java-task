package school;

import java.util.*;

public class Main {

    static int totalStudent = 3;
    static Student[] students = new Student[totalStudent];

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        collectStudentInfo(scanner);
        generalResult();
    }

    public static void generalResult(){
        double[] averages = calculateAvg();
        for(int i = 0; i < totalStudent; i++){
            System.out.println();
            System.out.println("Student " + (i+1));
            System.out.println("Name: " + students[i].getName());
            System.out.println("ID: " + students[i].getID());
            System.out.println("Courses");
            for(int j = 0; j < students[i].getCourses().size(); j++){
                System.out.println(students[i].getCourses().get(j) + " : "  + students[i].getCourses().get(j).getScore());
            }
            System.out.println("Average: " + averages[i]);
        }
    }

    public static void collectStudentInfo(Scanner scanner){

        // Random objects to randomise the score
        Random random = new Random();

        for (int i = 0; i < totalStudent; i++){

            // Getting user input
            System.out.println("Enter name of student no " + (i+1) + ": ");
            String name = scanner.next();
            System.out.println("Enter the ID of student no " + (i+1) + ": ");
            int ID = scanner.nextInt();

            // Randomising the score
            double score1 = random.nextInt(85 - 35 + 1) + 35;
            double score2 = random.nextInt(85 - 35 + 1) + 35;

            // Adding courses
            ArrayList<Course> courses = new ArrayList<>();
            courses.add(new Course("Mathematics", score1));
            courses.add(new Course("English", score2));
            students[i] = new Student(name, ID, courses);
        }

    }

    // Calculating the average of a student
    public static double calculateAvgPerStudent(Student student){

        double average = 0.0;
        for(int i = 0; i < student.getCourses().size();i++){
            average = average + student.getCourses().get(i).getScore();
        }
        return average/(student.getCourses().size() * 5);
    }

    // Calculate all students' average
    public static double[] calculateAvg(){

        double[] result = new double[totalStudent];
        for(int i = 0; i < totalStudent; i++){
            result[i] = calculateAvgPerStudent(students[i]);
        }
        return result;
    }
}
