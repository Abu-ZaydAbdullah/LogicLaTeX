import java.util.Scanner;
import java.util.ArrayList;

public class LogicLatex {

    public static void main(String[] args) {
        ArrayList < String > equation = new ArrayList < > ();
        Scanner sc = new Scanner(System.in);
        int answer = 1;
        while (answer == 1) {
            System.out.println("Welcome to the LaTeX Logical Equation Builder for Discrete Math!\n");
            String response = "";

            while (!"0".equals(response)) {
                System.out.println("Please choose which symbol you would like to insert into the equation:\n");
                System.out.println("To exit (0):");
                System.out.println("Negation (1):");
                System.out.println("AND (2):");
                System.out.println("OR (3):");
                System.out.println("XOR (4):");
                System.out.println("IMPLIES (5):");
                System.out.println("BICONDITIONAL (6):");
                System.out.println("EQUIVALENCE (7):");
                System.out.println("( [(](8):");
                System.out.println(") [)](9):");
                System.out.println("p (p)(10):");
                System.out.println("q (q)(11):");
                System.out.println("DELETE PREVIOUS (12):\n");
                System.out.print("Enter choice here: ");
                response = sc.next();
                System.out.println();

                if (response.equals("1")){
                    equation.add("\\neg ");
                } else if (response.equals("2")) {
                    equation.add("\\ \\land\\ ");
                } else if (response.equals("3")) {
                    equation.add("\\ \\lor\\ ");
                } else if (response.equals("4")) {
                    equation.add(" \\oplus ");
                } else if (response.equals("5")) {
                    equation.add(" \\rightarrow\\ ");
                } else if (response.equals("6")) {
                    equation.add(" \\leftrightarrow\\ ");
                } else if (response.equals("7")) {
                    equation.add(" \\equiv ");
                } else if (response.equals("8") || response.equals("(")) {
                    equation.add(" $($");
                } else if (response.equals("9") || response.equals(")")) {
                    equation.add("$)$ ");
                } else if (response.equals("10") || response.equals("p")) {
                    equation.add("$p$");
                } else if (response.equals("11") || response.equals("q")) {
                    equation.add("$q$");
                } else if (response == "12") {
                    equation.remove(equation.size() - 1);
                }
            }
            printEquation(equation);
            System.out.println("Would you like to build a new equation (0 or 1): ");
            answer = sc.nextInt();
        }
    }

    public static void printEquation(ArrayList < String > equation) {
        System.out.println("Rendered Equation: ");
        for (int i = 0; i < equation.size(); i++) {
            System.out.print(equation.get(i));
        }
        System.out.println("\n");
    }
}
