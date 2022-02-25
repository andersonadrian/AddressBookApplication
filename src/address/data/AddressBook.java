package address.data;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Map;
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

    private final ArrayList<AddressEntry> addressEntryList;

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
    * @param lastName last name of the AddressEntry Object
    * */
   public void remove(String lastName) {

       TreeMap<Integer, AddressEntry> toBeRemoved =  findEntriesByLastName(lastName);

       for(Map.Entry entry : toBeRemoved.entrySet()){
           System.out.println(entry.getKey()+" "+entry.getValue());
       }

       Scanner  scanner = new Scanner(System.in);  // Create a Scanner object
       System.out.println("Please enter the number of which one you would like to delete");
       int prompt = scanner.nextInt();  // Read user input
       addressEntryList.remove(prompt);
       System.out.println("Entry Deleted!");
   }

    /**
     * @param filepath file path for the file
     * read method loads the Addressbook information from a file
     * */
    public void read(String filepath){

        int counter = 0;
        File filename = new File(filepath);
        //create an instance of AddressBook class
        ArrayList<String> dataStore = new ArrayList<>();
        System.out.println("Adding the entries from the file................");
        try {
            Scanner myReader = new Scanner(filename);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                dataStore.add(data);
                counter += 1;
                if (counter == 8){
                    addressEntryList.add(new AddressEntry(dataStore.get(0), dataStore.get(1),dataStore.get(2),dataStore.get(3),dataStore.get(4),Integer.parseInt(dataStore.get(5)),dataStore.get(6),dataStore.get(7)));
                    dataStore.clear();
                    counter = 0;
                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    /**
     * The find method finds an entries base on the last name given.
     * @param lastName last name of the AddressEntry Object
     *
     * */

    public void find(String lastName){

        System.out.println("Here is the list of name: ");
        TreeMap<Integer, AddressEntry> addressListByLastName =  findEntriesByLastName(lastName);

        for(Map.Entry entry : addressListByLastName.entrySet()){
            System.out.println(entry.getValue());
        }

    }

    /**
     * The find method finds an entries base on the last name given and return a TreeMap of the result.
     * @param lastName last name of the AddressEntry Object
     * @return TreeMap
     *
     * */
   private TreeMap<Integer, AddressEntry> findEntriesByLastName(String lastName) {

       TreeMap<Integer, AddressEntry> addressEntryArrayListBaseOnLastNames = new TreeMap<>();
       for (int counter = 0; counter < addressEntryList.size(); counter++){

           if (lastName.equals(addressEntryList.get(counter).getLastName())){
               addressEntryArrayListBaseOnLastNames.put(counter, addressEntryList.get(counter));
           }

       }
       return addressEntryArrayListBaseOnLastNames;
   }
}
