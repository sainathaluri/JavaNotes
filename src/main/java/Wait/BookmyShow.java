package Wait;

public class BookmyShow {
    public static void main(String[] args) throws InterruptedException{
        TotalEarning margin = new TotalEarning();
        margin.start();

        synchronized (margin){
            margin.wait();
            System.out.println("Net Margins are :" + " " + margin.profits);
        }
    }
}
