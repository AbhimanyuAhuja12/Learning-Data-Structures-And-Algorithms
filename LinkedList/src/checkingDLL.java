
public class checkingDLL {
    public static void main(String[] args) {


        DLL list = new DLL();


        list.insertFirst(5);
        list.insertFirst(10);
        list.insertFirst(15);
        list.insertFirst(25);
        list.insertFirst(35);
        list.insertFirst(45);
        list.insertFirst(55);

        list.display();
        list.insertLast(100);
        list.insert(25,100);
        list.display();

        list.diplayRev();

    }

}
