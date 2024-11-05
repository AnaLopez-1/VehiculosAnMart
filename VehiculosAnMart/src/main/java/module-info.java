module co.edu.uniquindio.poo {
    requires javafx.controls;
    requires javafx.fxml;

    opens co.edu.uniquindio.poo to javafx.fxml; // Permitir que JavaFX acceda a este paquete
    opens co.edu.uniquindio.poo.model to javafx.base; // Agregar esta línea para abrir el paquete model
    exports co.edu.uniquindio.poo; // Exportar el paquete principal
    exports co.edu.uniquindio.poo.viewController; // Exportar el paquete de controladores de vista
    opens co.edu.uniquindio.poo.viewController to javafx.fxml; // Permitir que JavaFX acceda a este paquete
}
