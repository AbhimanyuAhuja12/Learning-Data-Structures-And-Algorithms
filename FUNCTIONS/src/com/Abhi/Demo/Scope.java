package com.Abhi.Demo;

public class Scope {
    public static void main(String[] args) {
        int a =20;
        int b=10;
        String name="abhiamanyu";

        {
//            int a=25;(already initialized before in the same function block(main))
            a=25;//reassign the original ref variable to other is possible obv in same method(modification is allowed)
            System.out.println(a);
            int c=100;//values initialized in this block ,will remain in this  block only
            name="rahul";
            System.out.println(name);
        }
        System.out.println(a);
        int c=200;// can be initialised outside the block
//        System.out.println(c);
//        (this can't be print as it is not in the scope of block(c variable is defined just for that block))
        //cannot use outside the block
        System.out.println(name);


/* ((anything that is initialized outside  the block can be used inside the block,
but anything that is initialized inside the block can't be used outside.))*/




//scoping for for_block
for(int i=0;i<700;i++){
    System.out.println(i);
    a=1000;// can be modified
//    int a=50;//can't be initialized again


        }
        }
//        system.out.println(i);//out of scope

}