
package pkg7_feb;

/**
 *
 * @author ahmed
 */

public class Main {
int intvalue;
double doublevalue;
String stringvalue;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Main defaultinstance = new Main();
defaultinstance.displayvalues();

Main parameterizedInstance = new Main(100,43.6,"hi");
parameterizedInstance.displayvalues();

//using copy constructor
//Main copyInstance = new Main(parameterizedInstance);
//copyInstance.displayvalues();

Main overloaded = new Main(14,14.14,"me");
overloaded.stringvalue="ore";
overloaded.displayvalues();

Main overloaded2 = new Main(1,2.9);
overloaded2.displayvalues();
System.out.println();
    Main obj = new Main();
    obj.intvalue = 4;
    obj.doublevalue = 2.3;
    obj.stringvalue="fefe";
    obj.performCalculations();
    obj.displayvalues();
    
  
    }
    
    //parameterized constructor
    public Main(int intvalue, double doublevalue, String stringvalue){ 
        this.intvalue=intvalue;
        this.doublevalue=doublevalue;
        this.stringvalue=stringvalue;
    }
    public Main(){
        intvalue=0;
        doublevalue=0.0;
        stringvalue="default";
    }
     Main(Main other){
        this.intvalue=other.intvalue;
                this.doublevalue=other.doublevalue;
                        this.stringvalue=other.stringvalue;

    }
    Main(int intvalue,double doublevalue){
        this.intvalue=intvalue;
        this.doublevalue=doublevalue;
        this.stringvalue="overloaded";
    }
    Main(String stringvalue){
        this.intvalue=2;
        this.doublevalue=2.0;
        this.stringvalue=stringvalue;
    }
    void displayvalues(){
        System.out.println("intvalue:"+intvalue);
                System.out.println("doublevalue:"+doublevalue);
        System.out.println("stringvalue:"+stringvalue);
    }
    
    void performCalculations(){
        System.out.println("perform calculations");
    }

}
