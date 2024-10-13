/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PhoneBookApp {
    // ArrayList to store names and phone numbers of contacts
    static ArrayList<String> names = new ArrayList<>();
    static ArrayList<String> phoneNumbers = new ArrayList<>();
    // Scanner object to capture user input
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Run the phonebook application
        runPhonebook();
    }

    // Main method to handle the menu and user choices
    public static void runPhonebook() {
        boolean running = true;
        while (running) {
            // Display menu options to the user
            displayMenu();
            // Get the user's choice of action
            int choice = getUserChoice();
            // Handle the user's choice
            switch (choice) {
                case 1:
                    insertContact();
                    break;
                case 2:
                    searchContact();
                    break;
                case 3:
                    displayAllContacts();
                    break;
                case 4:
                    deleteContact();
                    break;
                case 5:
                    updateContact();
                    break;
                case 6:
                    sortContacts();
                    break;
                case 7:
                    analyzeSearchEfficiency();
                    break;
                case 0:
                    running = false; // Exit the loop to end the program
                    System.out.println("Exiting the phonebook application.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Method to display the phonebook menu
    public static void displayMenu() {
        System.out.println("\nPhonebook Menu:");
        System.out.println("1. Insert Contact");
        System.out.println("2. Search Contact");
        System.out.println("3. Display All Contacts");
        System.out.println("4. Delete Contact");
        System.out.println("5. Update Contact");
        System.out.println("6. Sort Contacts");
        System.out.println("7. Analyze Search Efficiency");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }

    // Method to get the user's menu choice with input validation
    public static int getUserChoice() {
        int choice = -1;
        try {
            choice = scanner.nextInt(); // Capture user input as an integer
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
        } finally {
            scanner.nextLine(); // Clear the input buffer
        }
        return choice;
    }

    // Method to insert a new contact into the phonebook
    public static void insertContact() {
        System.out.print("Enter contact name: ");
        String name = scanner.nextLine(); // Capture the contact name (supports full names)
        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine(); // Capture the phone number
        // Add the contact details to the lists
        names.add(name);
        phoneNumbers.add(phoneNumber);
        System.out.println("Contact added successfully.");
    }

    // Method to search for a contact by name
    public static void searchContact() {
        System.out.print("Enter name to search: ");
        String searchName = scanner.nextLine(); // Get the name to search for
        boolean found = false;
        // Search through the list of names to find the contact
        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).equalsIgnoreCase(searchName)) {
                System.out.println("Contact found:");
                System.out.println("Name: " + names.get(i) + ", Phone: " + phoneNumbers.get(i));
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Contact not found.");
        }
    }

    // Method to display all contacts in the phonebook
    public static void displayAllContacts() {
        if (names.isEmpty()) {
            System.out.println("No contacts available.");
        } else {
            System.out.println("All Contacts:");
            // Loop through the list and display each contact
            for (int i = 0; i < names.size(); i++) {
                System.out.println("Name: " + names.get(i) + ", Phone: " + phoneNumbers.get(i));
            }
        }
    }

    // Method to delete a contact by name
    public static void deleteContact() {
        System.out.print("Enter name of the contact to delete: ");
        String searchName = scanner.nextLine(); // Get the name to delete
        boolean deleted = false;
        // Search through the list to find the contact to delete
        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).equalsIgnoreCase(searchName)) {
                names.remove(i); // Remove the name
                phoneNumbers.remove(i); // Remove the corresponding phone number
                System.out.println("Contact deleted successfully.");
                deleted = true;
                break;
            }
        }
        if (!deleted) {
            System.out.println("Contact not found.");
        }
    }

    // Method to update a contact's phone number
    public static void updateContact() {
        System.out.print("Enter name of the contact to update: ");
        String searchName = scanner.nextLine(); // Get the name to update
        boolean updated = false;
        // Search through the list to find the contact to update
        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).equalsIgnoreCase(searchName)) {
                System.out.print("Enter new phone number: ");
                String newPhoneNumber = scanner.nextLine(); // Get the new phone number
                phoneNumbers.set(i, newPhoneNumber); // Update the phone number
                System.out.println("Contact updated successfully.");
                updated = true;
                break;
            }
        }
        if (!updated) {
            System.out.println("Contact not found.");
        }
    }

    // Method to sort contacts alphabetically by name
    public static void sortContacts() {
        // Bubble sort algorithm to sort contacts by name
        for (int i = 0; i < names.size() - 1; i++) {
            for (int j = 0; j < names.size() - i - 1; j++) {
                if (names.get(j).compareToIgnoreCase(names.get(j + 1)) > 0) {
                    // Swap the names and phone numbers
                    String tempName = names.get(j);
                    String tempPhone = phoneNumbers.get(j);
                    names.set(j, names.get(j + 1));
                    phoneNumbers.set(j, phoneNumbers.get(j + 1));
                    names.set(j + 1, tempName);
                    phoneNumbers.set(j + 1, tempPhone);
                }
            }
        }
        System.out.println("Contacts sorted alphabetically by name.");
    }

    // Method to analyze the search efficiency of the phonebook
    public static void analyzeSearchEfficiency() {
        // Explain the efficiency of the linear search used in this application
        System.out.println("The search operation uses linear search with O(n) time complexity.");
        System.out.println("The more contacts in the phonebook, the longer it takes to search.");
    }
}
