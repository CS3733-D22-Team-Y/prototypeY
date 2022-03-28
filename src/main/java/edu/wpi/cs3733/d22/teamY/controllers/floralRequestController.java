package edu.wpi.cs3733.d22.teamY.controllers;

import com.jfoenix.controls.JFXRadioButton;
import edu.wpi.cs3733.d22.teamY.App;
import java.io.IOException;
import java.util.Objects;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class floralRequestController {
  @FXML private JFXRadioButton GetWellSoonBouquetRadioButton;
  @FXML private JFXRadioButton NewBabyRadioButton;
  @FXML private JFXRadioButton BouquetOfTheDayRadioButton;
  @FXML private TextField floralRoomID;
  @FXML private TextField floralPatientName;
  @FXML private TextArea floralAdditionalNotes;

  private Scene requestMenu = null;

  public floralRequestController() throws IOException {}

  @FXML
  void backToRequestMenu(ActionEvent event) throws IOException {
    if (requestMenu == null) {
      requestMenu =
          new Scene(
              FXMLLoader.load(
                  Objects.requireNonNull(App.class.getResource("views/requestMenu.fxml"))));
    }
    App.getInstance().setScene(requestMenu); // Returns to request menu
  }

  @FXML
  void resetAllFields() {
    GetWellSoonBouquetRadioButton.setSelected(false);
    NewBabyRadioButton.setSelected(false);
    BouquetOfTheDayRadioButton.setSelected(false);
    floralRoomID.setText("");
    floralPatientName.setText("");
    floralAdditionalNotes.setText("");
  }
}
