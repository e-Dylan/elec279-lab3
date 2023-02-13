public class Student extends Person {
    private int numCoursesTaken;
    private String[] courseCodes;
    private int[] grades;
    private static int maxNumberOfCourses = 20;

    public Student(String name, String address, int id) {
        // invoke Person's constructor
        super(name, address, id);
        this.numCoursesTaken = 0;
        this.courseCodes = new String[] {};
        this.grades = new int[] {};
    }

    public String toString() {
        return ("Student: " + super.toString());
    }

    public void addGrade(String courseCode, int grade) {
        this.numCoursesTaken++;
        // len is same for both courseCodes and grades arrays, they are parallel
        int len = this.courseCodes.length;

        // create new array with an extra space for the added items
        String[] newCourseCodes = new String[len + 1];
        int[] newGrades = new int[len + 1];
        // copy all current course codes to new arrays, same loop for both arrays
        // (parallel)
        for (int i = 0; i < len; i++) {
            newCourseCodes[i] = this.courseCodes[i];
            newGrades[i] = this.grades[i];
        }

        newCourseCodes[len] = courseCode;
        newGrades[len] = grade;

        this.courseCodes = newCourseCodes;
        this.grades = newGrades;
    }

    public void printGrades() {
        // iterate over course codes and grades and print them out
        for (int i = 0; i < courseCodes.length; i++) {
            System.out.println(this.courseCodes[i] + ": " + this.grades[i]);
        }
    }
}
