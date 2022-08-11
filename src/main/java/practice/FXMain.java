package practice;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ConfigurableApplicationContext;
import practice.infrastructure.MySpringFXMLLoader;

import java.io.IOException;
import java.util.Objects;

public class FXMain extends Application {
    private ConfigurableApplicationContext applicationContext;

    @Override
    public void init() throws Exception {
        super.init();
        applicationContext = new SpringApplicationBuilder(Main.class).run();
    }

    @Override
    public void start(Stage stage) throws IOException {
        MySpringFXMLLoader fxloader = applicationContext.getBean(MySpringFXMLLoader.class);

        Parent root = fxloader.load("Top.fxml");

        Scene scene = new Scene(root, 800, 1200);

        stage.setTitle("FXML Welcome");
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void stop() throws Exception {
        super.stop();
        applicationContext.close();
        Platform.exit();
    }

}
