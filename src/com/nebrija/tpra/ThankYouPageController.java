package com.nebrija.tpra;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ThankYouPageController {

    @FXML
    private Button continueButton;
  
    @FXML
    void pressContinueButton(ActionEvent event) {
    	Interface.thanksStage.close();
    	Interface.buyStage.show();
    }

}