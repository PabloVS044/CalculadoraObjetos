/*
    Nombre: Pablo José Vásquez Santos
    Código Técnico: IN5AM
    Carné: 2018044
    Fecha de Creación: 21/03/2022
 */
package org.pablovasquez.system;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Principal extends Application {
    
    @Override
    public void start(Stage escenarioPrincipal) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Calculadora.fxml"));
        
        Scene escena = new Scene(root);
        
        escenarioPrincipal.setScene(escena);
        escenarioPrincipal.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
    
}
