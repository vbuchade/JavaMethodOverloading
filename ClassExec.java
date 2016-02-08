
/**
 * @author varsha
 * Simple Java program to illustrate static binding
 */
public class ClassExec {

    static void print() {
        System.out.println("This is print() method");
    }
    
    static void print( int a, double b) {
        System.out.println("This is method to print int a = " + a + " double b = " + b);
    }
    
    static void print (double a, double b) {
        System.out.println("This is method to print double a = " + a + " double b = " + b);
    }
    
    /**
     * @param args
     * Sample output:
        This is print() method
        This is method to print int a = 1 double b = 2.5
        This is method to print double a = 1.5 double b = 3.5
        This is method to print double a = 1.2 double b = 3.0
        This is method to print int a = 1 double b = 2.0
     */
    public static void main(String[] args) {
        print();
        print(1, 2.5);
        print(1.5, 3.5);
        print(1.2, 3);
        print(1, 2);
    }

}
