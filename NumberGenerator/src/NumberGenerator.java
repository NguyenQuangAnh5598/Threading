public class NumberGenerator implements Runnable {
    private String hashCode;

    public NumberGenerator(String hashCode) {
        this.hashCode = hashCode;
    }

    @Override
    public void run() {
        try {
        for (int i = 0; i < 10; i++) {
            System.out.println(hashCode +" number: " + i);
            Thread.sleep(1500);
        }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
