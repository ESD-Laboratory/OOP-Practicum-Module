# Control Statements

## if-else
Like Python you learn in PPL/Alpro Practicum, Java also has if-else statement. The syntax is like this:
```java
if (condition) {
    // do something
} else {
    // do something else
}
```

example:
```java
public class IfElse {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        if (a < b) {
            System.out.println("a is less than b");
        } else {
            System.out.println("a is greater than b");
        }
    }
}
```

## switch-case
What if you have a lot of conditions? You can use switch-case statement, switch-case is used to select one of many code blocks to be executed.
The difference between switch-case and if-else is that switch-case can only be used for equality comparison, while if-else can be used for any type of comparison.
The syntax is like this:
```java
switch (expression) {
    case value1:
        // do something
        break;
    case value2:
        // do something
        break;
    default:
        // do something
}
```

example:
```java
public class SwitchCase {
    public static void main(String[] args) {
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}
```

## else-if
else-if is used to add more conditions to if-else statement. The syntax is like this:
```java
if (condition1) {
    // do something
} else if (condition2) {
    // do something
} else if (condition3) {
    // do something
} else {
    // do something
}
```

example:
```java
public class ElseIf {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        if (a < b) {
            System.out.println("a is less than b");
        } else if (a == b) {
            System.out.println("a is equal to b");
        } else {
            System.out.println("a is greater than b");
        }
    }
}
```

## for-loop
for-loop is used to execute a block of code a certain number of times. The syntax is like this:
```java
for (initialization; condition; increment/decrement) {
    // do something
}
```

example:
```java
public class ForLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
}
```

## while-loop
while-loop is used to execute a block of code as long as a specified condition is true. The syntax is like this:
```java
while (condition) {
    // do something
}
```

example:
```java
public class WhileLoop {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
    }
}
```

## do-while-loop
do-while-loop is used to execute a block of code at least once, and then repeatedly execute the block, as long as a specified condition is true. The syntax is like this:
```java
do {
    // do something
} while (condition);
```

example:
```java
public class DoWhileLoop {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 5);
    }
}
```

## break
break is used to exit a loop or switch-case statement. The syntax is like this:
```java
break;
```

example:
```java
public class Break {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }
    }
}
```

## continue
continue is used to skip the current iteration in a loop. The syntax is like this:
```java
continue;
```

example:
```java
public class Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }
    }
}
```

## return
return is used to exit a method. The syntax is like this:
```java
return;
```

example:
```java
public class Return {
    public static void main(String[] args) {
        int result = sum(5, 10);
        System.out.println(result);
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
```

## throw
throw is used to create a custom error. The syntax is like this:
```java
throw new Exception("Error message");
```

example:
```java
public class Throw {
    public static void main(String[] args) {
        try {
            int result = divide(5, 0);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static int divide(int a, int b) throws Exception {
        if (b == 0) {
            throw new Exception("Cannot divide by zero");
        }
        return a / b;
    }
}
```

## try-catch
try-catch is used to handle errors. The syntax is like this:
```java
try {
    // do something
} catch (Exception e) {
    // do something
}
```

example:
```java
public class TryCatch {
    public static void main(String[] args) {
        try {
            int result = divide(5, 0);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static int divide(int a, int b) throws Exception {
        if (b == 0) {
            throw new Exception("Cannot divide by zero");
        }
        return a / b;
    }
}
```

## finally
finally is used to execute code, after try and catch, regardless of the result. The syntax is like this:
```java
try {
    // do something
} catch (Exception e) {
    // do something
} finally {
    // do something
}
```

example:
```java
public class Finally {
    public static void main(String[] args) {
        try {
            int result = divide(5, 0);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This is finally");
        }
    }

    public static int divide(int a, int b) throws Exception {
        if (b == 0) {
            throw new Exception("Cannot divide by zero");
        }
        return a / b;
    }
}
```

## throw vs throws
throw is used to create a custom error, while throws is used to declare an error. The syntax is like this:
```java
throw new Exception("Error message");
```
```java

public static int divide(int a, int b) throws Exception {
    if (b == 0) {
        throw new Exception("Cannot divide by zero");
    }
    return a / b;
}
```

example:
```java
public class ThrowVsThrows {
    public static void main(String[] args) {
        try {
            int result = divide(5, 0);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static int divide(int a, int b) throws Exception {
        if (b == 0) {
            throw new Exception("Cannot divide by zero");
        }
        return a / b;
    }
}
```

## Example of Program
you can see the example program in java file in this directory.