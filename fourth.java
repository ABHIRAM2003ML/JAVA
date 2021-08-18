import java.util.Scanner;

class Student {
    public static void main(String[] args); {
        
        int a;
        String b;
        float c;
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the roll number: ");
        a = sc.nextInt();
        System.out.print("Enter the name of student: ");
        b = sc.next();
        System.out.print("Enter the marks of student: ");
        c = sc.nextFloat();
        System.out.print("Roll number :" + a +"Name : "+ b + "Marks :" + c);
    }
}