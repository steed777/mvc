package view;

import controller.Controller;

import model.ModelData;

public interface View {
    void setController(Controller controller);

    void refresh(ModelData modelData);

}
