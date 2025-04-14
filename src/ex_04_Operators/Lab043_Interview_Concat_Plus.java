package ex_04_Operators;

public class Lab043_Interview_Concat_Plus {
    public static void main(String[] args) {
        String first_name = "Jayadeep";
        String last_name = "Parvathini";

        int a = 10;
        int b = 10;

        System.out.println(first_name + last_name + a + b);
        // // JayadeepParvathini1010 - first operator - + performed as concatenation

        System.out.println(a+ b+ first_name + last_name );

        System.out.println(first_name + last_name + (a + b));

        //BODMAS - Bracket pf Div, Mul, ADD, SUB
    }
}
