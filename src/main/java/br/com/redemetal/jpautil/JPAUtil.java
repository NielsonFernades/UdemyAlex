package br.com.redemetal.jpautil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

//CLASSE RESPORSÁVEL POR RETORNAR O ENTITY PARA SALVAR REMOVER...
public class JPAUtil {

	// PADRÃO SINGLETON PARA COMPARTILHAR APENAS UMA INSTÂNCIA DO FFRAMEWORK
	private static EntityManagerFactory factory;

	// QUANDO FAZ REFERÊCIA SE NÃO EXISTIR ELE CRIA APENAS UMA VEZ
	static {
		if (factory == null) {
			factory = Persistence.createEntityManagerFactory("meuprimeiroprojetojsf");
		}
	}

	// RETORNA A ITERFACE ENTITYMANAGED
	public static EntityManager getEntityManager() {
		return factory.createEntityManager();
	}
}
