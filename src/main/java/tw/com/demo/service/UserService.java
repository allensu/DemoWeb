package tw.com.demo.service;

import java.util.List;

import tw.com.demo.pojo.UserT;

public interface UserService {
	public List<UserT> getUserTAll();
	public void addUser(UserT user);
}
