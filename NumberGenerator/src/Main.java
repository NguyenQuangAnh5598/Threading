public class Main {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new NumberGenerator("Anh");
        NumberGenerator numberGenerator1 = new NumberGenerator("Em");
        Thread thread = new Thread(numberGenerator);
        Thread thread1 = new Thread(numberGenerator1);
        thread.setPriority(Thread.MAX_PRIORITY);
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread1.start();
        thread.start();

    }
}
