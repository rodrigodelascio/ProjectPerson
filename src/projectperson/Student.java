
package projectperson;

/**
 *
 * @author rodrigodelascio
 */
public class Student extends Person {
    private int enrol;
    private String course;
    
    public void cancelEnrol() {
        System.out.println("Enrolment will be cancelled");
    }

    public int getEnrol() {
        return enrol;
    }

    public void setEnrol(int enrol) {
        this.enrol = enrol;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    
    
}
