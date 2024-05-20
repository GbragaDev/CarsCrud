module com.example.aulasjava {
  requires javafx.controls;
  requires javafx.fxml;


  opens com.example.aulasjava to javafx.fxml;
  exports com.example.aulasjava;
}
