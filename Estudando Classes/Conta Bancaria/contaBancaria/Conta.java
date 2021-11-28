package contaBancaria;

public class Conta {

		private double saldo;
		
		public Conta(double saldo) {
			
			if (saldo >= 0) {
				this.saldo = saldo;
			} else {
				this.saldo = 0;
				System.out.println("O saldo nao pode ser negativo.");
			}
		}
		
		public double getSaldo() {
			return saldo;
		}
		
		public void credito(double valor_a_creditar) {
			saldo += valor_a_creditar;
		}
		
		public void debito(double valor_a_debitar) {
			if(saldo >= valor_a_debitar) {
				saldo -= valor_a_debitar;
			}else { 
				System.out.println("Saldo insuficiente!");
			}
		}
		

}
