# Java Data Types
Java Has 8 Primitive Data Types:
- byte
- short
- int
- long
- float
- double
- boolean
- char

why string is not primitive data type? in java, string is an object. Which means that it is a reference type. It is not a primitive type. It is a reference type that refers to an object. It is not a primitive type that contains a value. 

## Primitive Data Types
### byte
- byte data type is an 8-bit signed two's complement integer
- Minimum value is -128 (-2<sup>7</sup>)
- Maximum value is 127 (inclusive)(2<sup>7</sup> -1)
- Default value is 0
- Byte data type is used to save space in large arrays, mainly in place of integers, since a byte is four times smaller than an int
- Example: byte a = 100, byte b = -50

### short
- short data type is a 16-bit signed two's complement integer
- Minimum value is -32,768 (-2<sup>15</sup>)
- Maximum value is 32,767 (inclusive) (2<sup>15</sup> -1)
- Short data type can also be used to save memory as byte data type. A short is 2 times smaller than an int
- Default value is 0
- Example: short s = 10000, short r = -20000

### int
- int data type is a 32-bit signed two's complement integer
- Minimum value is - 2,147,483,648 (-2<sup>31</sup>)
- Maximum value is 2,147,483,647(inclusive) (2<sup>31</sup> -1)
- Integer is generally used as the default data type for integral values unless there is a concern about memory
- The default value is 0
- Example: int a = 100000, int b = -200000

### long
- long data type is a 64-bit signed two's complement integer
- Minimum value is -9,223,372,036,854,775,808(-2<sup>63</sup>)
- Maximum value is 9,223,372,036,854,775,807 (inclusive) (2<sup>63</sup> -1)
- This type is used when a wider range than int is needed
- Default value is 0L
- Example: long a = 100000L, long b = -200000L

### float
- float data type is a single-precision 32-bit IEEE 754 floating point
- Float is mainly used to save memory in large arrays of floating point numbers
- Default value is 0.0f
- Float data type is never used for precise values such as currency
- Example: float f1 = 234.5f

### double
- double data type is a double-precision 64-bit IEEE 754 floating point
- This data type is generally used as the default data type for decimal values, generally the default choice
- Double data type should never be used for precise values such as currency
- Default value is 0.0d
- Example: double d1 = 123.4

### boolean
- boolean data type represents one bit of information
- There are only two possible values: true and false
- This data type is used for simple flags that track true/false conditions
- Default value is false
- Example: boolean one = true

### char
- char data type is a single 16-bit Unicode character
- Minimum value is '\u0000' (or 0)
- Maximum value is '\uffff' (or 65,535 inclusive)
- Char data type is used to store any character
- Example: char letterA = 'A'

## Non-Primitive Data Types
### String
- String is a sequence of characters
- String is a class in java.lang package
- Strings are immutable, which means once created, their values cannot be changed
- String objects are stored in a special memory area known as String Constant Pool
- String objects are created using the new keyword
- Example: String name = new String("John"); or String name = "John";

### Array
- Array is a collection of similar data types
- Array can store multiple values of same data type
- Array size is fixed
- Array is created using the new keyword
- Example: int[] numbers = new int[5];

### Class
- Class is a blueprint for an object
- Class is a user-defined data type
- Class can have fields, methods, constructors, etc.
- Class is created using the new keyword
- Example: class Person { ... }

### Interface
- Interface is a blueprint of a class
- Interface can have only abstract methods and constants
- Interface cannot have fields, constructors, etc.
- Interface is created using the new keyword
- Example: interface Vehicle { ... }

## How to declare a variable in Java with a data type that we learn above?
```java
public class DataTypes {
    public static void main(String[] args) {
        // declare a variable with a data type
        byte aByte = 100;
        short aShort = 10000;
        int anInt = 100000;
        long aLong = 100000L;
        float aFloat = 234.5f;
        double aDouble = 123.4;
        boolean aBoolean = true;
        char aChar = 'A';
        String aString = "John"; //String is not a primitive data type that why we declare with capital letter
        int[] numbers = new int[5];
        Person person = new Person(); //Person is a class that why we declare with capital letter
        Vehicle vehicle = new Vehicle() { //Vehicle is an interface that why we declare with capital letter
            @Override
            public void start() {
                System.out.println("Start");
            }

            @Override
            public void stop() {
                System.out.println("Stop");
            }

            @Override
            public void accelerate() {
                System.out.println("Accelerate");
            }
        };
    }

    // Person class
    static class Person {
        // fields
        String name;
        int age;

        // constructor
        public Person() {
        }

        // methods
        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    // Vehicle interface
    interface Vehicle {
        // abstract methods
        void start();

        void stop();

        void accelerate();
    }
}
```
I Know that you don't understand about class and interface, don't worry we will learn about class and interface in the next chapter.

## Examples of Java Data Types Programs
### 1. Write a Java program to convert temperature from Fahrenheit to Celsius degree.
```java
public class FahrenheitToCelsius {
    public static void main(String[] args) {
        double fahrenheit = 212;
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");
    }
}
```

### 2. Write a Java program that reads a number in inches, converts it to meters.
```java
public class InchesToMeters {
    public static void main(String[] args) {
        double inches = 100;
        double meters = inches * 0.0254;
        System.out.println(inches + " inches is " + meters + " meters");
    }
}
```

### 3. Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.
```java
public class SumOfDigits {
    public static void main(String[] args) {
        int number = 123;
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println("Sum of digits is: " + sum);
    }
}
```

### 4. Write a Java program to convert minutes into a number of years and days.
```java
public class MinutesToYearsAndDays {
    public static void main(String[] args) {
        int minutes = 3456789;
        int years = minutes / 525600;
        int days = (minutes % 525600) / 1440;
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");
    }
}
```

### 5. Write a Java program that prints the current time in GMT.
```java
public class CurrentTime {
    public static void main(String[] args) {
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;
        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
    }
}
```

### 6. Write a Java program to compute body mass index (BMI).
```java
import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        double weight = Scanner.nextDouble();
        System.out.print("Input weight in kilogram: ");
        double height = Scanner.nextDouble();
        System.out.print("Input height in meters: ");
        double bmi = weight / (height * height);
        System.out.println("Body Mass Index is: " + bmi);
    }
}
```

### 7. Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.
```java
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input an integer between 0 and 1000: ");
        int number = input.nextInt();
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println("The sum of all digits in " + number + " is " + sum);
    }
}
```
