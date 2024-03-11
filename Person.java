import java.util.Scanner;

public class Person{
    void Person()
    {
    String emp_name;
    String emp_dob;
    int emp_id;
    int emp_salary; 
    System.out.println("This is main branch");
    System.out.println("Enter Employee details");
    Scanner n=new Scanner(System.in);
    System.out.println("Enter the name of employee: ");
    emp_name=n.nextLine();
    System.out.println("Enter the dob of employee: ");
    emp_dob=n.next();
    System.out.println("Enter the id of employee: ");
    emp_id=n.nextInt();
    System.out.println("Enter the salary of employee: ");
    emp_salary=n.nextInt();
    }
}
    class p{
        public static void main(String[] args) {
            Person z = new Person();
            z.Person();
    }
}


