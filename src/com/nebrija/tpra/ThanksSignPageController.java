package com.nebrija.tpra;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ThanksSignPageController {

    @FXML
    private Button webShopButton;

    @FXML
    void pressWebShopButton(ActionEvent event) {
    	Interface.thanks2Stage.close();
    	Interface.webShopPrimary.show();
    }

}
