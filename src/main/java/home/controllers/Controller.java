package main.java.home.controllers;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.layout.*;

import java.awt.*;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Button btnStudents;

    @FXML
    private Button btnTeachers;

    @FXML
    private Button btnFees;

    @FXML
    private Button btnUsers;

    @FXML
    private Button btnSettings;

    @FXML
    private Pane pnlStatus;

    @FXML
    private Label lblStatus;

    @FXML
    private Label lblStatusMini;

    @FXML
    private FontAwesomeIconView btnClose;

    @FXML
    private GridPane pnStudents;

    @FXML
    private Label pnTeachers;

    @FXML
    private Label pnFees;

    @FXML
    private Label pnUsers;

    @FXML
    private Label pnSettings;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    public void handleClicks(ActionEvent event) {
        if (event.getSource() == btnStudents) {
            lblStatusMini.setText("/home/students");
            lblStatus.setText("Students");
//            pnlStatus.setBackground(new Background(new BackgroundFill(Color.rgb(113, 86, 221), CornerRadii.EMPTY, Insets.EMPTY)));
//            pnStudents.toFront();
        } else if (event.getSource() == btnTeachers) {
            lblStatusMini.setText("/home/teachers");
            lblStatus.setText("Teachers");
//            pnlStatus.setBackground(new Background(new BackgroundFill(Color.rgb(43, 63, 99), CornerRadii.EMPTY, Insets.EMPTY)));
//            pnTeachers.toFront();
        } else if (event.getSource() == btnFees) {
            lblStatusMini.setText("/home/fees");
            lblStatus.setText("Fees");
//            pnlStatus.setBackground(new Background(new BackgroundFill(Color.rgb(43, 99, 63), CornerRadii.EMPTY, Insets.EMPTY)));
//            pnFees.toFront();
        } else if (event.getSource() == btnUsers) {
            lblStatusMini.setText("/home/users");
            lblStatus.setText("Users");
//            pnlStatus.setBackground(new Background(new BackgroundFill(Color.rgb(99, 43, 63), CornerRadii.EMPTY, Insets.EMPTY)));
//            pnUsers.toFront();
        } else if (event.getSource() == btnSettings) {
            lblStatusMini.setText("/home/settings");
            lblStatus.setText("Settings");
//            pnlStatus.setBackground(new Background(new BackgroundFill(Color.rgb(42, 28, 66), CornerRadii.EMPTY, Insets.EMPTY)));
//            pnSettings.toFront();
        }
    }

    public void handleClose(javafx.scene.input.MouseEvent event) {
        if(event.getSource() == btnClose) {
            System.exit(0);
        }
    }
}