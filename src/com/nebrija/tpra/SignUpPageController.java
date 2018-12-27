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
		
    	HiloLecturaCola lector = new HiloLecturaCola(user1);
		HiloEscrituraCola escritor = new HiloEscrituraCola(user1, lector);
		Thread hiloEscritor = new Thread(escritor);
		hiloEscritor.start();
		lector.start();
    	
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

	public TextField getEmailText() {
		return emailText;
	}

	public void setEmailText(TextField emailText) {
		this.emailText = emailText;
	}

	public TextField getUsernameText() {
		return usernameText;
	}

	public void setUsernameText(TextField usernameText) {
		this.usernameText = usernameText;
	}

	public PasswordField getPasswordText() {
		return passwordText;
	}

	public void setPasswordText(PasswordField passwordText) {
		this.passwordText = passwordText;
	}


}
