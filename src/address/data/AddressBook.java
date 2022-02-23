package address.data;

import java.util.ArrayList;

/**The AddressBook class is the component used to add the information to the
 Address Book application about the of a person.
 @author Adrian Anderson
 @since Jan. 29, 2022
 @version 1.0.1
 **/

public class AddressBook {

    /**
     * The addressEntryList is the Array List that stores the entries of the Address Book.
     */
    ArrayList<AddressEntry> addressEntryList;

    /**
     * Default constructor
     */
   public AddressBook(){
       addressEntryList = new ArrayList<>();
   }

    /**
     * The add method is to add each entry to the Address Book.
     * @param entry the AddressEntry Object to be added to the Address Book.
     */
   public void add(AddressEntry entry){
       addressEntryList.add(entry);
   }

    /**
     * The list method is to iterate through the addressEntryList  and print each object.
     */
   public void list(){
       for (AddressEntry entry: addressEntryList ) {

           System.out.println(entry);
       }
   }

   public void remove(){

   }
}
