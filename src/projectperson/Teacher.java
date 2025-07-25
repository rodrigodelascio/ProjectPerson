
package projectperson;

/**
 *
 * @author rodrigodelascio
 */
public class Teacher extends Person {
    private String specialty;
    private float salary;
    
    public void receivePayRaise (float raise) {
        this.salary += raise;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
    
    
}
