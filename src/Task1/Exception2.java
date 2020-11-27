package Task1;

import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer ");
        String intString = myScanner.next();
        int i = Integer.parseInt(intString);
        System.out.println(2 / i);
    }

    public static void main(String[] args) {
        Exception2 exception2 = new Exception2();

            try
            {
                exception2.exceptionDemo();
            }
            catch (Exception e)
            {
                System.out.println("Infinity...");
            }
            finally
            {
                System.out.println("End of program...");
            }
        }
    }
