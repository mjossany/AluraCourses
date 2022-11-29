package bytebankHerdado;

public class TesteReferencia {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
        g1.setNome("Marcos");
        g1.setSalario(5000.0);
        
        Programador pr = new Programador();
        pr.setSalario(6000.0);
        
        ProjectManager pm = new ProjectManager();
        pm.setSalario(5500.0);
        
        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);
        controle.registra(pr);
        controle.registra(pm);
        
        System.out.println(controle.getSoma());

	}

}
