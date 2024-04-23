package onetoone_unid.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.proxy.EntityNotFoundDelegate;

import onetoone_unid.dao.AdharDao;
import onetoone_unid.dao.PersonDao;
import onetoone_unid.dto.AdharCard;
import onetoone_unid.dto.Person;

public class Main {

	public static void main(String[] args) {

		AdharCard adharCard = new AdharCard();
//		adharCard.setId(103);
		adharCard.setName("Kiiiiiisu");
		adharCard.setAddress("goa");
		
		Person person = new Person();
//		person.setId(3);
		person.setName("Kishoooooooor");
		person.setPhone(9876567);
		person.setAddress("goa");
		person.setAdharCard(adharCard);
		
//		EntityManagerFactory factory = Persistence.createEntityManagerFactory("sujit");
//		EntityManager manager = factory.createEntityManager();
//		EntityTransaction transaction = manager.getTransaction();
		
//		transaction.begin();
//		manager.persist(adharCard);
//		manager.persist(person);
//		transaction.commit();
		
		PersonDao dao = new PersonDao();
		//dao.deletePerson(2);
		//dao.getPerson(1);
		//dao.updatePerson(3, person);
		dao.updateBoth(3, person);
		
		//AdharDao dao1 = new AdharDao();
		//dao1.deleteAdharCard(101);
	}

}
