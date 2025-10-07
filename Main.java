import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);  // input from the keyboard
    /* ============= BEGIN SOLUTION ================================ */
    System.out.println("Please enter a double: ");
    double inmumdouble = scan.nextDouble();

    if (inmumdouble == 12.345) {
      System.out.println("YES \n");
    } else {
      System.out.println("NO \n");
    }

    System.out.println("Please enter a integer: ");
    int inmumint = scan.nextInt();

    if (inmumint == 48) {
      System.out.println("YES \n");
    } else {
      System.out.println("NO \n");
    }

    System.out.println("Please enter two integer: ");
    int inmumint1 = scan.nextInt();
    int inmumint2 = scan.nextInt();

    if (inmumint2 == (2 *inmumint1)) {
      System.out.println("YES \n");
    } else {
      System.out.println("NO \n");
    }

    System.out.println("Please enter a Divisible integer: ");
    int div = scan.nextInt();

    if ((div % 2 == 0)) {
      System.out.println("Divisible by 2! \n");
    } else if ((div % 3 == 0)) {
      System.out.println("Divisible by 3! \n");
    } else {
      System.out.println("Not Divisible by either 3 or 2! \n");
    }

    System.out.println("Please enter a Even or Odd Integer: ");
    int div1 = scan.nextInt();

    if ((div1 % 2 == 0)) {
      System.out.println("Even \n");
    } else {
      System.out.println("Odd \n");
    }

    System.out.println("Please enter a Letter Grade: ");
    scan.nextLine();
    String grad = scan.nextLine();

      switch (grad) {
        case "A":
          System.out.println("90-100 \n");
          break;
        case "B":
          System.out.println("80-90 \n");
          break;
        case "C": 
          System.out.println("70-80 \n");
          break;
        case "D":
          System.out.println("60-70 \n");
          break;
        case "F":
          System.out.println("0-60 \n");
          break;
        default: 
          System.out.println("Invalid letter grade \n");
      }

      int fran = (int) (Math.random() * 50);
      int sran = (int) ((Math.random() * 100) + 51);
      System.out.println(fran + "+" + sran + " = ? ");
      int answ = scan.nextInt();

      if (answ == (fran + sran)) {
        System.out.println("Correct! \n");
      } else {
        System.out.println("Wrong \n");
      }

      System.out.println("What is the temperature? ");
      int temp = scan.nextInt();

      if ((temp >= 97) && (temp <= 99)) {
        System.out.println("Temperature is OK. \n");
      } else {
        System.out.println("NOT NORMAL \n");
      }
    /* ============= END SOLUTION ================================== */
    scan.close();
  }
}
