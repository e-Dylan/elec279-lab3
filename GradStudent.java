public class GradStudent extends Student {
    private int numCommitteeMembers;
    private int numExamsTaken;
    private String[] examNames;
    private String[] examResults;

    private static final int maxNumAttempts = 6;

    public GradStudent(String name, String address, int id) {
        super(name, address, id);
        this.numCommitteeMembers = 0;
        this.numExamsTaken = 0;
        this.examNames = new String[] {};
        this.examResults = new String[] {};
    }

    public int getCommitteeNum() {
        return this.numCommitteeMembers;
    }

    public void setCommitteeNum(int numCommitteeMembers) {
        this.numCommitteeMembers = numCommitteeMembers;
    }

    public void addGrade(String name, String grade) {
        this.numExamsTaken++;
        // len is same for both courseCodes and grades arrays, they are parallel
        int len = this.examNames.length;

        // create new array with an extra space for the added items
        String[] newExamNames = new String[len + 1];
        String[] newExamResults = new String[len + 1];
        // copy all current course codes to new arrays, same loop for both arrays
        // (parallel)
        for (int i = 0; i < len; i++) {
            newExamNames[i] = this.examNames[i];
            newExamResults[i] = this.examResults[i];
        }

        newExamNames[len] = name;
        newExamResults[len] = grade;

        this.examNames = newExamNames;
        this.examResults = newExamResults;
    }

    public String toString() {
        return ("Grad " + super.toString());
    }

    public void printExamGrades() {
        for (int i = 0; i < examNames.length; i++) {
            System.out.println(examNames[i] + ": " + examResults[i]);
        }
    }

}
