public class SingletonCheck {
    public static void main(String[] args) {
        Singleton obj=Singleton.getInstance();
        Singleton obj1=Singleton.getInstance();
        Singleton obj2=Singleton.getInstance();

        System.out.println(obj);
        System.out.println(obj2);
        System.out.println(obj);// these all will point to same object , hence have same hashId
    }
}
