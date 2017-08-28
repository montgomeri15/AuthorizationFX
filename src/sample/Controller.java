package sample;

import javafx.event.ActionEvent;  //Очень важно, чтобы было не awt
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {

    String login = "aaaa";
    String password = "1111";

    @FXML
    private TextField txt1;
    @FXML
    private TextField txt2;

    public void pressButton(ActionEvent event){

        if (txt1.getText().equals(login) && txt2.getText().equals(password)){
            System.out.println("Поздравляем! Вы вошли в защищенное пространство.");
        } else{
            txt2.setText("");
            System.out.println("Неправильный логин или пароль");
        }
    }
}
