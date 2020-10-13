import java.util.Scanner;
/**
 *
 * @author 
 */
public class Main {
  
  public static void examgrade(int grade){
  if (grade<50){System.out.println("F");}
  if (grade>=50){System.out.println("D");}
  if (grade<69){System.out.println("C");}
  if (grade>70){System.out.println("B");}
  if (grade>80){System.out.println("A");}
  }
  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Scanner input = new Scanner(System.in);
    // asks user for input
    System.out.println("Enter exam grade");
    // gets user input
    int grade = input.nextInt();
    examgrade(grade);


  }
  
  }



