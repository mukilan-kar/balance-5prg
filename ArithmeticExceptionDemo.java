class ArithmeticExceptionDemo {

    int a = 10, b = 0;

    void divide() {
        try {
            int c = a / b;
            System.out.println("Result = " + c);
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurred");
        }
    }

    public static void main(String args[]) {

        ArithmeticExceptionDemo obj = new ArithmeticExceptionDemo();
        obj.divide();

    }
}