package address;

import address.data.AddressBook;
import address.data.AddressEntry;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files


public class AddressBookApplication {

    public static void main(String[] args) {
	// write your code here
    // simply invokes static methods of the Menu class

        //create an instance of Menu class
        Menu myMenu = new Menu();

        File file = new File("C:\\Users\\Adrian Anderson\\Documents\\addresses.txt");

        //create an instance of AddressBook class
        //AddressBook addressBook = new AddressBook();

        //Test method initAddressBookExercise
        initAddressBookExercise(file);

//        System.out.println(myMenu.prompt_FirstName());
//        System.out.println(myMenu.prompt_LastName());
//        System.out.println(myMenu.prompt_Street());
//        System.out.println(myMenu.prompt_State());
//        System.out.println(myMenu.prompt_City());
//        System.out.println(myMenu.prompt_Zip());
//        System.out.println(myMenu.prompt_Telephone());
//        System.out.println(myMenu.prompt_Email());
    
    }

    /**
     * initAddressBookExercise is a method for testing
     * the functionality of the Address Book Application.
     * @param filename
     */
    public static void initAddressBookExercise(File filename){
        try {
            Scanner myReader = new Scanner(filename);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
