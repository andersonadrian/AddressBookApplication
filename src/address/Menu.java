package address;

/**The Menu class represents the menu of the
 AddressBook application.
 @author Adrian Anderson
 @since Jan. 29, 2022
 @version 1.0.1

 **/
public class Menu {


    /**
     * Default constructor
     */
    public Menu(){

    }


    /**
     * prompt_FirstName  generates a standard output prompt for the First Name to be entered
     * @return String
     */
    public String prompt_FirstName() {

       return  "First Name:";

    }

    /**
     * prompt_LastName  generates a standard output prompt for the Last Name to be entered
     * @return String
     */
    public String prompt_LastName() {

        return "Last Name:";

    }

    /**
     * prompt_Street  generates a standard output prompt for the Street to be entered
     * @return String
     */
    public String prompt_Street() {

        return "Street:";

    }

    /**
     * prompt_City  generates a standard output prompt for the City to be entered
     * @return String
     */
    public String prompt_City() {

        return "City:";

    }

    /**
     * prompt_State  generates a standard output prompt for the State to be entered
     */
    public String prompt_State() {

        return "State:";

    }

    /**
     * prompt_Zip  generates a standard output prompt for the Zip to be entered
     */
    public String prompt_Zip() {

        return "Zip:";

    }

    /**
     * prompt_Telephone  generates a standard output prompt for the Telephone to be entered
     * @return String
     */
    public String prompt_Telephone() {

        return "Telephone:";

    }

    /**
     * prompt_Email  generates a standard output prompt for the Email to be entered
     * @return String
     */
    public String prompt_Email() {

        return "Email:";

    }
}
