package contaBancaria;

public class Conta_Main {

		public static void main(String[] args) {
		Conta c1 = new Conta(0);
		Conta c2 = new Conta(-1);
		
		System.out.println("Saldo da conta 1: R$"+c1.getSaldo()+"\nSaldo da conta 2: R$"+c2.getSaldo());
		
		c1.credito(10000);
		System.out.println("Saldo na conta 1 apos credito: R$"+c1.getSaldo());
		
		c1.debito(10001);
		System.out.println("Saldo na conta 1 apos debito: R$"+c1.getSaldo());
	}

}
