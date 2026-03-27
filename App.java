public class App {
  static void run() {
    System.out.println("1) Add\n2) Subtract\n3) Multiply\n0 Exit");
      System.out.println("Your choice: ");
      String choice= new java.util.Scanner(System.in).nextLine();
      if ("1".equals(choice))
          System.out.println("1) Add\n2) Subtract\n0) Exit");
      double a=Double.parseDouble(new java.util.Scanner(System.in).nextLine());
  }
}
