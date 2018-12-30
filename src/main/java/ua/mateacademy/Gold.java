package ua.mateacademy;

/**
 * Created by Таня on 30.12.2018.
 */
public class Gold implements Asset {
    public void refill() {
        System.out.println("Your balance hac been successfully refill with gold");
    }

    public void withdraw() {
        System.out.println("You`ve successfully withdrawn gold");

    }

    public void checkBalance() {
        System.out.println("Balance: gold");
    }
}
