/*	
    Course: COMP 170, Spring 1 2026
    System: zyBooks, Mac 26.2
    Author: Caden Sedo
*/
import java.util.Scanner;
public class DailyLog {
    public static void main(String[] args) throws Exception {
        Scanner scnr = new Scanner(System.in);

        //DECLARATIONS
        int attendantID = 0;
        int dogID = 0;
        final int sentinel = -1;

        int redTotalMins = 0;
        int greenTotalMins = 0;
        int yellowTotalMins = 0;
        int blueTotalMins = 0;
        double minsWithDog = 0;

        int redTotalCount = 0;
        int greenTotalCount = 0;
        int yellowTotalCount = 0;
        int blueTotalCount = 0;
        int totalEntries = 0;
        
        String attendantName = "";
        String dogName = "";
        String dogNote = "";
        String dogGroup = "";
        
        final String redGroup = "Red";
        final String greenGroup = "Green";
        final String yellowGroup = "Yellow";
        final String blueGroup = "Blue";

        //WELCOME MESSAGE
        System.out.println("Welcome to the MPLS care attendant daily log program.  This program will allow you to enter a care attendant id and produce a log for the dogs under the attendant's care.");

        //Create Space
        System.out.println();

        //OUTPUT OF CARE ATTENDANT INFO.
       
            System.out.println("Enter 11 for Noah Charles");
            System.out.println("Enter 22 for Silas Alexander");
            System.out.println("Enter 33 for Chris Isaac");
            System.out.println("Enter 44 for Mya Lynn");

            //PRIMER
            System.out.println("To get started, please enter a care attendant's id from the list above");
            System.out.print("Enter ID #: ");
                attendantID = Integer.parseInt(scnr.nextLine());

            //Enfore that only 11, 22, 33, 44 and sentinel value can be entered and loop until true
        while (attendantID != sentinel) {
            while (attendantID != 11 && attendantID != 22 && attendantID != 33 && attendantID != 44 && attendantID != sentinel) {
                System.out.println("Sorry, Invalid attendant ID #, please enter a valid id.");
                System.out.print("Enter ID #: ");
                attendantID = Integer.parseInt(scnr.nextLine());
            }
            
            //DEPENDING ON WHAT ATTENDANT ID WAS ENTERED, IT WILL PRINT THEIR SPECIFIC DOGS UNDER THEIR CARE
            if (attendantID == 11) {
                attendantName = "Noah";
                attendantID = 11;
                System.out.println();
                System.out.println("Enter 348 for Badger");
                System.out.println("Enter 301 for Hoosier");
                System.out.println("Enter 388 for Husker");
                System.out.println("Enter 391 for Bucky");
                System.out.println("Enter 362 for Nittany");
                System.out.println("Enter 311 for Wolvey");  
            }
            else if (attendantID == 22) {
                attendantName = "Silas";
                attendantID = 22;
                System.out.println();
                System.out.println("Enter 325 for Spartan");
                System.out.println("Enter 388 for Hawk");
                System.out.println("Enter 333 for Gopher");
            }
            else if (attendantID == 33) {
                attendantName = "Chris";
                attendantID = 33;
                System.out.println();
                System.out.println("Enter 362 for Nittany");
                System.out.println("Enter 311 for Wolvey");
                System.out.println("Enter 388 for Hawk");
                System.out.println("Enter 333 for Gopher");
            }
            else if (attendantID == 44) {
                attendantName = "Mya";
                attendantID = 44;
                System.out.println();
                System.out.println("Enter 348 for Badger");
                System.out.println("Enter 301 for Hoosier");
                System.out.println("Enter 388 for Husker");
                System.out.println("Enter 391 for Bucky");
                System.out.println("Enter 325 for Spartan");
            }
            System.out.print(attendantName + ", enter id # from the dogs above:");
                dogID = Integer.parseInt(scnr.nextLine());

            //Enforce that dog ID is an applicable number according to the chart
            if (attendantID == 11) {
                while (dogID != 348 && dogID != 301 && dogID != 388 && dogID != 391 && dogID != 362 && dogID != 311) {
                    System.out.println("Sorry, Invalid dog ID, Please enter an applicable dog id number");
                    System.out.print("Dog id: ");
                    dogID = Integer.parseInt(scnr.nextLine());
                }
            }
            else if (attendantID == 22) {
                while (dogID != 325 && dogID != 388 && dogID != 333) {
                    System.out.println("Sorry, Invalid dog ID, Please enter an applicable dog id number");
                    System.out.print("Dog id: ");
                    dogID = Integer.parseInt(scnr.nextLine());
                }
            }
            else if (attendantID == 33) {
                while (dogID != 388 && dogID != 333 && dogID != 362 && dogID != 311) {
                    System.out.println("Sorry, Invalid dog ID, Please enter an applicable dog id number");
                    System.out.print("Dog id: ");
                    dogID = Integer.parseInt(scnr.nextLine());
                }
            }
            else if (attendantID == 44) {
                while (dogID != 348 && dogID != 301 && dogID != 325 && dogID != 388 && dogID != 391) {
                    System.out.println("Sorry, Invalid dog ID, Please enter an applicable dog id number");
                    System.out.print("Dog id: ");
                    dogID = Integer.parseInt(scnr.nextLine());
                }
            }

                    //Gather rest of information such as total numbers of min. spent with dog and dog note
            System.out.print("Enter total number of minutes spent with dog: ");
                minsWithDog = Integer.parseInt(scnr.nextLine());
            System.out.print("Enter note about dog: ");
                dogNote = scnr.nextLine();
            
            //Determine color count and total time spent by color

                
            if (dogID == 388) { //ATTENDANT 11 AND 44 HAVE DOG WITH AN ID OF 388 (HUSKER) WHICH BELONGS TO THE RED GROUP
                if (attendantID == 11 || attendantID == 44) {
                    dogGroup = redGroup;
                    redTotalCount++;
                    redTotalMins += minsWithDog;
                }
                else { //IF THE ATTENDANT ID DOESN'T MATCH 11 OR 44, THE DOG (HAWK) BELONGS TO THE YELLOW GROUP
                    dogGroup = yellowGroup;
                    yellowTotalCount++;
                    yellowTotalMins += minsWithDog;
                }
            }
            else if (dogID == 348 || dogID == 301 || dogID == 391) {
                dogGroup = redGroup;
                redTotalCount ++;
                redTotalMins += minsWithDog;
            }
            else if (dogID == 325) {
                dogGroup = greenGroup;
                greenTotalCount++;
                greenTotalMins += minsWithDog;
            }
            else if (dogID == 333) {
                dogGroup = yellowGroup;
                yellowTotalCount++;
                yellowTotalMins += minsWithDog;
            }
            else if (dogID == 362 || dogID == 311) {
                dogGroup = blueGroup;
                blueTotalCount++;
                blueTotalMins += minsWithDog;
            }

                    //Increment count for total entries
            totalEntries++;

                    //OUTPUT OF CARE ATTENDANT INFO.
            System.out.println("Dog Information:");
                System.out.println("*********************************");
                System.out.println("Attendant ID #:\t" + attendantID);
                System.out.println("Dog ID #:\t" + dogID);
                System.out.println("Min. w/Dog:\t" + minsWithDog);
                System.out.println("Notes:\t" + dogNote);
                System.out.println("*********************************");
                System.out.println();

                    //Reprompt user to enter another user and enforce that only care attendant ID #'s are entered' 
            System.out.println("Enter 11 for Noah Charles");
            System.out.println("Enter 22 for Silas Alexander");
            System.out.println("Enter 33 for Chris Isaac");
            System.out.println("Enter 44 for Mya Lynn");
            System.out.print("Enter another ID # or enter -1 to exit: ");
                attendantID = Integer.parseInt(scnr.nextLine());

                    //Enfore that only 11, 22, 33 and 44 can be entered, including sentinel value
            while (attendantID != 11 && attendantID != 22 && attendantID != 33 && attendantID != 44 && attendantID != sentinel) {
                System.out.println("Sorry, Invalid attendant ID #, please enter a valid id.");
                System.out.print("Enter ID #: ");
                attendantID = Integer.parseInt(scnr.nextLine());
            }
        }

        //Output total time and count by color 
        System.out.println();
        System.out.println("Thanks for entering your dog logs");
        System.out.println("*************************************");
        System.out.println("Total # of log entries: " + totalEntries);
        System.out.println("\tRed total count: " + redTotalCount + " \tRed total # of min.: " + redTotalMins);
        System.out.println("\tGreen total count: " + greenTotalCount + " \tGreen total # of min.: " + greenTotalMins);
        System.out.println("\tYellow total count: " + yellowTotalCount + " \tYellow total # of min.: " + yellowTotalMins);
        System.out.println("\tBlue total count: " + blueTotalCount + " \tBlue total # of min.: " + blueTotalMins);
    }
}