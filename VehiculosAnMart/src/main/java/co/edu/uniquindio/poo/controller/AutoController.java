package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.model.Auto;
import co.edu.uniquindio.poo.model.Empresa;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AutoController {

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
    private TextField txtNumeroPuertas;

    @FXML
    private TextField txtPrecioBase;

    @FXML
    private Button btnGuardar;

    @FXML
    private Label lblMensaje;

    private Empresa empresa;

    public AutoController(Empresa empresa) {
        this.empresa = empresa;
    }

    @FXML
    public void initialize() {
        btnGuardar.setOnAction(event -> guardarAuto());
    }

    private void guardarAuto() {
        String numeroMatricula = txtNumeroMatricula.getText();
        String modelo = txtModelo.getText();
        String marca = txtMarca.getText();
        String añoFabricacion = txtAñoFabricacion.getText();
        int diasReserva = Integer.parseInt(txtDiasReserva.getText());
        int numeroPuertas = Integer.parseInt(txtNumeroPuertas.getText());
        int precioBase = Integer.parseInt(txtPrecioBase.getText());

        Auto auto = new Auto("123", "2022", "Ford", "2015", 5, 4, 50000);
        empresa.getAutos().add(auto);
        limpiarCampos();
    }

    private void limpiarCampos() {
        txtNumeroMatricula.clear();
        txtModelo.clear();
        txtMarca.clear();
        txtAñoFabricacion.clear();
        txtDiasReserva.clear();
        txtNumeroPuertas.clear();
        txtPrecioBase.clear();
    }
}
