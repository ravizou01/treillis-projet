/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.avizou.s2;

import fr.insa.avizou.s2.Groupe;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author romainavizou
 */
public class Main extends javafx.application.Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("Projet Treillis");
        Groupe model = new Groupe();
  //   Scene scene = new Scene(new Interface());
        //Groupe model = Groupe.groupeTest();
        Scene scene = new Scene(new Interface(model));
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}