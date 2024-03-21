# My-First-Repository
This Java program is a simple contact managing application that allows users to add, delete, and search for contacts. (NOTE : This code shows how we can use for loops instead of while loops.) It consists of three main components: the `Contact` class, the `ContactManager` class, and the `Main` class.

1. **Contact Class (`Contact.java`)**:
   - This class represents a contact with three attributes: name, number, and email.
   - It includes two constructors: a default constructor and a parameterized constructor to initialize the contact's attributes.

2. **ContactManager Class (`ContactManager.java`)**:
   - This class manages a list of contacts and provides methods to add, delete, and search for contacts.
   - It contains an array `numberList` to store contacts and an integer `friendNumber` to keep track of the number of contacts.
   - The `add` method adds a new contact to the `numberList` array and increments `friendNumber`.
   - The `delete` method removes a contact by name from the `numberList` array.
   - The `search` method searches for a contact by name and prints the associated phone number if found.

3. **Main Class (`Main.java`)**:
   - This class contains the main method where the program execution begins.
   - It creates an instance of `ContactManager` to manage contacts.
   - Inside a loop, it presents a menu to the user with options to add, delete, or search for contacts.
   - Depending on the user's choice, it interacts with the `ContactManager` object to perform the corresponding action.
   - After each operation, it prompts the user to continue or exit the program.

How It Works:

1. The `Main` class prompts the user with a menu of options: add contact, delete contact, or search contact.
2. Based on the user's input, it reads the choice and performs the respective action using the `ContactManager` object.
3. For adding a contact, the program prompts the user to enter the name, number, and email of the contact. It then adds the contact to the contact list.
4. For searching a contact, the program prompts the user to enter the name of the contact. It then searches for the contact in the list and prints its associated phone number if found.
5. For deleting a contact, the program prompts the user to enter the name of the contact to be deleted. It then removes the contact from the list.
6. After each operation, the program asks the user whether to continue or exit the program.
7. The program continues to execute until the user chooses to exit by entering 0.

