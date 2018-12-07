package com.nebrija.tpra;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class AboutUsPageController {

    @FXML
    private Button webShopButton;

    @FXML
    void pressWebShopButton(ActionEvent event) {
    	Interface.aboutUsStage.close();
    	Interface.webShopPrimary.show();
    }

}
