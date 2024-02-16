package onetoone_bidirection.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetoone_bidirection.dto.AadharCard;
import onetoone_bidirection.dto.Person;

public class MainController {

	public static void main(String[] args) {
//		AadharCard aadharCard = new AadharCard();
//		aadharCard.setName("Shree");
//		aadharCard.setAddress("Pune");

//		Person person = new Person();
//		person.setName("Shreeya");
//		person.setPhone(8317252991l);
//		person.setAddress("Pune");

//		person.setAadharCard(aadharCard);
//		aadharCard.setPerson(person);
//
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("shree");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
//		EntityTransaction entityTransaction = entityManager.getTransaction();

//		entityTransaction.begin();
//		entityManager.persist(aadharCard);
//		entityManager.persist(person);
//		person.setName("Jayashree");
//		entityTransaction.commit();

		Person person = entityManager.find(Person.class, 1);
		System.out.println(person);

	}

}
