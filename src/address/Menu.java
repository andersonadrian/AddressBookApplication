package address;

/**The Menu class represents the menu of the
 AddressBook application.
 @author Adrian Anderson
 @since Jan. 29, 2022
 @version 1.0.1

 **/

import address.data.AddressBook;
import address.data.AddressEntry;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;  // Import the Scanner class

public class Menu {

    AddressBook addressBook;
    /**
     * Default constructor
     */
    public Menu(){
        addressBook = new AddressBook();
    }

    public void addressAppMenu() {

        String menu = " \n" +
                "\n" +
                "*************************\n" +
                "Please enter your menu selection\n" +
                "a) Loading From File\n" +
                "b) Addition\n" +
                "c) Removal\n" +
                "d) Find\n" +
                "e) Listing\n" +
                "f) Quit\n" +
                "*************************";
        Scanner prompt = new Scanner(System.in);  // Create a Scanner object
        boolean shouldQuit = true;
        while(shouldQuit) {
            System.out.println(menu);
            char promptLetter = prompt.next().charAt(0);  // Read user input
            shouldQuit = promptLetter != 'f';
            System.out.println("You choose : " + promptLetter);  // Output user input

            switch (promptLetter) {
                case 'a':
                    // code block
                    Scanner  filePath = new Scanner(System.in);  // Create a Scanner object
                    System.out.println("Please enter the file name ex. addressBookList.txt");
                    System.out.println("Enter here : ");

                    String fileName = filePath.nextLine();  // Read user input
                     addressBook.read(fileName);

                    break;
                case 'b':
                    AddressEntry addressEntry = new AddressEntry();
                    System.out.println("Please enter each item separately first-name last-name street city state zip phone number and email address: ");
                    addressEntry.setFirstName(prompt_FirstName());
                    addressEntry.setLastName(prompt_FirstName());
                    addressEntry.setStreet(prompt_FirstName());
                    addressEntry.setCity(prompt_FirstName());
                    addressEntry.setState(prompt_FirstName());
                    addressEntry.setZip(prompt_Zip());
                    addressEntry.setTelephone(prompt_Telephone());
                    addressEntry.setEmail(prompt_Email());
                    addressBook.add(addressEntry);
                    System.out.println("Contact Added!");
                    // code block
                    break;
                case 'c':
                    Scanner  scannerForRemoval = new Scanner(System.in);  // Create a Scanner object
                    System.out.println("Enter the last name of the entry you would like to delete: ");
                    String userLastNameToBeRemoved = scannerForRemoval.nextLine();  // Read user input
                    addressBook.remove(userLastNameToBeRemoved);

                    // code block
                    break;
                case 'd':
                    Scanner  scannerForRetrieval = new Scanner(System.in);  // Create a Scanner object
                    System.out.println("Enter the last name of the entry you would like to delete: ");
                    String userLastNameForRetrieval = scannerForRetrieval.nextLine();  // Read user input
                    addressBook.find(userLastNameForRetrieval);
                    // code block
                    break;
                case 'e':
                    addressBook.list();
                    // code block
                    break;
                case 'f':
                    System.out.println("Quiting........");
                    // code block
                    break;
                default:
                    // code block
                    System.out.println("That letter is not an option");

            }
        }

    }


    /**
     * prompt_FirstName  generates a standard output prompt for the First Name to be entered
     * @return String
     */
    public String prompt_FirstName() {
        Scanner firstName = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter first name: ");

        String userFirstName = firstName.nextLine();  // Read user input

       return  userFirstName;

    }

    /**
     * prompt_LastName  generates a standard output prompt for the Last Name to be entered
     * @return String
     */
    public String prompt_LastName() {

        Scanner  lastName = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter last name: ");

        String userLastName = lastName.nextLine();  // Read user input

        return userLastName;

    }

    /**
     * prompt_Street  generates a standard output prompt for the Street to be entered
     * @return String
     */
    public String prompt_Street() {

        Scanner street = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter street:");

        String userStreet = street.nextLine();  // Read user input

        return userStreet;

    }

    /**
     * prompt_City  generates a standard output prompt for the City to be entered
     * @return String
     */
    public String prompt_City() {

        Scanner city = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter city: ");

        String userCity = city.nextLine();  // Read user input

        return userCity;

    }

    /**
     * prompt_State  generates a standard output prompt for the State to be entered
     * @return String
     */
    public String prompt_State() {

        Scanner state = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");

        String userState = state.nextLine();  // Read user input
        return userState;

    }

    /**
     * prompt_Zip  generates a standard output prompt for the Zip to be entered
     * @return Integer
     */
    public int prompt_Zip() {

        Scanner zip = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter city: ");

        int userZip = zip.nextInt();  // Read user input
        return userZip;

    }

    /**
     * prompt_Telephone  generates a standard output prompt for the Telephone to be entered
     * @return String
     */
    public String prompt_Telephone() {

        Scanner telephone = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter telephone: ");

        String userTelephone = telephone.nextLine();  // Read user input
        return userTelephone;

    }

    /**
     * prompt_Email  generates a standard output prompt for the Email to be entered
     * @return String
     */
    public String prompt_Email() {

        Scanner email = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter email: ");

        String userEmail = email.nextLine();  // Read user input
        return userEmail;

    }
}
