package ir.co.pna.exchange.dao.User;

import ir.co.pna.exchange.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;


@Repository
public class UserDAOJpaImpl implements UserDAO {

	private EntityManager entityManager;

	@Autowired
	public UserDAOJpaImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}

	@Override
	public List<User> findAll() {

		// create a query
		Query theQuery =
				entityManager.createQuery("from User");

		// execute query and get result list
		List<User> users = theQuery.getResultList();

		// return the results
		return users;
	}

	@Override
	public User findById(long theId) {

		User theUser =
				entityManager.find(User.class, theId);
		
		return theUser;
	}

	@Override
	public long save(User theUser) {

		User dbUser = entityManager.merge(theUser);
		
		// update with id from db ... so we can get generated id for save/insert
		theUser.setNationalCode(dbUser.getNationalCode());

		return theUser.getNationalCode();
		
	}

	@Override
	public void deleteById(long theId) {

		// delete object with primary key
		Query theQuery = entityManager.createQuery(
							"delete from User where nationalCode=:userId");
		
		theQuery.setParameter("userId", theId);
		
		theQuery.executeUpdate();
	}
}










