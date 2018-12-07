package com.nebrija.tpra;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class ProductsByCategoryPageController {

    @FXML
    private Button WebShopButton;

    @FXML
    private TextArea textArea;

    @FXML
    private Button showButton;

    @FXML
    void pressShowButton(ActionEvent event) {
    	String x = "";
    	String z = "Books" ;
    	for(int i = 0; i < Main.getList1().size(); i++) {
    		if (!z.equals(Main.getList1().get(i).getCategoryProduct())) {
    			x += Main.getList1().get(i).getName();
    			textArea.setText(x);
    			
    		}
    		else {
    			textArea.setText("Category not found");
    		}
    	}
    	
    }

    @FXML
    void pressWebShopButton(ActionEvent event) {

    }


}
