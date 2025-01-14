package wrapperclass;

public class WrapperClassFunctionCall2 {
    public static void main(String[] args) {
        // Example 1
        Student student = new Student();
        student.id=1;
        fun(student);
        System.out.println(student.id);
    }

    private static void fun(Student s){
        s.id=2;
    }
}
