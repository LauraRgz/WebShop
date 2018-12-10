package com.nebrija.tpra;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SignUpPageController {

	UserList list2 = new UserList();
	
    @FXML
    private TextField emailText;

    @FXML
    private TextField usernameText;

    @FXML
    private Button signUpButton;

    @FXML
    private Button WebShopButton;

    @FXML
    private PasswordField passwordText;

    @FXML
    void enterEmailText(ActionEvent event) {

    }

    @FXML
    void enterUsernameText(ActionEvent event) {

    }

    @FXML
    void pressSignUpButton(ActionEvent event) {
		 User user1 = new User(emailText.getText(), usernameText.getText(), passwordText.getText());
		 list2.addUser(user1);
		 
    	
    	Interface.signUpStage.close();
    	Interface.thanks2Stage.show();
    }

    @FXML
    void pressWebShopButton(ActionEvent event) {
    	Interface.signUpStage.close();
    	Interface.webShopPrimary.show();
    }

    @FXML
    void writePassword(ActionEvent event) {

    }

}
