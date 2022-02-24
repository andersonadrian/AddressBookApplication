package address.data;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

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
       addressEntryList =   new ArrayList<>();
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

   /**
    * The remove method removes an entry base on the last name given.
    * @param lastName
    * */
   public TreeMap<Integer, String> remove(String lastName) {

       return find(lastName);

   }

    /**
     * @param filepath
     * read method loads the Addressbook information from a file
     * @return ArrayList</String>
     * */
    public ArrayList read(String filepath){

        File filename = new File(filepath);
        //create an instance of AddressBook class
        ArrayList<String> dataStore = new ArrayList<>();
        try {
            Scanner myReader = new Scanner(filename);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                dataStore.add(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return dataStore;
    }

    /**
     * The find method finds an entries base on the last name given.
     * @param lastName
     * @return*/
   public TreeMap<Integer, String> find(String lastName) {

       TreeMap<Integer, String> addressEntryArrayListBaseOnLastNames = new TreeMap<>();
       for (int counter = 0; counter < addressEntryList.size(); counter++){

           if (lastName.equals(addressEntryList.get(counter).getLastName())){
               addressEntryArrayListBaseOnLastNames.put(counter, addressEntryList.get(counter).getLastName());
           }

       }
       return addressEntryArrayListBaseOnLastNames;
   }
}
