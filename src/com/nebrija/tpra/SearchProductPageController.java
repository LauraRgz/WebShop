package com.nebrija.tpra;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class SearchProductPageController {
	MenuFunction funcion = new MenuFunction();
    @FXML
    private TextField nameText;

    @FXML
    private TextArea enterText;

    @FXML
    private Button searchButton;

    @FXML
    private Button webShopButton;

    @FXML
    void pressSearchButton(ActionEvent event) {
     	
    	/*String nameProduct = nameText.getText();
    	for (int i = 0; i< Main.getList1().size(); i++) {
	    	if (funcion.option1(nameProduct) != null) {
	    		
	    		enterText.setText(funcion.option1(nameProduct).getName());
	    	}
	    	else
	    		enterText.setText("no");
    	}*/
    }
    

    @FXML
    void pressWebShopButton(ActionEvent event) {
    	Interface.searchStage.close();
    	Interface.webShopPrimary.show();
    }

    @FXML
    void writeNameText(ActionEvent event) {

    }

}