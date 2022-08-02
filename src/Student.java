public class Student {

    // States
    String name;
    int age;
    String color;
    char sex;

    // Behaviours = Methods
    // Methods: blocks of code which only runs when called.

    public void Eating() {
        System.out.println("Eating");
    }

    public void Drinking (){
        System.out.println("Drinking");
    }

    public void Running () {
        System.out.println("Running");
    }

    // Constructor


    public Student(String name, int age, String color, char sex) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.sex = sex;
    }
}
