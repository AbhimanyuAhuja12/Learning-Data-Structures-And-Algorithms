public class checkCLL {
    public static void main(String[] args) {
        CLL circularList = new CLL();
        circularList.insert(5);
        circularList.insert(9);
        circularList.insert(13);
        circularList.insert(17);
        circularList.insert(21);
        circularList.insert(25);

        circularList.display();

        circularList.insertionAfter(25,50);

        circularList.display();

        circularList.delete(21);
        circularList.display();


    }
}
