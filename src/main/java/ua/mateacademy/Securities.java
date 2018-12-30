package ua.mateacademy;

/**
 * Created by Таня on 30.12.2018.
 */
public class Securities implements Asset {
    public void refill() {
        System.out.println("Your balance hac been successfully refill with securities");
    }

    public void withdraw() {
        System.out.println("You`ve successfully withdrawn securities");
    }

    public void checkBalance() {
        System.out.println("Balance: securities");
    }
}
