package address;

import address.data.AddressBook;
import address.data.AddressEntry;

public class AddressBookApplication {

    public static void main(String[] args) {
	// write your code here
    // simply invokes static methods of the Menu class

        //create an instance of Menu class
        Menu myMenu = new Menu();

        //create an instance of AddressBook class
        AddressBook addressBook = new AddressBook();

        //Test method initAddressBookExercise
        initAddressBookExercise(addressBook);

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
     * @param addressBook
     */
    public static void initAddressBookExercise(AddressBook addressBook){
        AddressEntry contactOne = new AddressEntry("Paul", "Henry","1650 Mannie Road",
                "Oakland", "C.A.", 94565, "510-888-8888", "paul@jvm.com");

        AddressEntry contactTwo = new AddressEntry("Marlene", "Henry","1650 Mannie Road",
                "Oakland", "C.A.", 94565, "510-999-9999", "marlene@jvm.com");

        addressBook.add(contactOne);
        addressBook.add(contactTwo);
        addressBook.list();
    }
}
