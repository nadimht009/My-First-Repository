public class ContactManager {
    int friendNumber;
    Contact[] numberList;

    public ContactManager()
    {
        friendNumber = 0;
        numberList = new Contact[500];
    }

    public void add(Contact detail){
        numberList[friendNumber] = detail;
        friendNumber++;
    }
    public void delet(String name){
        for (int i=0;i<friendNumber;i++){
            if(numberList[i].name.equals(name)){
                numberList[i]=null;
                break;
            }

        }
        System.out.println("DELETED");
    }

    public void search(String a){
        for (int i = 0; i <friendNumber; i++)
        {
            if(numberList[i].name.equals(a)){
                System.out.println("here is"+numberList[i].number);
                break;
            }
        }
    }
}
