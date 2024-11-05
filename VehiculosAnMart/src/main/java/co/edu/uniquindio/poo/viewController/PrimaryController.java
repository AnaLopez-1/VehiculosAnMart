package co.edu.uniquindio.poo.viewController;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import java.io.IOException;

public class PrimaryController {

    @FXML
    private Button gestionarReservasButton; // Cambiado a gestionarReservasButton

    @FXML
    private void onOpenCrudReserva() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/co/edu/uniquindio/poo/crudReserva.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) gestionarReservasButton.getScene().getWindow(); // Obtener la ventana actual
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
