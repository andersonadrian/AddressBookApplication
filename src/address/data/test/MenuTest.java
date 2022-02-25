package address.data.test;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class MenuTest {

    @Test
    void addressAppMenu() {
    }

    @Test
    void prompt_FirstName() {
        Scanner firstName = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter first name: ");

        String userFirstName = firstName.nextLine();  // Read user input

        assertEquals("John", userFirstName);
    }

    @Test
    void prompt_LastName() {
        Scanner  lastName = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter last name: ");

        String userLastName = lastName.nextLine();  // Read user input

        assertEquals("Carthy", userLastName);
    }

    @Test
    void prompt_Street() {

        Scanner street = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter street:");

        String userStreet = street.nextLine();  // Read user input

        assertEquals("123 3rd Ave", userStreet);
    }

    @Test
    void prompt_City() {
        Scanner city = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter city: ");

        String userCity = city.nextLine();  // Read user input

        assertEquals("Hayward", userCity);
    }

    @Test
    void prompt_State() {

        Scanner state = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");

        String userState = state.nextLine();  // Read user input
        assertEquals("CA", userState);

    }

    @Test
    void prompt_Zip() {
        Scanner zip = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter city: ");
        int userZip = zip.nextInt();  // Read user input
        assertEquals(99999, userZip);
    }

    @Test
    void prompt_Telephone() {
        Scanner telephone = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter telephone: ");

        String userTelephone = telephone.nextLine();  // Read user input
        assertEquals("510-885-4167", userTelephone);
    }

    @Test
    void prompt_Email() {

        Scanner email = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter email: ");

        String userEmail = email.nextLine();  // Read user input
        assertEquals("lynne.grewe@csueastbay.edu", userEmail);

    }
}