package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa(null, "Andre Costa", "andre@email.com");
		Pessoa p2 = new Pessoa(null, "Anderson Costa", "anderson@email.com");
		Pessoa p3 = new Pessoa(null, "Eduardo Silva", "dudu@email.com");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
//		
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit(); 
		
		//buscando pessoa pelo ID
//		Pessoa p = em.find(Pessoa.class, 2);
//		System.out.println(p);	
		
		//removendo pessoa pelo ID
		//objeto precisa estar monitorado objeto e nao ter o entity manager fechado..
		
//		Pessoa p = em.find(Pessoa.class, 1);
//		em.getTransaction().begin();
//		em.remove(p);
//		em.getTransaction().commit();
		
		System.out.println("Pronto!");
		em.close();
		emf.close();
	}

}
