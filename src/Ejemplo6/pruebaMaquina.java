package Ejemplo6;

public class pruebaMaquina {

	public static void main(String[] args) {
		
	    maquinaVending[] maquinaVendings = {new maquinaVending("Coca-Cola", 1.50), new maquinaVending("Pepsi", 1.75), new maquinaVending("Sprite", 1.50)};
	    VendingMachine vm = new VendingMachine(maquinaVendings);

	    vm.insertMoney(5.00);
	    maquinaVending selectedmaquinaVending = vm.dispensemaquinaVending(1);
	    if (selectedmaquinaVending != null) {
	        System.out.println("Dispensed Product: " + selectedmaquinaVending.getName());
	        System.out.println("Remaining balance: $" + vm.getBalance());
	    } else {
	        System.out.println("Invalid selection or insufficient balance");
	    }
	}
}