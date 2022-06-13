package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class ObterClienteAssento {

	public static void main(String[] args) {
		
		DAO<Cliente> dao = new DAO<>(Cliente.class);
		DAO<Assento> daoAssento = new DAO<>(Assento.class); 
		
		
		Cliente cliente = dao.obterPorID(1L);
		System.out.println(cliente.getAssento().getNome());
		
		
		Assento assento = daoAssento.obterPorID(2L);
		System.out.println(assento.getCliente().getNome());
		
		dao.fechar();
		daoAssento.fechar();
	}
}
