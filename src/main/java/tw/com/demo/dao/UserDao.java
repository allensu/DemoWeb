package tw.com.demo.dao;

import java.util.List;

import tw.com.demo.pojo.UserT;

public interface UserDao {
	public List<UserT> getUserTAll();
	public void addUser(UserT user);
}
