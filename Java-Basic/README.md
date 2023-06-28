## Basic Java

### 1. Write a Java program to print 'Hello' on screen and then print your name on a separate line.
```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("My name is: " + "your name");
    }
}
```
### or
```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello\nMy name is: " + "your name");
    }
}
```

### 2. Write a Java program to print the sum of two numbers.
```java
public class SumOfTwoNumbers {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int sum = a + b;
        System.out.println("Sum of " + a + " and " + b + " is: " + sum);
    }
}
```

### 3. Write a Java program to divide two numbers and print on the screen.
```java
public class DivideTwoNumbers {
    public static void main(String[] args) {
        int a = 50;
        int b = 3;
        int result = a / b;
        System.out.println("Result of " + a + " / " + b + " is: " + result);
    }
}
```

### 4. Write a Java program to print the result of the following operations:
```java
public class Operations {
    public static void main(String[] args) {
        int a = -5 + 8 * 6;
        int b = (55 + 9) % 9;
        int c = 20 + -3 * 5 / 8;
        int d = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println("Result of -5 + 8 * 6 is: " + a);
        System.out.println("Result of (55 + 9) % 9 is: " + b);
        System.out.println("Result of 20 + -3 * 5 / 8 is: " + c);
        System.out.println("Result of 5 + 15 / 3 * 2 - 8 % 3 is: " + d);
    }
}
```

### 5. Write a Java program that takes two numbers as input and display the product of two numbers.
```java
import java.util.Scanner;

public class ProductOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number: ");
        int a = scanner.nextInt();
        System.out.print("Input second number: ");
        int b = scanner.nextInt();
        int product = a * b;
        System.out.println("Product of " + a + " and " + b + " is: " + product);
    }
}
```

### 6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
```java
import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        int a = Scanner.nextInt();
        int b = Scanner.nextInt();
        sum(a, b);
        multiply(a, b);
        subtract(a, b);
        divide(a, b);
        remainder(a, b);
    }

    public static void sum(int a, int b) {
        int sum = a + b;
        System.out.println("Sum of " + a + " and " + b + " is: " + sum);
    }

    public static void multiply(int a, int b) {
        int product = a * b;
        System.out.println("Product of " + a + " and " + b + " is: " + product);
    }

    public static void subtract(int a, int b) {
        int difference = a - b;
        System.out.println("Difference of " + a + " and " + b + " is: " + difference);
    }

    public static void divide(int a, int b) {
        int quotient = a / b;
        System.out.println("Quotient of " + a + " and " + b + " is: " + quotient);
    }

    public static void remainder(int a, int b) {
        int remainder = a % b;
        System.out.println("Remainder of " + a + " and " + b + " is: " + remainder);
    }
}
```
