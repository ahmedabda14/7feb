/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg7_feb; 

/**
 *
 * @author ahmed
 */
public class ChildClass extends Main{
String name;
int age;
    public ChildClass(String name, int age,int intvalue, double doublevalue, String stringvalue) {
        super(intvalue, doublevalue, stringvalue);
        this.name=name;
        this.age=age;
    }

    public ChildClass(String name, int age) {
        this.age=age;
        this.name=name;
                
    }

    public ChildClass(Main other) {
        super(other);
    }

    public ChildClass(int intvalue, double doublevalue) {
        super(intvalue, doublevalue);
    }

    public ChildClass(String stringvalue) {
        super(stringvalue);
    }
    
    void displaychild(){
        System.out.println("intvalue:"+intvalue);
                System.out.println("doublevalue:"+doublevalue);
        System.out.println("stringvalue:"+stringvalue);
        System.out.println("name:"+name);
                System.out.println("age:"+age);
    }
    public static void main(String[]args){
        ChildClass childobj1= new ChildClass("mm",50,78,9.88,"ocb");
        childobj1.displayvalues();
                childobj1.displaychild();

        ChildClass childobj2 = new ChildClass("");
        childobj2.displayvalues();
    }
}
