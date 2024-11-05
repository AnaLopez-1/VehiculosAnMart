package co.edu.uniquindio.poo.viewController;

import co.edu.uniquindio.poo.model.Reserva;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.time.LocalDate;

public class MainViewController {
    // Campos de la interfaz
    @FXML private DatePicker fechaInicioPicker;
    @FXML private DatePicker fechaFinPicker;
    @FXML private ChoiceBox<String> clienteChoiceBox;
    @FXML private ChoiceBox<String> vehiculoChoiceBox;
    @FXML private TextField costoTextField;
    @FXML private TableView<Reserva> reservasTable;
    @FXML private TableColumn<Reserva, LocalDate> colFechaInicio;
    @FXML private TableColumn<Reserva, LocalDate> colFechaFin;
    @FXML private TableColumn<Reserva, String> colCliente;
    @FXML private TableColumn<Reserva, String> colVehiculo;
    @FXML private TableColumn<Reserva, Double> colCosto;

    private ObservableList<Reserva> reservasList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        // Configuración de columnas de la tabla
        colFechaInicio.setCellValueFactory(new PropertyValueFactory<>("fechaInicio"));
        colFechaFin.setCellValueFactory(new PropertyValueFactory<>("fechaFin"));
        colCliente.setCellValueFactory(new PropertyValueFactory<>("cliente"));
        colVehiculo.setCellValueFactory(new PropertyValueFactory<>("vehiculo"));
        colCosto.setCellValueFactory(new PropertyValueFactory<>("costo"));

        // Asignar lista predeterminada de clientes y vehículos
        clienteChoiceBox.setItems(FXCollections.observableArrayList("Maritza Calderon", "Ana López", "Luisa Londoño"));
        vehiculoChoiceBox.setItems(FXCollections.observableArrayList("Auto", "Moto-Automática", "Camioneta"));

        // Asignar la lista de reservas a la tabla
        reservasTable.setItems(reservasList);
    }

    @FXML
    private void calcularCosto() {
        LocalDate fechaInicio = fechaInicioPicker.getValue();
        LocalDate fechaFin = fechaFinPicker.getValue();
        String cliente = clienteChoiceBox.getValue();
        String vehiculo = vehiculoChoiceBox.getValue();

        // Verificación de campos vacíos
        if (fechaInicio == null || fechaFin == null || cliente == null || vehiculo == null) {
            return;
        }

        // Verificación de fechas correctas
        if (fechaFin.isBefore(fechaInicio)) {
            return;
        }

        // Calcular el costo de la reserva
        double costo = calcularCostoReserva(vehiculo, fechaInicio, fechaFin);
        costoTextField.setText(String.format("%.3f", costo));
    }

    private double calcularCostoReserva(String vehiculo, LocalDate fechaInicio, LocalDate fechaFin) {
        // Lógica de cálculo del costo según tipo de vehículo
        long dias = java.time.temporal.ChronoUnit.DAYS.between(fechaInicio, fechaFin);
        double tarifaBase = 25.000; // Tarifa base por día
        double costo = tarifaBase * dias;

        if (vehiculo.contains("Moto")) {
            costo += 10.000; // Tarifa adicional para motos
        } else if (vehiculo.contains("Camioneta")) {
            costo += 100 * costo; // Aumento por carga para camionetas
        }

        return costo;
    }

    @FXML
    private void guardarReserva() {
        LocalDate fechaInicio = fechaInicioPicker.getValue();
        LocalDate fechaFin = fechaFinPicker.getValue();
        String cliente = clienteChoiceBox.getValue();
        String vehiculo = vehiculoChoiceBox.getValue();
        
        // Verificación de campos vacíos
        if (fechaInicio == null || fechaFin == null || cliente == null || vehiculo == null) {
            return;
        }

        // Obtener costo del campo de texto
        String costoStr = costoTextField.getText();
        double costo;

        // Verificar si el costo se ha calculado correctamente
        try {
            costo = Double.parseDouble(costoStr.replace(",", ".")); // Reemplazar la coma por punto
        } catch (NumberFormatException e) {
            return;
        }

        // Crear la nueva reserva y agregarla a la lista
        Reserva nuevaReserva = new Reserva(fechaInicio, fechaFin, cliente, vehiculo, costo);
        reservasList.add(nuevaReserva); // Actualiza automáticamente la TableView
    }

    @FXML
    private void eliminarReserva() {
        Reserva reservaSeleccionada = reservasTable.getSelectionModel().getSelectedItem();
        if (reservaSeleccionada != null) {
            reservasList.remove(reservaSeleccionada);
        }
    }

    @FXML
    private void limpiarFormulario() {
        fechaInicioPicker.setValue(null);
        fechaFinPicker.setValue(null);
        clienteChoiceBox.setValue(null);
        vehiculoChoiceBox.setValue(null);
        costoTextField.clear();
    }
}
