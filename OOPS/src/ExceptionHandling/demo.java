package ExceptionHandling;

public class demo{
    public static void main(String[] args) throws MyException {
        int a=12;
        int b=0;
        try{
           divide(12,0);
//            System.out.println(c);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException exception occured");
        }
        catch(ArithmeticException e){
            System.out.println("Arithmethic exception occured");
        }
        catch(Exception e){
            System.out.println("Exception occured");
        }

        finally{
            System.out.println("this statement will always run");
        }
    }

    public static int  divide(int num1, int num2) throws MyException{
        if(num2==0){
            throw new MyException("Denominator can't be zero");
        }
        return num1/num2;
    }
}
