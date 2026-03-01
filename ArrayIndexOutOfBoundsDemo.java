class ArrayIndexOutOfBoundsDemo {

    public static void main(String args[]) {

        int a[] = {10, 20, 30};

        try {
            System.out.println(a[5]);   // Invalid index
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception occurred");
        }

    }
}