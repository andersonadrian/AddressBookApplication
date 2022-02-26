package address.data;

/**The AddressEntry class represents the information of the
 entry object in address book and about information of a person.
 @author Adrian Anderson
 @since Jan. 29, 2022
 @version 1.0.1
 **/

/**
 * The AddressEntry class represents the information of the
 *  entry object in address book and about information of a person.
 */
public class AddressEntry {

    /** firstName represents the string of that is the first name of
     * user of the application**/
    private String firstName = "";

    /** lastName represents the string of that is the last name of
     * user of the application**/
    private String lastName = "";

    /** street represents the string of that is the street of
     * user of the application**/
    private String street = "";

    /** city represents the string of that is the city of
     * user of the application**/
    private String city = "";

    /** state represents the string of that is the state of
     * user of the application**/
    private String state = "";

    /** zip represents the string of that is the first name of
     * user of the application**/
    private int zip = 0;

    /** telephone represents the string of that is the first name of
     * user of the application**/
    private String telephone = "";

    /** email represents the string of that is the email of
     * user of the application**/
    private String email = "";

    /**
     * Default constructor
     */
    public AddressEntry() {
        firstName = "";
        lastName = "";
        street = "";
        city = "";
        state = "";
        zip = 0;
        telephone = "";
        email = "";

    }

    /**
     * Overloaded constructor of the Address Entry
     * @param firstName first name to be passed in the constructor.
     * @param lastName last name to be passed in the constructor.
     * @param street   street name to be passed in the constructor.
     * @param city     city name to be passed in the constructor.
     * @param state    state name to be passed in the constructor.
     * @param zip      zip code to be passed in the constructor.
     * @param telephone telephone number to be passed in the constructor.
     * @param email     e-mail address to be passed in the constructor.
     */
    public AddressEntry(String firstName, String lastName, String street,
                        String city, String state, int zip, String telephone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.telephone = telephone;
        this.email = email;


    }

    @Override
    public String toString() {
        return "AddressEntry{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip=" + zip +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    /**
     * Gets firstName
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets firstName to firstName
     * @param firstName the first name set to firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets lastName
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets lastName to lastName
     * @param lastName Sets the last name to the new last Name
     */

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets street name
     * @return the street name
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets street to street
     * @param street sets the street name to the new street name
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * Gets city name
     * @return the city name
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets city to the new city
     * @param city sets the city name to the new city name
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Gets state name
     * @return the state name
     */
    public String getState() {
        return state;
    }

    /**
     * Sets state to the new state
     * @param state sets the state name to the new state name
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Gets the zip code
     * @return the zip code
     */
    public int getZip() {
        return zip;
    }

    /**
     * Sets the zip code to the new zip code
     * @param zip sets the zip code name to the new zip code
     */
    public void setZip(int zip) {
        this.zip = zip;
    }

    /**
     * Gets the telephone number
     * @return the telephone number
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * Sets the telephone number to the new telephone number
     * @param telephone number name to the new zip code
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * Gets the email address
     * @return the email address
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email address to the new email address
     * @param email address to the new email address
     */
    public void setEmail(String email) {
        this.email = email;
    }

}


