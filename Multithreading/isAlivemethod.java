class Test extends Thread
{
public void run()
{

System.out.println("Thread Task:" +Thread.currentThread().getName());
}
public static void main(String[] args)
{
System.out.println("Current Thread name is : " +Thread.currentThread().getName());
Test t = new Test();
t.start();
System.out.println("Method id alive?: " +Thread.currentThread().isAlive());

Test s = new Test();
s.setName("Harshada");
s.start();
System.out.println("Method id alive?: " +Thread.currentThread().isAlive());
}
}