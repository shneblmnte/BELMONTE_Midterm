
//University Enrollment System

class Person { //Base Class
    String name;
    int age;

    public Person(String name, int age) { //Constructor
        this.name = name; //this keyword is used to call another constructor
        this.age = age;
    }

    public void  displayInfo() { //Method to display name and age
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

}

class Student extends Person { //Subclass inheritting the person to student
    String studentID;
    String course;
    int units;
    final int feePerUnit = 1000;

    public Student(String name, int age, String studentID, String course, int units) { //Constructor
        super(name, age); //super keyword is used to call the constructor of the base class
        this.studentID = studentID; //this keyword is used to call another constructor
        this.course = course;
        this.units = units;
    }
    
    public double calculateFees() { //To calculate the total cost of units
        return units * feePerUnit; //To return the total fee for units
    }

    @Override //Override is used if the subclass has the same method as declared in the base class
    public void displayInfo() { //Method to display name, age, student ID, course, units, and total fee
        super.displayInfo(); //super keyword is used to call the constructor of the base class
        System.out.println("Student ID: " + studentID);
        System.out.println("Course: " + course);
        System.out.println("Units: " + units);
        System.out.println("Total Fee: " + calculateFees());
    }
}

class Instructor extends Person { //Subclass inheritting the person to instructor
    String employeeID;
    String department;
    double salary;

    public Instructor(String name, int age, String employeeID, String department, double salary) { //Constructor
        super(name, age); //super keyword is used to call the constructor of the base class
        this.employeeID = employeeID; //this keyword is used to call another constructor
        this.department = department;
        this.salary = salary;
    }
    
    @Override //Override is used if the subclass has the same method as declared in the base class
    public void displayInfo() { //Method to display name, age, employee ID, department, and salary
        super.displayInfo(); //super keyword is used to call the constructor of the base class
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

public class UniversityEnrollmentSystem { //Main class
    public static void printDetails(Person p) { //To call the displayInfo() method coming from the two object created
        p.displayInfo();
    }

    public static void main(String[] args) {
        Student studentOne = new Student("Shane Mae T. Belmonte", 20, "231000318", "Bachelor of Science in Computer Engineering", 9);
        Student studentTwo = new Student("Sophia Jessica C. Toraldo", 20, "2231002299", "Bachelor of Science in Computer Enginnering", 9);

        Instructor instructorOne = new Instructor("Tanya Carmela Jovillano", 22, "241900578", "College of Engineering and Architecture", 20000);
        Instructor instructorTwo = new Instructor("Eric N. Velitario", 29, "241500048", "College of Engineering and Architecture", 25000);

        //To print all the necessary information for 2 students and 2 instructors
        System.out.println("[1] Student 1 Information");
        printDetails(studentOne);
        System.out.println();

        System.out.println("[2] Student 2 Information");
        printDetails(studentTwo);
        System.out.println();

        System.out.println("[1] Instructor 1 Information");
        printDetails(instructorOne);
        System.out.println();

        System.out.println("[2] Instructor 2 Information");
        printDetails(instructorTwo);
        System.out.println();

    }
}