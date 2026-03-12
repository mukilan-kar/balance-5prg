class NumberThread extends Thread
{
    private String name;

    NumberThread(String name)
    {
        this.name = name;
    }

    public void run()
    {
        for(int i = 1; i <= 5; i++)
        {
            System.out.println(name + ":" + i);
        }
    }

    public static void main(String args[])
    {
        NumberThread t1 = new NumberThread("Thread 1");
        NumberThread t2 = new NumberThread("Thread 2");

        t1.start();
        t2.start();
    }
}