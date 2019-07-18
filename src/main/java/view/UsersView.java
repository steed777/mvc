package view;


import bean.User;
import controller.Controller;
import model.ModelData;

public class UsersView implements View{
    private Controller controller;
public void fireEventOpenEditForm(long id){
    controller.onOpenUserEditForm(id);
}
    @Override
    public void refresh(ModelData modelData) {
        if (!modelData.isDisplayDeletedUserList()) {
            System.out.println("All users:");
        }else {
            System.out.println("All deleted users:");
        }
        for (User u : modelData.getUsers()){
            System.out.println("\t" + u.toString());


        }

        System.out.println("===================================================");
    }

    @Override
    public void setController(Controller controller) {
this.controller = controller;
    }
   public void fireEventShowAllUsers(){
controller.onShowAllUsers();
    }
    public void fireEventShowDeletedUsers(){
        controller.onShowAllDeletedUsers();
    }
    public void fireEventOpenUserEditForm(long id){
    controller.onOpenUserEditForm(id);
    }
}
