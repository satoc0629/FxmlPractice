package practice.infrastructure;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@RequiredArgsConstructor
public class MySpringFXMLLoader {

    private final ApplicationContext context;

    public Parent load(String path) throws IOException {
        FXMLLoader loader = new FXMLLoader(); // ★オリジナルの FXMLLoader を生成

        loader.setControllerFactory(this.context::getBean); // ★ControllerFactory に ApplicationContext を利用する

        return loader.load(MySpringFXMLLoader.class.getClassLoader().getResourceAsStream(path));
    }
}
