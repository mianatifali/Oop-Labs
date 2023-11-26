public class Variable
 {
    public static void main(String[] args) 
	{       
        int age = 25;
        double salary = 55000.50;       
        String name = "John Doe";       
        boolean isStudent = false;    
        char grade = 'A';        
        int[] scores = {90, 85, 95, 88, 92};       
        Person person = new Person("Alice", 30);      
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Is Student: " + isStudent);
        System.out.println("Grade: " + grade);
        System.out.println("Scores: " + java.util.Arrays.toString(scores));
        System.out.println("Person: " + person);
    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
