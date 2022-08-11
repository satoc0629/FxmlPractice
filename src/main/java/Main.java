import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import practice.controller.TopController;
import practice.dto.Customer;

import java.io.IOException;
import java.util.List;
import java.util.Objects;

// --module-path $Classpath$ --add-modules javafx.controls,javafx.fxml
// --module-path ./lib --add-modules javafx.controls,javafx.fxml
public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(
                Objects.requireNonNull(getClass().getResource("Top.fxml")));

        Scene scene = new Scene(root, 800, 1200);

        stage.setTitle("FXML Welcome");
        stage.setScene(scene);
        stage.show();
    }
}
