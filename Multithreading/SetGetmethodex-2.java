class Test extends Thread
{
public void run()
{
System.out.println(Thread.currentThread().getName());
System.out.println("Thread Task");
}
public static void main(String[] args)
{
Test t = new Test();
t.start();
System.out.println(Thread.currentThread().getName());
}
}