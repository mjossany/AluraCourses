
public class Conta {

	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int totalDeContas = 0;
	
	public Conta(int agencia, int numero) {
		Conta.totalDeContas++;
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 100;
		System.out.println("Criando uma conta.");
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			saca(valor);
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}

	public double getSaldo() {
		return saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotalDeContas() {
		return Conta.totalDeContas;
	}
}
