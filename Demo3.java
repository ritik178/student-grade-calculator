import java.util.Scanner;

class Demo3{
    public static void main(String[] args) {
       // eter the marks of student
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the marks of english: ");
       Float E=sc.nextFloat();
       System.out.print("enter the marks of hindi: ");
       float H=sc.nextFloat();
       System.out.print("Enter the marks of math: ");
       float M=sc.nextFloat();
       System.out.print("Enter the marks of Science: ");
       float S=sc.nextFloat();
       System.out.print("Emter the marks of computer :");
       float cs=sc.nextFloat();
       float total=0;
       float average=0;
       //total marks of student
        total=E+H+M+S+cs;
        System.out.println("total marks is: "+total);
         //average marks of student
        average=total/5;
        System.out.println("the average of marks are: "+average);

       System.out.print("student grade are : ");
       
       if(average>=80){
        System.out.println("A");
       }else if(average>=60&&average<=80){
        System.out.println("B");
       }else if(average>=40&&average<=60){
        System.out.println("C");

       }else{
        System.out.println("fail");
       }
        
    }
}
    

