package com.example.inversematrix;

import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;

public class Controller {

    @FXML
    private ToggleGroup MatrixDimension;

    @FXML
    private RadioButton five;

    @FXML
    private RadioButton four;

    @FXML
    private GridPane matrix2;

    @FXML
    private TextField matrix211;

    @FXML
    private TextField matrix212;

    @FXML
    private TextField matrix221;

    @FXML
    private GridPane matrix3;

    @FXML
    private TextField matrix311;

    @FXML
    private TextField matrix312;

    @FXML
    private TextField matrix313;

    @FXML
    private TextField matrix321;

    @FXML
    private TextField matrix322;

    @FXML
    private TextField matrix323;

    @FXML
    private TextField matrix331;

    @FXML
    private TextField matrix332;

    @FXML
    private TextField matrix333;

    @FXML
    private GridPane matrix4;

    @FXML
    private TextField matrix411;

    @FXML
    private TextField matrix412;

    @FXML
    private TextField matrix413;

    @FXML
    private TextField matrix414;

    @FXML
    private TextField matrix421;

    @FXML
    private TextField matrix422;

    @FXML
    private TextField matrix423;

    @FXML
    private TextField matrix424;

    @FXML
    private TextField matrix431;

    @FXML
    private TextField matrix432;

    @FXML
    private TextField matrix433;

    @FXML
    private TextField matrix434;

    @FXML
    private TextField matrix441;

    @FXML
    private TextField matrix442;

    @FXML
    private TextField matrix443;

    @FXML
    private TextField matrix444;

    @FXML
    private GridPane matrix5;

    @FXML
    private TextField matrix511;

    @FXML
    private TextField matrix512;

    @FXML
    private TextField matrix513;

    @FXML
    private TextField matrix514;

    @FXML
    private TextField matrix515;

    @FXML
    private TextField matrix521;

    @FXML
    private TextField matrix522;

    @FXML
    private TextField matrix523;

    @FXML
    private TextField matrix524;

    @FXML
    private TextField matrix525;

    @FXML
    private TextField matrix531;

    @FXML
    private TextField matrix532;

    @FXML
    private TextField matrix533;

    @FXML
    private TextField matrix534;

    @FXML
    private TextField matrix535;

    @FXML
    private TextField matrix541;

    @FXML
    private TextField matrix542;

    @FXML
    private TextField matrix543;

    @FXML
    private TextField matrix544;

    @FXML
    private TextField matrix545;

    @FXML
    private TextField matrix551;

    @FXML
    private TextField matrix552;

    @FXML
    private TextField matrix553;

    @FXML
    private TextField matrix554;

    @FXML
    private TextField matrix555;

    @FXML
    private TextField matrixx222;

    @FXML
    private RadioButton three;

    @FXML
    private RadioButton two;

    @FXML
    void clickDimension(MouseEvent event) {
        if(MatrixDimension.getSelectedToggle().equals(two)){
            matrix2.setVisible(true);
            matrix3.setVisible(false);
            matrix4.setVisible(false);
            matrix5.setVisible(false);
        } else if (MatrixDimension.getSelectedToggle().equals(three)) {
            matrix3.setVisible(true);
            matrix2.setVisible(false);
            matrix4.setVisible(false);
            matrix5.setVisible(false);
        } else if (MatrixDimension.getSelectedToggle().equals(four)) {
            matrix4.setVisible(true);
            matrix3.setVisible(false);
            matrix2.setVisible(false);
            matrix5.setVisible(false);
        } else if (MatrixDimension.getSelectedToggle().equals(five)) {
            matrix5.setVisible(true);
            matrix3.setVisible(false);
            matrix4.setVisible(false);
            matrix2.setVisible(false);
        }
    }
    public double[][] calculateInverse(Matrix matrix){
        return matrix.getInverse();
    }

}


