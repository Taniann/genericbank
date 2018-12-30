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

    public Bank(String name, String address) {
        this.id = idCount++;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public T getAsset() {
        return asset;
    }

}
