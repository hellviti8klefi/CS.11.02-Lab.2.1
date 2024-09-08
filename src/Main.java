import static java.awt.AWTEventMulticaster.add;
/**
 *****************************************************************************************************
 * By writing your name in the space provided below, you are honouring the CIS academic honesty pledge
 * “I have neither given nor received unauthorized aid on this piece of work.”
 * NAME: Miya Ruijs
 *****************************************************************************************************
 */

public class Main {
    public static void main(String[] args) {
        int sum = add(3, 8);
        System.out.println("Sum = " + sum);
        int sumTwo = add(3, 8,4,5);
        System.out.println("Sum of four numbers = " +sumTwo);
        String morningGreetingResult = morningGreeting("Bob");
        System.out.println(morningGreetingResult);
        String afternoonGreetingResult = afternoonGreeting("Bob");
        System.out.println(afternoonGreetingResult);
        String tripled = triple("12345678");
        System.out.println("String tripled = " + tripled);
        double halfValue = half(346);
        System.out.println("Half of 346 = " + halfValue);
        int roundedPositive = roundPositiveValueToNearestInteger(4.7);
        System.out.println("Rounded positive value = : " + roundedPositive);
        int roundedNegative = roundNegativeValueToNearestInteger(-8.9);
        System.out.println("Rounded negative value = : " + roundedNegative);



    }

    // 1. add
    public static int add(int a, int b) {
        return a + b;
    }
    // 2. add
    public static int add(int a, int b, int c, int d) {
        return add(add(a,b), add(c,d)); // can also just follow the first example --> this version calls the two-parameter add method
    }
    // 3. morningGreeting
    public static String morningGreeting(String name) {
        return "早上好，" + name + "!";
    }
    // 4. afternoonGreeting
    public static String afternoonGreeting(String name) {
        return "下午好，" + name + "!";
    }

    // 5. triple
    public static String triple(String input) {
        return input + input + input;
    }
    // 6. half
    public static double half(int value) {
        return value/2.0;
    }
    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger (double value)
    {
        return (int) Math.round(value); //im lazy so i just used the math round function instead of (a - (int)a < 0.5)
    }
    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger (double value)
    {
        return (int) Math.round(value);
    }
}
