package model;

import java.util.ArrayList;
import java.util.List;

import bean.User;

public class FakeModel implements Model {
    @Override
    public ModelData getModelData() {
        return modelData;
    }

    private ModelData modelData = new ModelData();

    @Override
    public void loadUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User("A", 2, 1));
        users.add(new User("B", 1, 2));
        modelData.setUsers(users);
    }

    @Override
    public void loadDeletedUsers() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException();
    }

    @Override
    public void loadUserById(long userId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteUserById(long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException();
    }

    @Override
    public void changeUserData(String name, long id, int level) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException();
    }
}
