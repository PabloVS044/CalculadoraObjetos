/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pablovasquez.system;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 *
 * @author informatica
 */
public class FXMLDocumentController implements Initializable {
    
    double dato1, dato2, dato3, result=0, result2=0, result3=0, ciclo, tempResultResta, cont;
    int op;
    
    @FXML private Button btnCero;
    @FXML private Button btnUno;
    @FXML private Button btnDos;
    @FXML private Button btnTres;
    @FXML private Button btnCuatro;
    @FXML private Button btnCinco;
    @FXML private Button btnSeis;
    @FXML private Button btnSiete;
    @FXML private Button btnOcho;
    @FXML private Button btnNueve;
    @FXML private Button btnMasMenos;
    @FXML private Button btnPunto;
    @FXML private Button btnIgual;
    @FXML private Button btnMas;
    @FXML private Button btnResta;
    @FXML private Button btnMulti;
    @FXML private Button btnDiv;
    @FXML private Button btnRaiz;
    @FXML private Button btnCuadrado;
    @FXML private Button btnUnoDiv;
    @FXML private Button btnPorcen;
    @FXML private Button btnCE;
    @FXML private Button btnC;
    @FXML private TextField txtPantalla;
    
    
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        if (event.getSource() == btnUno)
            txtPantalla.setText(txtPantalla.getText() + "1");
        else if (event.getSource() == btnDos)
            txtPantalla.setText(txtPantalla.getText() + "2");
        else if (event.getSource() == btnTres)
            txtPantalla.setText(txtPantalla.getText() + "3");
        else if (event.getSource() == btnCuatro)
            txtPantalla.setText(txtPantalla.getText() + "4");
        else if (event.getSource() == btnCinco)
            txtPantalla.setText(txtPantalla.getText() + "5");
        else if (event.getSource() == btnSeis)
            txtPantalla.setText(txtPantalla.getText() + "6");
        else if (event.getSource() == btnSiete)
            txtPantalla.setText(txtPantalla.getText() + "7");
        else if (event.getSource() == btnOcho)
            txtPantalla.setText(txtPantalla.getText() + "8");
        else if (event.getSource() == btnNueve)
            txtPantalla.setText(txtPantalla.getText() + "9");
        else if (event.getSource() == btnCero)
            txtPantalla.setText(txtPantalla.getText() + "0");
        else if (event.getSource() == btnMas){
            dato1 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            op = 1;
            result2 = result2 + dato1;
            btnPunto.setDisable(false);
        } else if (event.getSource() == btnResta){
            dato1 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            op = 2;
            btnPunto.setDisable(false);
        }else if (event.getSource() == btnMulti){
            dato1 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            op = 3;
            btnPunto.setDisable(false);
        }else if (event.getSource() == btnDiv){
            dato1 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            op = 4;
            btnPunto.setDisable(false);
        }else if (event.getSource() == btnCuadrado){
            dato1 = Double.parseDouble(txtPantalla.getText());
            result = Math.pow(dato1, 2);
            txtPantalla.clear();
            txtPantalla.setText(String.valueOf(result));
        }else if (event.getSource() == btnC){
            txtPantalla.clear();
            dato1 = 0;
            dato2 = 0;
            result = 0;
            tempResultResta = 0;
            dato3 = 0;
            cont = 0;
        }else if (event.getSource() == btnCE){
            txtPantalla.clear();
        }else if (event.getSource() == btnPorcen){
            double valPorcent, valPantalla;
            valPantalla = Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            valPorcent = dato1 * valPantalla / 100;   
            txtPantalla.setText(String.valueOf(valPorcent));
        }else if (event.getSource() == btnRaiz){
            dato1 = Double.parseDouble(txtPantalla.getText());
            result = Math.sqrt(dato1);
            txtPantalla.clear();
            txtPantalla.setText(String.valueOf(result));
        }else if (event.getSource() == btnMasMenos){
            dato1 = Double.parseDouble(txtPantalla.getText());
            result = dato1*(-1);
            txtPantalla.clear();
            txtPantalla.setText(String.valueOf(result));
        }else if(event.getSource() == btnUnoDiv){
            dato1 = Double.parseDouble(txtPantalla.getText());
            result = 1 / dato1;
            txtPantalla.clear();
            txtPantalla.setText(String.valueOf(result));
        }else if (event.getSource() == btnPunto){
            if (txtPantalla.getText().length() == 0){
                txtPantalla.setText("0.");
                btnPunto.setDisable(true);
                }
            else{
                txtPantalla.setText(txtPantalla.getText() + ".");
                btnPunto.setDisable(true);
            }
       
        }else if (event.getSource() == btnIgual){
            dato2 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            btnPunto.setDisable(false);
            switch(op){
                case 1:
                    result = result2 + dato2;
                    txtPantalla.setText(String.valueOf(result));
                    result2 = 0;
                break;
                
                case 2:
                    result = dato1 - dato2;
                    txtPantalla.setText(String.valueOf(result));
                break;
                
                case 3:
                    result = dato1 * dato2;
                    txtPantalla.setText(String.valueOf(result));
                break;
                
                case 4:
                    result = dato1 / dato2;
                    txtPantalla.setText(String.valueOf(result));
                break;
            }
           }    
    
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
}
