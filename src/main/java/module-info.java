module project.sudokuproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens project.sudokuproject to javafx.fxml;
    exports project.sudokuproject;
}