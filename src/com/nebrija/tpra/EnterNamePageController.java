package com.nebrija.tpra;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class EnterNamePageController {

    @FXML
    private TextField nameText;

    @FXML
    private Button searchButton;

    @FXML
    private TextField showText;

    @FXML
    private Button WebShopButton;

    @FXML
    void pressSearchButton(ActionEvent event) {
    	
    }

    @FXML
    void pressWebShopButton(ActionEvent event) {
    	Interface.searchStage.close();
    	Interface.webShopPrimary.show();

    }

    @FXML
    void viewShowText(ActionEvent event) {

    }

    @FXML
    void writeNameText(ActionEvent event) {
    	
    }

}
