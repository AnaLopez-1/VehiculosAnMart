package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.model.TipoTransmision;
import co.edu.uniquindio.poo.model.Moto;
import co.edu.uniquindio.poo.model.Empresa;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MotoController {

    @FXML
    private TextField txtNumeroMatricula;

    @FXML
    private TextField txtModelo;

    @FXML
    private TextField txtMarca;

    @FXML
    private TextField txtAñoFabricacion;

    @FXML
    private TextField txtDiasReserva;

    @FXML
    private ComboBox<TipoTransmision> comboCaja;

    @FXML
    private TextField txtPrecioBase;

    @FXML
    private Button btnGuardar;

    @FXML
    private Label lblMensaje;

    private Empresa empresa;

    public MotoController(Empresa empresa) {
        this.empresa = empresa;
    }

    @FXML
    public void initialize() {
        comboCaja.getItems().addAll(TipoTransmision.values());
        btnGuardar.setOnAction(event -> guardarMoto());
    }

    private void guardarMoto() {
        String numeroMatricula = txtNumeroMatricula.getText();
        String modelo = txtModelo.getText();
        String marca = txtMarca.getText();
        String añoFabricacion = txtAñoFabricacion.getText();
        int diasReserva = Integer.parseInt(txtDiasReserva.getText());
        TipoTransmision tipoTransmision = comboCaja.getValue();
        int precioBase = Integer.parseInt(txtPrecioBase.getText());

        Moto moto = new Moto(numeroMatricula, modelo, marca, añoFabricacion, diasReserva, tipoTransmision, precioBase);
        empresa.getMotos().add(moto);
        limpiarCampos();
    }

    private void limpiarCampos() {
        txtNumeroMatricula.clear();
        txtModelo.clear();
        txtMarca.clear();
        txtAñoFabricacion.clear();
        txtDiasReserva.clear();
        comboCaja.setValue(null);
        txtPrecioBase.clear();
    }
}
