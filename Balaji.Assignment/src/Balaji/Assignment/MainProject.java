package Balaji.Assignment;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class MainProject {
 public static void main(String[] args) {
  welcomeScreen();
  try {
   menuDriven();
  } catch (FileNotFoundException e) {
   e.printStackTrace();
  } 
 }

 private static void welcomeScreen() {
  System.out.println("__________________LockedMe.com__________________\n");
  
  System.out.println("__________________by Company Lockers Pvt. Ltd.__________________\n");
  
  System.out.println("__________________Created by Balaji Venkat__________________\n");
 }

//  * @throws FileNotFoundException 
 private static void menuDriven() throws FileNotFoundException {
  Scanner sc = new Scanner(System.in);
  WorkingoftheProject obj = new WorkingoftheProject();
  int option;
  do {
  System.out.println("Enter the options that you want to select : \n");
  System.out.println("\t1. Retrieve current filenames in a sequntial order \n");
  System.out.println("\t2. Business-level operation menu \n");
  System.out.println("\t3. Exit from the application \n");
  
  option=sc.nextInt();
  switch(option) {
  case 1:
   obj.showAllFiles();
   break;
  case 2:
   int ch;
  do {
   System.out.println("Enter your options for the Business level operation :-");
   System.out.println("\t1. Add a file and its content to a directory.");
   System.out.println("\t2. Delete a file from a directory!");
   System.out.println("\t3. Searching a file and showing its content...");
   System.out.println("\t4. Exit from BOL menu.");
   
   ch=sc.nextInt();
   switch(ch) {
   case 1:
    obj.addFile();
    break;
   case 2:
    obj.deleteFile();
    break;
   case 3:
    obj.searchFile();
    break;
   case 4:
    System.out.println("Exited from the Business Level operation...");
    System.out.println("---------------------------------\n");
    break;
   default:
    System.out.println("Invalid option Entered");
    break;
   }
  }while(ch!=4);
  break;
  case 3:
   System.out.println("Exiting from the application...");
   break;
  default:
   System.out.println("Invalid option Entered");
  }
  }while(option!=3);

 }
}