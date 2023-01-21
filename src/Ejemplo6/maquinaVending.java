package Ejemplo6;

public class maquinaVending {

	private String name;
    private double price;

    public maquinaVending(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class VendingMachine {
    private maquinaVending[] maquinaVendings;
    private double balance;

    public VendingMachine(maquinaVending[] maquinaVendings) {
        this.maquinaVendings = maquinaVendings;
        this.balance = 0;
    }

    public void insertMoney(double amount) {
        balance += amount;
    }

    public maquinaVending dispensemaquinaVending(int maquinaVendingIndex) {
        if (maquinaVendingIndex < 0 || maquinaVendingIndex >= maquinaVendings.length) {
            return null;
        }
        maquinaVending selectedmaquinaVending = maquinaVendings[maquinaVendingIndex];
        if (selectedmaquinaVending.getPrice() > balance) {
            return null;
        }
        balance -= selectedmaquinaVending.getPrice();
        return selectedmaquinaVending;
    }

    public double getBalance() {
        return balance;
    }
}
	

