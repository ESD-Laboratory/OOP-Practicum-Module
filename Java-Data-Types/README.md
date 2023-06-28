## Java Data Types

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
