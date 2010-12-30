package tw.com.demo.service;

import java.util.List;

import tw.com.demo.dao.UserDao;
import tw.com.demo.pojo.UserT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Transactional
	public List<UserT> getUserTAll() {
		return userDao.getUserTAll();
	}

	@Transactional
	public void addUser(UserT user) {
		userDao.addUser(user);
	}


}
