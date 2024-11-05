package co.edu.uniquindio.poo.viewController;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.collections.FXCollections;
import java.time.LocalDate;

public class ConfirmacionViewController {

    @FXML private DatePicker fechaInicioPicker;
    @FXML private DatePicker fechaFinPicker;
    @FXML private ChoiceBox<String> clienteChoiceBox;
    @FXML private ChoiceBox<String> vehiculoChoiceBox;
    @FXML private TextField costoTextField;
    @FXML private Button confirmarButton;
    
    private boolean reservaGenerada = false;

    @FXML
    public void initialize() {
        clienteChoiceBox.setItems(FXCollections.observableArrayList("Maritza Calderon", "Ana López", "Luisa Londoño"));
        vehiculoChoiceBox.setItems(FXCollections.observableArrayList("Auto", "Moto", "Camioneta"));
    }

    // Método para recibir datos de la reserva
    public void setDatosReserva(LocalDate fechaInicio, LocalDate fechaFin, String cliente, String vehiculo, double costo) {
        fechaInicioPicker.setValue(fechaInicio);
        fechaFinPicker.setValue(fechaFin);
        clienteChoiceBox.setValue(cliente);
        vehiculoChoiceBox.setValue(vehiculo);
        costoTextField.setText(String.format("%.3f", costo));
    }

    // Método para confirmar la generación de la reserva
    @FXML
    private void confirmarReserva() {
        reservaGenerada = true;
        confirmarButton.getScene().getWindow().hide(); // Cerrar la ventana
    }

    // Método para verificar si la reserva fue generada
    public boolean isReservaGenerada() {
        return reservaGenerada;
    }
}
