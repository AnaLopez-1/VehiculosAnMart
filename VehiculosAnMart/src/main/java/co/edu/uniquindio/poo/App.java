package co.edu.uniquindio.poo;

import co.edu.uniquindio.poo.model.Vehiculo;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            // Cargar la interfaz principal desde el archivo FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/primary.fxml"));
            Parent root = loader.load();
            
            // Configurar el escenario principal
            primaryStage.setTitle("Gestion Vehiculos");
            primaryStage.setScene(new Scene(root));
            primaryStage.setResizable(false);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
