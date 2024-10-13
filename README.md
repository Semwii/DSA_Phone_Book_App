# DSA_Phone_Book_App
Group_Members_Details
220117330 Shaningwa willipard
224093630 Ndamononghenda Kashava
223092479 Petrus Shimbanda
221066535 Manuela K Kambonge
200614282 Paulina Shuuya
220002797 Luyanda Ntini
# PhoneBook Application

This project is a simple Java-based phonebook application that allows users to perform basic contact management operations such as inserting, searching, updating, deleting, and sorting contacts. It also includes a feature to analyze the efficiency of the search operation.

## Features

- *Insert Contact*: Add a new contact with a name and phone number.
- *Search Contact*: Search for a contact by name.
- *Display All Contacts*: View all stored contacts.
- *Delete Contact*: Remove a contact by name.
- *Update Contact*: Update the phone number of an existing contact.
- *Sort Contacts*: Sort the contacts alphabetically by name.
- *Analyze Search Efficiency*: Analyze the time complexity of the search operation.

## Project Structure

- PhoneBookApp.java: The main class where all the functionality of the phonebook is implemented.
- Uses ArrayList<String> for storing contact names and phone numbers.
- Provides a simple menu-driven interface for user interaction.

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- A terminal or IDE to compile and run the Java program

## How to Run

1. Clone the repository or download the source code.
2. Compile the Java file using the following command:
   ```bash
   javac PhoneBookApp.java

3. Run the compiled Java class:

java PhoneBookApp


4. The application will prompt you with a menu where you can choose options like inserting a contact, searching, displaying all contacts, and more.



Menu Options

1. Insert Contact: Prompts the user to input a contact name and phone number, which are then saved.

2. Search Contact: Asks for a name and displays the contact if found.

3. Display All Contacts: Lists all contacts saved in the phonebook.

4. Delete Contact: Prompts the user for the contact name to delete.

5. Update Contact: Updates the phone number of a specified contact.

6. Sort Contacts: Sorts the contacts by name alphabetically.

7. Analyze Search Efficiency: Provides an analysis of the search algorithm used in the application.

0. Exit: Exits the application.


Known Issues

Input validation for invalid menu choices has been implemented, but more detailed validation can be added.

Only linear search (O(n)) is used, which may be slow for a large number of contacts.


Future Improvements

Improve search efficiency by implementing more advanced data structures (e.g., HashMap, Binary Search).

Allow exporting and importing contacts from a file.

Implement better input validation and error handling.


License

This project is open-source and available for modification and distribution.
