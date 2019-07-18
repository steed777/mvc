package model;

import java.util.List;


import bean.User;
import model.service.UserService;
import model.service.UserServiceImpl;


public class MainModel implements Model{
	private ModelData modelData = new ModelData();
	private UserService userService = new UserServiceImpl();
	
	
	  private List<User> getAllUsers() {
	        return userService.filterOnlyActiveUsers(userService.getUsersBetweenLevels(1, 100));
	    }
	@Override
		public ModelData getModelData() {
			// TODO Auto-generated method stub
			return modelData;
		}
@Override
public void loadUsers() {
	// TODO Auto-generated method stub
	modelData.setUsers(userService.getUsersBetweenLevels(1, 100));
	modelData.setDisplayDeletedUserList(false);
}
@Override
public void loadDeletedUsers() {
	// TODO Auto-generated method stub
	List<User> users = userService.getAllDeletedUsers();
	modelData.setUsers(users);
	modelData.setDisplayDeletedUserList(true);
			}
public void loadUserById(long userId) {
User user = userService.getUsersById(userId);
modelData.setActiveUser(user);
}
@Override
public void deleteUserById(long id) {
	// TODO Auto-generated method stub
	userService.deleteUser(id);
    modelData.setDisplayDeletedUserList(false);
    modelData.setUsers(getAllUsers());
}
@Override
public void changeUserData(String name, long id, int level) {
	// TODO Auto-generated method stub
	userService.createOrUpdateUser(name,id,level);
    loadUsers();
}
}
