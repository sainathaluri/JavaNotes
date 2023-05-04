package Wait;

public class TotalEarning extends Thread {
    int profits = 0;
    public void run(){
        synchronized (this){
            for (int i = 0; i <= 10; i++) {
                profits += 100;
            }
            this.notify();
        }
    }

}
