import java.util.Scanner;

class Main{
    public static void main(String[] args) {

        byte controller = 1;

        ContactManager myManager = new ContactManager();
        System.out.println("CONTACT MANAGING APP");
        System.out.print("1. ADD\n2. DELETE\n3.SEARCH\n");

        for (;controller==1;)
        {
            String name,number,email;
            int n;
            Scanner scan = new Scanner(System.in);
            System.out.print("Select Menu - ");
            n = scan.nextInt();
            scan.nextLine();

            switch (n)
            {
                case 1:
                    System.out.print("Name - ");
                    name = scan.nextLine();
                    System.out.print("Number - ");
                    number = scan.nextLine();
                    System.out.print("E-mail - ");
                    email = scan.nextLine();
                    myManager.add(new Contact(name,number,email));
                    break;
                case 3:
                    System.out.println("Enter name - ");
                    name = scan.nextLine();
                    myManager.search(name);
                    break;
                case 2:
                    System.out.print("Enter a name to remove = ");
                    name = scan.nextLine();
                    myManager.delet(name);
                    break;
            }

            System.out.print("To Exit Press Zero and ENTER Otherwise Press 1 - ");
            controller = scan.nextByte();
        }



    }
}
