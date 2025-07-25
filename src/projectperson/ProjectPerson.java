package projectperson;

/**
 *
 * @author rodrigodelascio
 */
public class ProjectPerson {

     public static void main(String[] args) {
        // Main program
        
        Person p1 = new Person();
        Student p2 = new Student();
        Teacher p3 = new Teacher();
        Worker p4 = new Worker();
        
        p1.setName("Tommaso");
        p2.setName("Fiorella");
        p3.setName("Rodrigo");
        p4.setName("Thalita");
        
        p1.setGender("M");
        p2.setGender("F");
        p3.setGender("M");
        p4.setGender("F");
        
        p1.setAge(6);
        p2.setAge(11);
        p3.setAge(40);
        p4.setAge(41);
        
        p2.setCourse("Computer Science");
        p3.setSalary(2500.75f);
        p4.setSector("Stock");
        
        
        
         System.out.println(p1.toString());
         System.out.println(p2.toString());
         System.out.println(p3.toString());
         System.out.println(p4.toString());
    }
    
}
