public class Student {

    // States
    private String name;
    private int age;
    private String color;
    private char sex;

    private static int id = 0;

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
        id++;
    }

    // Getters
    // The get method returns the variable value.

    public String getName() {
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getColor(){
        return color;
    }

    public char getSex(){
        return sex;
    }

    public int getId(){
        return id;
    }



    // Setter
    // The set method sets the value.

    public void setName(String newName){
        this.name = newName;
    }

    public void setAge(int newAge){
        this.age = newAge;
    }

    public void setColor(String newColor){
        this.color = newColor;
    }

    public void setSex(char newSex){
        this.sex = newSex;
    }
}
