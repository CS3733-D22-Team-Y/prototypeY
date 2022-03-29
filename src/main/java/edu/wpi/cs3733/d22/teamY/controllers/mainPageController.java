package edu.wpi.cs3733.d22.teamY.controllers;

import edu.wpi.cs3733.d22.teamY.App;
import java.io.IOException;
import java.util.Objects;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

public class mainPageController {
  @FXML
  void backToWelcomePage(ActionEvent event) throws IOException {
    // Setting it to request menu for now but will make it to welcome page
    Scene s =
        new Scene(
            FXMLLoader.load(
                Objects.requireNonNull(getClass().getResource("views/requestMenu.fxml"))));
    App.getInstance().setScene(s);
  }

  void createServiceRequest(ActionEvent event) throws IOException {
    // Sets scene to service request page
    Scene s =
        new Scene(
            FXMLLoader.load(
                Objects.requireNonNull(App.class.getResource("views/requestMenu.fxml"))));
    App.getInstance().setScene(s);
  }

  void viewServiceRequest(ActionEvent event) throws IOException {
    // Sets scene to view service request
    Scene s =
        new Scene(
            FXMLLoader.load(
                Objects.requireNonNull(App.class.getResource("views/activeRequests.fxml"))));
    App.getInstance().setScene(s);
  }
}
