package Homework4;

public class MyThread extends Thread {
    private final StringBuilder stringBuilder;
    public MyThread(StringBuilder stringBuilder) {
        this.stringBuilder = stringBuilder;
    }
    @Override
    public void run() {
        synchronized (stringBuilder) {
            for (int i = 0; i < 100; i++) {
                System.out.println(stringBuilder);
                stringBuilder.setCharAt(0, (char) (stringBuilder.charAt(0) + 1));
            }
        }
    }
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("a");

        MyThread thread1 = new MyThread(stringBuilder);
        MyThread thread2 = new MyThread(stringBuilder);
        MyThread thread3 = new MyThread(stringBuilder);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
