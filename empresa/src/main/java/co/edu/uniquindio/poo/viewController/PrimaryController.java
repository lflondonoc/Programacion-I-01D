package co.edu.uniquindio.poo.viewController;

import java.net.URL;
import java.util.ResourceBundle;
import co.edu.uniquindio.poo.App;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class PrimaryController {
  @FXML
  private ResourceBundle resources;

  App app;
  @FXML
  private URL location;

  @FXML
  private Button primaryButton;

  @FXML
  void onOpenCrudCliente() {
    app.openCrudCliente();
  }

  public void setApp(App app) {
      this.app = app;
  }

  @FXML
  void initialize() {

  }
}
