public class App {
  static void run() {
    System.out.println("1) Add\n2) Subtract\n3) Multiply\n4) Divide\n0 Exit");
      System.out.println("Your choice: ");
      String choice= new java.util.Scanner(System.in).nextLine();
      if ("1".equals(choice))
          System.out.println("1) Add\n2) Subtract\n0) Exit");
      if ("2".equals(choice)) System.out.println(Calculator.sub(a,b));
      double a=Double.parseDouble(new java.util.Scanner(System.in).nextLine());
      double b = Double.parseDouble(new java.util.Scanner(System.in).nextLine());

      if("3".equals(choice)) System.out.println(Calculator.mul(a,b));
      if("4".equals(choice) System.out.println(Calculator.div(a,b));
  }

  public static void main(String[] args) { run(); }
}
