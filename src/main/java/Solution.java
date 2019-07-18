
import controller.Controller;
import model.FakeModel;
import model.MainModel;
import model.Model;
import view.EditUserView;
import view.UsersView;

public class Solution {
    public static void main(String[] args) {
        Model model = new MainModel();
        UsersView usersView = new UsersView();
        Controller controller = new Controller();
        EditUserView editUserView = new EditUserView();

        controller.setEditUserView(editUserView);
        usersView.setController(controller);
        editUserView.setController(controller);
        controller.setModel(model);
        controller.setUsersView(usersView);

        usersView.fireEventShowAllUsers();
        usersView.fireEventOpenUserEditForm(126L);
        editUserView.fireEventUserDeleted(124L);
        editUserView.fireEventUserChanged("123", 126L, 2);
        usersView.fireEventShowDeletedUsers();
    }
}
