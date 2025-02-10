
final class Final {

    public final int constantValue = 100;

    public final void display() {
        System.out.println("This is a final method in a final class.");
    }


    public static void main(String[] args) {
        Final obj = new Final();
        System.out.println("Constant Value: " + obj.constantValue);

        obj.display();
    }
}


