import static Neww_package.a.Greeting.message;

public class Constructor {
    public static void main(String[] args) {
        //types:-
//        Default Constructor
//        Parameterized Constructor
//        Copy Constructor

         final Check ex = new Check();
          Check example= new Check();
          // when a non primitive is final you cannot reassign it
//          ex=example; // Cannot assign a value to final variable 'ex'

//      int[] arr = {1,2,3,4,5};
////      swap(arr[0], arr[1]); // this does not happen
//      swap(0,1,arr);
//        System.out.println(Arrays.toString(arr));
      message();
    }
    static void swap(int first, int second , int[]arr){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;

    }
}

class Check{

    Check(){
        System.out.println("Constructor called");
    }

}
