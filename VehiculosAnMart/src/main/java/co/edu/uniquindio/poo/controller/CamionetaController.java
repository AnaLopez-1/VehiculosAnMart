package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.model.Camioneta;
import co.edu.uniquindio.poo.model.Empresa;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CamionetaController {

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
    private TextField txtCapacidadCarga;

    @FXML
    private TextField txtPrecioBase;

    @FXML
    private Button btnGuardar;

    @FXML
    private Label lblMensaje;

    private Empresa empresa;

    public CamionetaController(Empresa empresa) {
        this.empresa = empresa;
    }

    @FXML
    public void initialize() {
        btnGuardar.setOnAction(event -> guardarCamioneta());
    }

    private void guardarCamioneta() {
        String numeroMatricula = txtNumeroMatricula.getText();
        String modelo = txtModelo.getText();
        String marca = txtMarca.getText();
        String añoFabricacion = txtAñoFabricacion.getText();
        int diasReserva = Integer.parseInt(txtDiasReserva.getText());
        double capacidadCarga = Double.parseDouble(txtCapacidadCarga.getText());
        int precioBase = Integer.parseInt(txtPrecioBase.getText());

        Camioneta camioneta = new Camioneta(numeroMatricula, modelo, marca, añoFabricacion, diasReserva, capacidadCarga, precioBase);
        empresa.getCamionetas().add(camioneta);
        limpiarCampos();
    }

    private void limpiarCampos() {
        txtNumeroMatricula.clear();
        txtModelo.clear();
        txtMarca.clear();
        txtAñoFabricacion.clear();
        txtDiasReserva.clear();
        txtCapacidadCarga.clear();
        txtPrecioBase.clear();
    }
}
