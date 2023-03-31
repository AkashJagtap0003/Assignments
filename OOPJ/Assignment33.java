public class Assignment33 {
    public static void main(String[] args) {
        // Check if there are at least 3 arguments
        if (args.length < 3) {
            System.out.println("Please enter at least three arguments: an operation (+,-,*,/), a number, and another number.");
        } else {
            // Parse the arguments
            char operator = args[0].charAt(0);
            double num1 = Double.parseDouble(args[1]);
            double num2 = Double.parseDouble(args[2]);

            // Perform the arithmetic operation based on the operator
            switch (operator) {
                case '+':
                    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                    break;
                case '-':
                    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                    break;
                case '*':
                    System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("Cannot divide by zero.");
                    } else {
                        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                    }
                    break;
                default:
                    System.out.println("Invalid operator.");
                    break;
            }
        }
    }
}

