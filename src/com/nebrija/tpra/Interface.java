package com.nebrija.tpra;

import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Interface extends Application{
	static Stage webShopPrimary;
	static Stage buyStage;
	static Stage searchStage;
	static Stage seeAllStage;
	static Stage signUpStage;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			webShopPrimary = new Stage();
			URL mainPage1 = getClass().getClassLoader().getResource("MainPage.fxml");
			Parent rootMainPage = FXMLLoader.load(mainPage1);
			Scene sceneMainPage = new Scene(rootMainPage);
			
			webShopPrimary.setTitle("MainPage");
			webShopPrimary.setScene(sceneMainPage);
			webShopPrimary.show();
			
			
			buyStage = new Stage();
			URL buyPage1 = getClass().getClassLoader().getResource("BuyPage.fxml");
			Parent rootBuyPage = FXMLLoader.load(buyPage1);
			Scene sceneBuyPage = new Scene(rootBuyPage);
			
			buyStage.setTitle("BuyPage");
			buyStage.setScene(sceneBuyPage);
			
			
			searchStage = new Stage();
			URL searchPage1 = getClass().getClassLoader().getResource("EnterNamePage.fxml");
			Parent rootSearchPage = FXMLLoader.load(searchPage1);
			Scene sceneSearchPage = new Scene(rootSearchPage);
			
			searchStage.setTitle("SearchPage");
			searchStage.setScene(sceneSearchPage);
			
			
			seeAllStage = new Stage();
			URL seeAllPage1 = getClass().getClassLoader().getResource("ProductListPage.fxml");
			Parent rootSeeAllPage = FXMLLoader.load(seeAllPage1);
			Scene sceneSeeAllPage = new Scene(rootSeeAllPage);
			
			seeAllStage.setTitle("SeeAllPage");
			seeAllStage.setScene(sceneSeeAllPage);
			
			
			signUpStage = new Stage();
			URL signUpPage1 = getClass().getClassLoader().getResource("SignUpPage.fxml");
			Parent rootSignUpPage = FXMLLoader.load(signUpPage1);
			Scene sceneSignUpPage = new Scene(rootSignUpPage);
			
			signUpStage.setTitle("SignUpPage");
			signUpStage.setScene(sceneSignUpPage);
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		
		
	}
	
	public static void inicio() {
		launch(null);
	}
	
}
