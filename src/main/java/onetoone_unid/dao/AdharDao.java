package onetoone_unid.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetoone_unid.dto.AdharCard;

public class AdharDao {

	public EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("sujit").createEntityManager();
	}
	
	public void deleteAdharCard(int id) {
		EntityManager manager = getEntityManager();
		AdharCard adharCard = manager.find(AdharCard.class, id);
		
		if (adharCard != null) {
			EntityTransaction transaction  = manager.getTransaction();
			transaction.begin();
			manager.remove(adharCard);
			transaction.commit();
		}else {
			System.out.println("AdharCard not found with id : "+id);
		}
	}
}
