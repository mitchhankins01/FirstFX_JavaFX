package model;

public class Person {
    private String firstName;
    private String lastName;
    private String age;
    
    // Constructors
    public Person(String firstName, String lastName, String age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    
    public Person(String firstName) {
        this.firstName = firstName;
    }
    
    // Getters
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getAge() { return age; }
    
    // Setters
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setAge(String age) { this.age = age; }
}
