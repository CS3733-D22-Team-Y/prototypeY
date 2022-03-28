package edu.wpi.cs3733.d22.teamY.controllers;

import edu.wpi.cs3733.d22.teamY.App;
import java.awt.*;
import java.io.IOException;
import java.util.Objects;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

public class requestMenuController {

  public requestMenuController() throws IOException {}

  // All below methods call corresponding scene setting methods in an instance of app
  // These are called by the corresponding button in the Request Menu (requestMenu.fxml)
  @FXML
  void securityServices() throws IOException {
    Scene securityRequest =
        new Scene(
            FXMLLoader.load(
                Objects.requireNonNull(
                    App.class.getResource("views/securityServicesRequest.fxml"))));

    App.getInstance().setScene(securityRequest);
  }

  @FXML
  void medicalEquipment() throws IOException {
    App.getInstance().setSceneToMedicalEquipmentRequest();
  }

  @FXML
  void floralDelivery() throws IOException {
    App.getInstance().setSceneToFloralRequest();
  }

  @FXML
  void laundryServices() throws IOException {
    App.getInstance().setSceneToLaundryRequest();
  }

  @FXML
  void mealDelivery() throws IOException {
    App.getInstance().setSceneToMealRequest();
  }

  @FXML
  void activeRequests() throws IOException {
    App.getInstance().setSceneToActiveRequests();
  }
}
