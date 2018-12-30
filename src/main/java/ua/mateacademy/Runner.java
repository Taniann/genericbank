package ua.mateacademy;

/**
 * Created by Таня on 30.12.2018.
 */
public class Runner {
    public static void main(String[] args) {
        Bank<Currency> currencyBank = new Bank<>("currencyBank", "Kiev", new Currency());
        currencyBank.refill();
        currencyBank.withdraw();
        currencyBank.checkBalance();

        Bank<Gold> goldBank = new Bank<>("goldBank", "Odessa", new Gold());
        goldBank.refill();
        goldBank.withdraw();
        goldBank.checkBalance();

        Bank<Securities> securitiesBank = new Bank<>("securitiesBank", "Kharkiv", new Securities());
        securitiesBank.refill();
        securitiesBank.withdraw();
        securitiesBank.checkBalance();
    }
}
