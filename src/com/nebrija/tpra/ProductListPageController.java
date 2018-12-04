package com.nebrija.tpra;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ProductListPageController {

    @FXML
    private TextField productsText;

    @FXML
    private Button WebShopButton;

    @FXML
    void pressWebShopButton(ActionEvent event) {
    	Interface.seeAllStage.close();
    	Interface.webShopPrimary.show();
    }

    @FXML
    void showProductText(ActionEvent event) {
    	
    }

}
