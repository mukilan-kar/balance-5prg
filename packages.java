	package mypack;

class Hello
{
    public static void main(String args[])
    {
        System.out.println("Hello! This is a package program in a single file.");
    }
}
package mypack;

class Hello
{
    public void showMessage()
    {
        System.out.println("Hello! This is a package program in a single file.");
    }
}

public class Main
{
    public static void main(String args[])
    {
        Hello obj = new Hello();
        obj.showMessage();
    }
}