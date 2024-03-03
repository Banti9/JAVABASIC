
class class_name{
    int a;
    class_name(int a1){
        System.out.println("Constructor");
        a=a1;
    }
}
class student{
    int Roll;
    String name;
    student(int r,String Name){
      Roll=r;
      name=Name;
      System.out.println(Roll +" "+name);
    }
}
class Employee{
    int ID;
    String Name;
    long phone;
    String address;
    //  /  constructor overloding
    Employee(){
        this(null,"delhi");
        
    }
 Employee(int id,long p){
        ID=id;
        phone=p;
        System.out.println(ID+" "+phone);
                
    }
    Employee(String name,String Address){
       Name=name;
       address=Address;
        System.out.println(Name+" "+address);
        System.out.println("bjhvg");
//  void Employee() {
//     System.out.println("Employee-1");
//  }
//  Employee() {
//     System.out.println("Employee-2");
//  }

    }

class Bank{
    // String Bank_Name;
    // double opening_balance;
    // Bank(){       //Line-3
    //     Bank_Name="Lena-Dena";
    //     opening_balance = 1000.0;
    // }
    // Bank(String newName, double newAmount){   //Line-4
    //     Bank_Name = newName;
    //     opening_balance = newAmount;
    // }
    // 
    String Bank_Name="Lena Dena Bank";
    double opening_balance=1000.0;
    Bank(double opening_bal){
        double opening_balance=opening_bal; // Line-1
        System.out.print("Welcome to Lena-Dena Bank - ");}
}
public class constructor {
    public static void main(String[] args) {
        class_name s=new class_name(89);
        student s1=new student(11,"Banti");
        student s2=new student(40,"jaya");
        student s3=new student(100,"neeru");
        student s4=new student(180,"kajal");
        // Employee e1=new Employee(20,1234567890);
        // Employee e2=new Employee("Ram", "UP");
        // Bank a = new Bank();  // Line-1
        // Bank b = new Bank("HDFC",2000);   // Line-2
        // System.out.println(a.opening_balance +" " + b.opening_balance);
        Bank a = new Bank(2000);  //Line-1
		System.out.println(a.opening_balance);
        Employee emp = new Employee();

    
    }


}
