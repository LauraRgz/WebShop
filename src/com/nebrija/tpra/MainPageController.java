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
    private MenuButton categoryDeploy;

    @FXML
    private MenuItem booksButton;

    @FXML
    private MenuItem musicButton;

    @FXML
    private MenuItem filmButton;

    @FXML
    private Button signUpButton;

    @FXML
    private Button aboutUsButton;

    @FXML
    void pressAboutUsButton(ActionEvent event) {
    	Interface.webShopPrimary.close();
    	Interface.aboutUsStage.show();
    }

    @FXML
    void pressBooksButton(ActionEvent event) {
    	Interface.webShopPrimary.close();
    	Interface.categoryStage.show();
    }

    @FXML
    void pressBuyButton(ActionEvent event) {
    	Interface.webShopPrimary.close();
    	Interface.buyStage.show();
    }

    @FXML
    void pressFilmButton(ActionEvent event) {
    	Interface.webShopPrimary.close();
    	Interface.categoryFilmsStage.show();
    }

    @FXML
    void pressMusicButton(ActionEvent event) {
    	Interface.webShopPrimary.close();
    	Interface.categoryMusicStage.show();
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
    	Interface.webShopPrimary.close();
    	Interface.signUpStage.show();
    }

    @FXML
    void splitCategoryButton(ActionEvent event) {

    }

    @FXML
    void splitProductButton(ActionEvent event) {

    }

}

