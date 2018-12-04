package com.nebrija.tpra;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;

public class MainPageController {

    @FXML
    private MenuButton productDeploy;

    @FXML
    private MenuItem buyButton;

    @FXML
    private MenuItem searchButton;

    @FXML
    private MenuItem seeAllButton;

    @FXML
    private MenuItem lastAddedButton;

    @FXML
    private MenuButton categoryDeploy;

    @FXML
    private Button signUpButton;

    @FXML
    private Button aboutUsButton;

    @FXML
    void pressAboutUsButton(ActionEvent event) {
    	Interface.webShopPrimary.close();
    	//Interface.
    }

    @FXML
    void pressBuyButton(ActionEvent event) {
    	Interface.webShopPrimary.close();
    	Interface.buyStage.show();
    }

    @FXML
    void pressLastAddedButton(ActionEvent event) {
    	
    }

    @FXML
    void pressSearchButton(ActionEvent event) {
    	Interface.webShopPrimary.close();
    	Interface.searchStage.show();
    }

    @FXML
    void pressSeeAllButton(ActionEvent event) {
    	Interface.webShopPrimary.close();
    	Interface.seeAllStage.show();
    }

    @FXML
    void pressSignUpButton(ActionEvent event) {
    	
    }

    @FXML
    void splitCategoryButton(ActionEvent event) {

    }

    @FXML
    void splitProductButton(ActionEvent event) {
    	
    }

}

