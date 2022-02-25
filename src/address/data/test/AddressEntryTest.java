package address.data.test;

import address.data.AddressEntry;

import static org.junit.jupiter.api.Assertions.*;

class AddressEntryTest {

    AddressEntry addressEntry = new AddressEntry("John","Carthy","123 3rd Ave","Hayward","CA",99999,"510-885-4167","lynne.grewe@csueastbay.edu");

    @org.junit.jupiter.api.Test
    void testToString() {
    }

    @org.junit.jupiter.api.Test
    void getFirstName() {

        assertEquals("John",addressEntry.getFirstName());
    }

    @org.junit.jupiter.api.Test
    void setFirstName() {
        addressEntry.setFirstName("John");
        assertEquals("John",addressEntry.getFirstName());
    }

    @org.junit.jupiter.api.Test
    void getLastName() {
        assertEquals("Carthy",addressEntry.getLastName());
    }

    @org.junit.jupiter.api.Test
    void setLastName() {
        addressEntry.setLastName("Carthy");
        assertEquals("Carthy",addressEntry.getLastName());
    }

    @org.junit.jupiter.api.Test
    void getStreet() {
        assertEquals("123 3rd Ave",addressEntry.getStreet());
    }

    @org.junit.jupiter.api.Test
    void setStreet() {
        addressEntry.setStreet("123 3rd Ave");
        assertEquals("123 3rd Ave",addressEntry.getStreet());
    }

    @org.junit.jupiter.api.Test
    void getCity() {
        assertEquals("Hayward",addressEntry.getCity());
    }

    @org.junit.jupiter.api.Test
    void setCity() {
        addressEntry.setStreet("Hayward");
        assertEquals("Hayward",addressEntry.getCity());
    }

    @org.junit.jupiter.api.Test
    void getState() {
        assertEquals("CA",addressEntry.getState());
    }

    @org.junit.jupiter.api.Test
    void setState() {
        addressEntry.setStreet("CA");
        assertEquals("CA",addressEntry.getState());
    }

    @org.junit.jupiter.api.Test
    void getZip() {
        assertEquals(99999,addressEntry.getZip());
    }

    @org.junit.jupiter.api.Test
    void setZip() {
        addressEntry.setZip(99999);
        assertEquals(99999,addressEntry.getZip());
    }

    @org.junit.jupiter.api.Test
    void getTelephone() {
        assertEquals("510-885-4167",addressEntry.getTelephone());
    }

    @org.junit.jupiter.api.Test
    void setTelephone() {
        addressEntry.setStreet("510-885-4167");
        assertEquals("510-885-4167",addressEntry.getTelephone());
    }

    @org.junit.jupiter.api.Test
    void getEmail() {
        assertEquals("lynne.grewe@csueastbay.edu",addressEntry.getEmail());
    }

    @org.junit.jupiter.api.Test
    void setEmail() {
        addressEntry.setStreet("lynne.grewe@csueastbay.edu");
        assertEquals("lynne.grewe@csueastbay.edu",addressEntry.getEmail());
    }
}