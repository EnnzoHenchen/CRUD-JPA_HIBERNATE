package com.empresa.cliente;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.empresa.cliente.model.Cliente;

public class Teste {
	private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("BancoPU");
	
	private static EntityManager entityManager = entityManagerFactory.createEntityManager();
	
	public static void main(String[] args) {
		
		//FIND (ACHAR / BUSCAR)
//		Cliente cliente = entitymanager.find(Cliente.class, 1);
//      System.out.println("Nome do cliente: " + cliente.getNome());
		
	
		
		
		
		//INSERT (INSERIR)
//		Cliente cliente = new Cliente();
//		cliente.setNome("Maria");
		
//		entityManager.getTransaction().begin();
//		entityManager.persist(cliente);
//		entityManager.getTransaction().commit();
		
		
		
		
		
		//REMOVE / DELETE (REMOVER / DELETAR)
//		Cliente cliente = entityManager.find(Cliente.class, 2);
//		entityManager.getTransaction().begin();
//		entityManager.remove(cliente);
//		entityManager.getTransaction().commit();
		
		
		
		
		//UPDATE / MODIFY (ATUALIZAR / MODIFICAR)
//		Cliente cliente = new Cliente();
//		cliente.setId(1);
//		cliente.setNome("Carlos");
		
//		entityManager.getTransaction().begin();
//		entityManager.merge(cliente);
//		entityManager.getTransaction().commit(); 
		
		
		entityManager.close();
		entityManagerFactory.close();
	}
}
