package bitlab.askar.Module2.Lesson6;

public class MyThread extends Thread {


    public MyThread( ThreadGroup threadGroup, String name) {
        super(threadGroup,name);
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(i + "->" + getName());
                Thread.sleep(500);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
