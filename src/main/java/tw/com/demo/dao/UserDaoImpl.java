package tw.com.demo.dao;

import java.util.List;
import tw.com.demo.pojo.UserT;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	public List<UserT> getUserTAll() {
		return sessionFactory.getCurrentSession().createQuery("from UserT").list();
	}

	public void addUser(UserT user) {
		sessionFactory.getCurrentSession().save(user);		
	}

}
