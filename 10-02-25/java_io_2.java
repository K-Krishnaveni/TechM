public class java_io_2 {
public static void main(String[] args){
methodPrint();
methodPrintln();
    java_io_2 obj = new java_io_2();
obj.methodForErr();
}
public static  void methodPrint(){
    System.out.print("Hello this is print statement 1 ");
    System.out.print("Print statement 2 \n");
    }
    public static void methodPrintln(){
    System.out.println("Hello this is println Statement");
        System.out.println("println Statement 2");
    }
    public void methodForErr(){
        System.err.println("This is another error message using println().");
    }

}
