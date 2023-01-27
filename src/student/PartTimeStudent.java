package student;

/**
 *
 * @author Mostafa Hussain
 */
public class PartTimeStudent extends Student {
    private int numOfCourse;

    public PartTimeStudent(int numOfCourse, String studentId, String studentName) {
        super(studentId, studentName);
        this.numOfCourse = numOfCourse;
    }
    
    
    public int getNumOfCourse(){
        return numOfCourse;
    }
}
