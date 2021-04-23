package thread;

public class Transaction {
    private static int counter = 0;
    private int transactionID;
    private String customerName;

    // to make it thread safe we need to make sure that the block where
    // customerName resides is syncronized
    // because the customerName is an input variable.
    public void executeTransaction(String customerName){
        synchronized (this) {
            transactionID = counter;
            counter++;
            this.customerName = customerName;
        }
    }
}
