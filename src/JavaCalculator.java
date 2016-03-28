import java.util.Scanner;
public class JavaCalculator {

	public static void main(String[] args){
		int num1, num2, num3, sum1, sum2;
		String function = "";
		String function2 = "";
		Scanner in = new Scanner(System.in);
		Scanner text = new Scanner(System.in);
		System.out.println("Enter your first number");
		num1 = in.nextInt();
		System.out.println("Enter your second number");
		num2 = in.nextInt();
		System.out.println("Enter a function");
		function = text.nextLine();
		
		if (function.equals("+")){
			sum1 = methodFunction.add(num1,num2);
			System.out.println(sum1);
			do{
				System.out.println("Enter another number");
				num3 = in.nextInt();
				System.out.println("Enter the next function");
				function2 = text.nextLine();
				if (function2.equals("+")){
					sum2 = methodFunction.add(sum1,num3);
					sum1 = sum2;
					System.out.println(sum1);
				}
				else if (function2.equals("-")){
					sum2 = methodFunction.subtract(sum1,num3);
					sum1 = sum2;
					System.out.println(sum1);
				}
				else if (function2.equals("*")){
					sum2 = methodFunction.multiple(sum1,num3);
					sum1 = sum2;
					System.out.println(sum1);
				}
				else if (function2.equals("/")){
					sum2 = methodFunction.divide(sum1,num3);
					sum1 = sum2;
					System.out.println(sum1);
				}
			} while(function.equals("+"));
		}
		else if (function.equals("-")){
			sum1 = methodFunction.subtract(num1,num2);
			System.out.println(sum1);
			do{
				System.out.println("Enter another number");
				num3 = in.nextInt();
				System.out.println("Enter the next function");
				function2 = text.nextLine();
				if (function2.equals("+")){
					sum2 = methodFunction.add(sum1,num3);
					sum1 = sum2;
					System.out.println(sum1);
				}
				else if (function2.equals("-")){
					sum2 = methodFunction.subtract(sum1,num3);
					sum1 = sum2;
					System.out.println(sum1);
				}
				else if (function2.equals("*")){
					sum2 = methodFunction.multiple(sum1,num3);
					sum1 = sum2;
					System.out.println(sum1);
				}
				else if (function2.equals("/")){
					sum2 = methodFunction.divide(sum1,num3);
					sum1 = sum2;
					System.out.println(sum1);
				}
			} while(function.equals("-"));
		}
		else if (function.equals("*")){
			sum1 = methodFunction.multiple(num1,num2);
			System.out.println(sum1);
			do{
				System.out.println("Enter another number");
				num3 = in.nextInt();
				System.out.println("Enter the next function");
				function2 = text.nextLine();
				if (function2.equals("+")){
					sum2 = methodFunction.add(sum1,num3);
					sum1 = sum2;
					System.out.println(sum1);
				}
				else if (function2.equals("-")){
					sum2 = methodFunction.subtract(sum1,num3);
					sum1 = sum2;
					System.out.println(sum1);
				}
				else if (function2.equals("*")){
					sum2 = methodFunction.multiple(sum1,num3);
					sum1 = sum2;
					System.out.println(sum1);
				}
				else if (function2.equals("/")){
					sum2 = methodFunction.divide(sum1,num3);
					sum1 = sum2;
					System.out.println(sum1);
				}
			} while(function.equals("*"));
		}
		else if (function.equals("/")){
			sum1 = methodFunction.divide(num1,num2);
			System.out.println(sum1);
			do{
				System.out.println("Enter another number");
				num3 = in.nextInt();
				System.out.println("Enter the next function");
				function2 = text.nextLine(); // function 2 = new math function
				if (function2.equals("+")){ // add
					sum2 = methodFunction.add(sum1,num3);
					sum1 = sum2;
					System.out.println(sum1);
				}
				else if (function2.equals("-")){ // subtract
					sum2 = methodFunction.subtract(sum1,num3);
					sum1 = sum2;
					System.out.println(sum1);
				}
				else if (function2.equals("*")){ // multiple
					sum2 = methodFunction.multiple(sum1,num3);
					sum1 = sum2;
					System.out.println(sum1);
				}
				else if (function2.equals("/")){ // divide
					sum2 = methodFunction.divide(sum1,num3);
					sum1 = sum2;
					System.out.println(sum1);
				}
			} while(function.equals("/"));
		}
		in.close(); // closing scanners
		text.close(); // closing scanners
	}
}
