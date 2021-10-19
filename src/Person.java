public class Person {
    /*
    Write a class with the name Person. The class needs three fields (instance variables) with the names
 firstName, lastName of type String and age of type int.
     */
    String FirstName;
    String LastName;
    int age;

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;


    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public void setAge(int age) {
        if (age > 0 && age <= 100) {
            this.age = age;
        } else {
            this.age = 0;
        }

    }

    public boolean isTeen() {
        if (age > 12 && age < 20) {
            return true;
        }
        return false;
    }

    public String getFullName() {
        if (FirstName.isEmpty()) {

            return FirstName;
        } else if (LastName.isEmpty()) {
            return LastName;
        } else if (FirstName.isEmpty() && LastName.isEmpty()) {
            return " ";
        } else {
            return "=" + FirstName + " " + LastName;
        }
    }



    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName(""); // firstName is set to empty string
        person.setLastName(""); // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John"); // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith"); // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());
    }
}

