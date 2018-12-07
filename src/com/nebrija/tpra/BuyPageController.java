package com.nebrija.tpra;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class BuyPageController {

    @FXML
    private TextField nameField;

    @FXML
    private Button buyButton;

    @FXML
    private Button WebShopButton;
    
    @FXML
    private Text thankYouText;

    @FXML
    void pressBuyButton(ActionEvent event) {
    	Interface.buyStage.close();
    	Interface.thanksStage.show();
    }

    @FXML
    void pressWebShopButton(ActionEvent event) {
    	Interface.buyStage.close();
    	Interface.webShopPrimary.show();
    }

    @FXML
    void writeNameField(ActionEvent event) {

    }

}

