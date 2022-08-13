package practice.infrastructure

import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.util.Callback
import lombok.RequiredArgsConstructor
import org.springframework.context.ApplicationContext
import org.springframework.stereotype.Component
import java.io.IOException

@Component
class MySpringFXMLLoader constructor(private val context: ApplicationContext) {

    @Throws(IOException::class)
    fun load(path: String?): Parent {
        val loader = FXMLLoader() // ★オリジナルの FXMLLoader を生成
        loader.controllerFactory = Callback { requiredType: Class<*>? ->
            context!!.getBean(requiredType)
        } // ★ControllerFactory に ApplicationContext を利用する
        return loader.load(
                MySpringFXMLLoader::class.java
                        .classLoader.getResourceAsStream(path))
    }
}