/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creditcard;
import java.util.Scanner;
/**
 *
 * @author 1796137
 */
public class CreditCard 
{

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) 
  {
    // instantiate a scanner
    Scanner input = new Scanner(System.in);
    // get salary
    System.out.print("What is your salary: ");
    double salary = input.nextDouble();
    //get credit
    System.out.print("What is your credit: ");
    int credit = input.nextInt();
    // method invocation
    boolean accepted = qualified(salary, credit);
    
    if (accepted)
      System.out.println("Congratulation! You are qualified!");
    else
      System.out.println("Sorry! You are not qualified!");
  }
  
  public static boolean qualified(double num, int credit)
  {
    return (num >= 20000 && credit >= 7);
  }
  
}
