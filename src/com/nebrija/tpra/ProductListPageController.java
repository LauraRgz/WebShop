package com.nebrija.tpra;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class ProductListPageController {

    @FXML
    private Button WebShopButton;

    @FXML
    private TextArea textArea;

    @FXML
    private Button showButton;

    @FXML
    void pressShowButton(ActionEvent event) {
    	String x = "";
    	String y = "";
    	
    	for (int i = 0; i < Main.getList1().size(); i++) {
    		x += Main.getList1().get(i).getName()+"\r\n";
    	
    		textArea.setText("Products: \r\n" + x);
    	}
    }

    @FXML
    void pressWebShopButton(ActionEvent event) {
    	Interface.seeAllStage.close();
    	Interface.webShopPrimary.show();
    }

}
