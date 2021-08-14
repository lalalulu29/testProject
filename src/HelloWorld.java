import java.sql.Struct;

public class HelloWorld {


    public static void main(String[] args) {
        // print text in console
        System.out.println("It's alive! It's alive!");
        System.out.println();
        System.out.println(doubleExpression(5, 1, 6));
        testFunc();
    }

    public static int leapYearCount(int year) {
        return year / 4  - year / 100 + year / 400;
    }

    public static boolean doubleExpression(double a, double b, double c) {
        return Math.abs(a + b - c) < 0.00000001;
    }
    public static void testFunc() {
        byte number = 127;
        System.out.println(number);
        number++;
        System.out.println(number);
    }



}
