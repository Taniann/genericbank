package ua.mateacademy;

/**
 * Created by Таня on 30.12.2018.
 */
public class Bank<T extends Asset> {
    private static int idCount = 1;
    private int id;
    private String name;
    private String address;
    private T asset;

    public Bank(String name, String address, T asset) {
        this.id = idCount++;
        this.name = name;
        this.address = address;
        this.asset = asset;
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public String getAddress() {
        return address;
    }

    public T getAsset() {
        return asset;
    }

    public void refill() {
        asset.refill();
    }

    public void withdraw() {
        asset.withdraw();
    }

    public void checkBalance() {
        asset.checkBalance();
    }
}
