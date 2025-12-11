package oops;

	class Calculator {
		double num1;
		double num2;

		void add() {
			System.out.println("Addition: " + (num1 + num2));
		}

		void subtract() {
			System.out.println("Subtraction: " + (num1 - num2));
		}

		void multiply() {
			System.out.println("Multiplication: " + (num1 * num2));
		}

		void divide() {
			if (num2 != 0) {
				System.out.println("Division: " + (num1 / num2));
			} else {
				System.out.println("Division: Cannot divide by zero");
			}
		}
	}
public class calculation{
	
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        calc.num1 = 12;
        calc.num2 = 4;

        calc.add();
        calc.subtract();
        calc.multiply();
        calc.divide();
    	}
	}

