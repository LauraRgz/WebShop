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
    		//x += Main.getList1().get(i).getCategoryProduct();
    		//if (!z.equals(x)) {
    			//y += Main.getList1().get(i).getName();
    		
    		if (!z.equals(Main.getList1().get(i).getCategoryProduct())) {
    			
    			
    			textArea.setText(Main.getList1().get(i).getName());
    			
    		}
    		else {
    			textArea.setText("No");
    		}
    	}
    	
    }

    @FXML
    void pressWebShopButton(ActionEvent event) {

    }


}
