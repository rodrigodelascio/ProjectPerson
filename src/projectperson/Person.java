package projectperson;

/**
 *
 * @author rodrigodelascio
 */
public class Person {
    private String name, gender;
    private int age;
    
    public void birthday() {
        this.age ++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", gender=" + gender + ", age=" + age + '}';
    }
    
}
