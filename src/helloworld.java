
public class helloworld {

    public static void main(String[] args)
    {
       // System.out.print("Hello World");

        /*
        int a =10;
        short b = 99;
        long c = 102938123l;
        byte d = 1;

        float f_variable = 13.6654f;
        double d_variable = 16.23543523423423d;

        char x = 'j';
        boolean boo = true;


        System.out.println("a = " +a);
        System.out.println("b = " +b);
        System.out.println("c = " +c);
        System.out.println("d = " +d);
        System.out.println("f_variable = " +f_variable);
        System.out.println("d_variable = " +d_variable);
        System.out.println("Char = " +x);
        System.out.println("Boolean = " +boo);

        // Challenge 1

        Scanner sc = new Scanner(System.in); // Standard input stream
        sc.useLocale(Locale.US); // set the location for enabling float reading from the scanner
        System.out.print("Please input your WEIGHT in KG: - ");
        float wg = sc.nextFloat();
        System.out.print("Please input your HEIGHT in M: - ");
        float hg = sc.nextFloat();
        float bmi = wg/(hg*hg);
        String bmiTwoDec = String.format("%.2f", +bmi);
        System.out.print("Your BMI is: - " +bmiTwoDec);
        * */

        // For Loop

        /*
        for( int i = 1; i <= 5 ; i++ ) {
            System.out.println( i + " squared = " + (i*i));
        }
        * */

         /*
        for (int i = 5; i >= 0; i--) {
                int n = 5;
                if (n == i) {
                    for (int j = 1; j <= i; j++) {
                         System.out.print("*");
                    }
                }
                else {
                    int w = n - i;
                    for (int z = w; z >= 1 ; z--) {
                        System.out.print(" ");
                }
                    for(int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
            }
            System.out.println();
        }
        * */

        // Exercise 1
        // Write a java program that calculates the factorial of 10;

        /*
            int fact = 1;
        for (int a = 2; a <= 10; a ++) {
           ;
            fact *= a;
        }
            System.out.println("The factorial of 10 is : "+fact);
        * */

        // Exercise 2
        // Write a java program that compares 2 numbers entered by user

        /*
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.print("Enter the first number: - ");
        float n1 = sc.nextFloat();
        System.out.print("Enter the second number: - ");
        float n2 = sc.nextFloat();
        if (n1 > n2) {
            System.out.print("Number 1 is greater than Number 2");
        }
        else if (n2 > n1) {
            System.out.print("Number 2 is greater than Number 1");
        }
        else {
            System.out.print("Number 1 is EQUAL to Number 2");
        }
        * */

        // Exercise 3
        // Write a java program that compute the sum of digits of a number entered by the user
        // example: number: 27  --> sum of digits: 9

        /*
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.print("Enter a whole number: - ");
        int n1 = sc.nextInt();
        String n1Str = String.valueOf(n1);
        int sum = 0;
        for (int i = 0; i < n1Str.length(); i++) {
            String n1StrAt = String.valueOf(n1Str.charAt(i));
            sum += Integer.parseInt(n1StrAt);
            //System.out.println(sum);
        }
        System.out.print("The sum of the digits of the entered number is: " +sum);

        * */

        // Exercise 4
        // Write a java program to display prime numbers from 1 to n (entered by user)

        /*

        // 1. Get input from user

        Scanner sc = new Scanner(System.in);
        System.out.print("Write down the number: - ");
        int a = sc.nextInt();
        int num = 0;
        String primeNumber = "";

        // 2. Algorithm. You first do a for loop increasing the value of the variable i to the value of the
        //    variable a and another for loop
        //    inside the first one decreasing the variable num to 1, and do a variable counter =0 for comparison,
        //    if counter == 2, then its a prime number

        for(int i = 1; i <= a; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i%num == 0) {
                    counter++;
                }
            }
            if (counter == 2) {
                primeNumber = primeNumber + i + " ";
            }
        }
        System.out.print("These are the prime numbers: " +primeNumber);

        * */

        // Exercise 6
        // Write a java program that allows the user to enter 10 numbers and gives their sum

        /*
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.println("This program will sum all numbers you enter:");
            int[] arr = new int[10];
            int sum = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Please insert the " + i + " number: - ");
            arr[i-1] = sc.nextInt();
            sum += arr[i-1];
        }
        System.out.println("The sum of the array is: - " +sum);

        * */

        // Exercise 7
        // Write a java program that allows the user to enter
        // 10 numbers and gives their average

        /*
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.println("This program will do the average of all numbers you enter:");
        float[] arr = new float[10];
        float sum = 0;
        float avg = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Please insert the " + i + " number: - ");
            arr[i-1] = sc.nextInt();
            sum += arr[i-1];
        }
        avg = sum / 10;
        System.out.println("The average of the array is: - " +avg);

        * */

        // Exercise 8
        // Write a java program that removes an element from an array

        /*
        int[] my_array = {25,14,56,99,55,63};

        // Remove an element: 2nd Element
        int removingIndex = 1;

        // Replacing element
        for (int i = removingIndex; i < my_array.length-1; i++ ) {
            my_array[i] = my_array[i+1];
        }
        for (int i = 0; i < my_array.length-1; i++)
        System.out.println(my_array[i]);

        * */

        // Exercise 9
        // Write a java program that inserts an element into array (!!! You cannot alter array sizes !!!)
        //                                                          USE COLLECTIONS INSTEAD

        /*
        int[] my_array= {25,14,56,15,36};

        // Insert an element (99) at 3rd position
        int index_to_insert = 2;

        for (int i = my_array.length-1; i>index_to_insert; i--) {
            my_array[i] = my_array[i-1];
        }

        my_array[index_to_insert] = 99;

        for (int i = 0; i < my_array.length; i++){
            System.out.println(my_array[i]);

            // With this you cannot alter the size of the array, so the last item would be missed.

        }
        * */

        // Exercise 10
        // Write a java program that finds the max and min of an array

        /*
        int[] arr = {-100,244,10,29,58,66,98,2,13,-1,-25,122};
        int max, min;
            max = arr[0];
            min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
        }
        System.out.println("The max value of the array is: - " +max);
        System.out.println("The min value of the array is: - " +min);

        * */

        /*

        FirstMethod("hello");

        int result1 = SumTwoNumbers(100,99);
        System.out.println(result1);

        // Method Overloading
        double result2 = SumNumbers(1.1,2.2,2.3);
        System.out.println(result2);
        double result3 = SumNumbers(1.1,2.2,2.3, 4.2);
        System.out.println(result3);

        * */

        // Objects and Classes

        Student student1 = new Student("John",18,"black",'M');
        Student student2 = new Student("Daniel",33,"calvo",'B');

        // calling the behaviors of objects

//        student1.name = "John";
//        student1.age = 18;
//        student1.color = "black";
//        student1.sex = 'M';

        student1.Eating();

        System.out.println(student1.getName());
        System.out.println(student1.getId());
        System.out.println(student2.getId());

        // Types and Variables
            // There are three types of variables in Java:

            // Local variables (non static)
            // A variable defined within a block or method or constructor

            // Instance variable (non static)
            // are declared in a class outside any method, constructor or block

            // Static variables
            // When a variable is declared as static, then a single copy of the variable
            // is created and shared among all objects at a class level
    }

    /*
    public static void FirstMethod(String msg) {
        System.out.println("" +msg);
    }

    * */

    /*
    public static int SumTwoNumbers(int x, int y) {
        int result = x + y;
        return result;
    }

    * */

    // Method Overloading

    /*
    public static double SumNumbers (double x, double y, double z){
        double result = x + y + z;
                return result;
    }

    public static double SumNumbers (double x, double y, double z, double w){
        double result = x + y + z + w;
        return result;
    }
    * */

}
