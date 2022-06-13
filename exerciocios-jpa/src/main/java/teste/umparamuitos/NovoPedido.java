package teste.umparamuitos;

import infra.DAO;
import modelo.basico.Produto;
import modelo.umparamuitos.ItemPedido;
import modelo.umparamuitos.Pedido;

public class NovoPedido {
	
	public static void main(String[] args) {
		
		DAO<Object> dao = new DAO<>();
		DAO<Produto> daoProduto = new DAO<>(Produto.class);
		
		
		Produto produto = daoProduto.obterPorID(3L);
		Pedido pedido = new Pedido();
		ItemPedido item = new ItemPedido(pedido, produto, 9);
		System.out.println(produto.getNome());
		
		dao
			.abrirT()
			.incluir(pedido)
			.incluir(item)
			.fecharT()
			.fechar();
	}

}
