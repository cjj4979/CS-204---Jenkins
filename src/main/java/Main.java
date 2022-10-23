import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Calculator calculator = new Calculator();
    String s = "";
    String[] words;
    System.out.println("Welcome to the calculator");
    System.out.println("Enter a command:");
    do  {
      s = in.nextLine();
      words = s.split(" ");
      if (words[0].equals("add")) {
        System.out.println(calculator.add(Integer.valueOf(words[1]), Integer.valueOf(words[2])));
      }
      else if (words[0].equals("subtract")) {
        System.out.println(calculator.subtract(Integer.valueOf(words[1]), Integer.valueOf(words[2])));
      }
      else if (words[0].equals("multiply")) {
        System.out.println(calculator.multiply(Integer.valueOf(words[1]), Integer.valueOf(words[2])));
      }
      else if (words[0].equals("divide")) {
        System.out.println(calculator.divide(Integer.valueOf(words[1]), Integer.valueOf(words[2])));
      }
      else if (words[0].equals("fibonacci")) {
        System.out.println(calculator.fibonacciNumberFinder(Integer.valueOf(words[1])));
      }
      else if (words[0].equals("binary")) {
        System.out.println(calculator.intToBinaryNumber(Integer.valueOf(words[1])));
      }
    } while ((in.hasNext()));
  }
}
