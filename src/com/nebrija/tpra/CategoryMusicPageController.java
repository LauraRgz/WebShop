package com.nebrija.tpra;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class CategoryMusicPageController {

    @FXML
    private Button WebShopButton;

    @FXML
    private TextArea textArea;

    @FXML
    private Button showButton;

    @FXML
    void pressShowButton(ActionEvent event) {
    	String y = "";
    	String z = "Music";
    	for(int i = 0; i < Main.getList1().size(); i++) {
    		if (z.equals(Main.getList1().get(i).getCategoryProduct())) {
    			y += Main.getList1().get(i).getName();
    			textArea.setText(y);
    			
    		}
    		else {
    			textArea.setText("Category not found");
    		}
    	}

    }

    @FXML
    void pressWebShopButton(ActionEvent event) {
    	Interface.categoryMusicStage.close();
    	Interface.webShopPrimary.show();
    }

}
