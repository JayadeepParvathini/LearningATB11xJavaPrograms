package ex_04_Operators;

public class Lab040_Relational_Operators {
    public static void main(String[] args) {
        // < Less Than
        // < = -> Less than or equal to
        // > Greater
        // > = Greater or equal
        // == -> Equal to (but checking)
        // != -> Not equal

        // All of them will result boolean output

        int a = 10;
        int b = 30;
        boolean c = a > b; // // 10>30
        System.out.println(c);

        int age_woman = 33;
        int age_man = 34;
        boolean result = age_man >= age_woman;
        System.out.println(result);
    }
}
