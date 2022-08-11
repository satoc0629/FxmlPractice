package practice;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import practice.controller.TopController;
import practice.dto.Customer;

import java.io.IOException;
import java.util.List;
import java.util.Objects;

// --module-path $Classpath$ --add-modules javafx.controls,javafx.fxml
// --module-path ./lib --add-modules javafx.controls,javafx.fxml
@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        Application.launch(FXMain.class);
    }

}