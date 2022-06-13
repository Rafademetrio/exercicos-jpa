package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario2 {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Usuario usuario = em.find(Usuario.class, 7L);
		em.detach(usuario); // o detach tira o objeto do estado gerenciado.
							// só faz alteração no banco caso o em.merg() seja chamado.
		usuario.setNome("Leonardo Leitao");
		
		
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

}
