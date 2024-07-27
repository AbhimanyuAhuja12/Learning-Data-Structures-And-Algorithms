public class MergeTwoList {
    public static void main(String[] args) {


        LL list1 = new LL();
        list1.insertEnd(2);

        LL list2 = new LL();
        list2.insertEnd(5);


        list1.display();
        list2.display();
        LL ans = LL.mergeList(list1,list2);
        ans.display();

    }
}






