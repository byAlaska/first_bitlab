package bitlab.askar.Module2.Lesson6;

public class Main {
    public static void main(String[] args){

        ThreadGroup threadGroup = new ThreadGroup("New Group");

        MyThread thread = new MyThread(threadGroup, "t1");
        MyThread thread2 = new MyThread(threadGroup,"t2");
        MyThread thread3 = new MyThread(threadGroup,"t3");


        thread.start();
        thread2.start();
        thread3.start();

        while (threadGroup.activeCount()>0){

        }

        System.out.println("Hello");

    }
}
