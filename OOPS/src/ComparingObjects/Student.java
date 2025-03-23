package ComparingObjects;

public class Student implements Comparable<Student> {
    int marks;
    float rollNo;

    @Override
    public String toString() {
        return "Student{" +
                "marks=" + marks +
                '}';
    }

    public Student(int marks, float rollNo){
        this.marks=marks;
        this.rollNo=rollNo;
    }

    @Override
    public int compareTo(Student o) {
        System.out.println("compare to method invoked ");
        int diff =this.marks-o.marks;
        if(diff>0){
            System.out.println(this +" has more marks");
        }else{
            System.out.println(o+" has more marks");
        }

        return diff;
    }
}
