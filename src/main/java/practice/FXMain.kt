package practice

import javafx.application.Application
import javafx.application.Platform
import javafx.scene.Scene
import javafx.stage.Stage
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.context.ConfigurableApplicationContext
import practice.infrastructure.MySpringFXMLLoader
import java.io.IOException

class FXMain : Application() {
    private var applicationContext: ConfigurableApplicationContext? = null
    @Throws(Exception::class)
    override fun init() {
        super.init()
        applicationContext = SpringApplicationBuilder(Main::class.java).run()
    }

    @Throws(IOException::class)
    override fun start(stage: Stage) {
        val fxloader = applicationContext!!.getBean(MySpringFXMLLoader::class.java)
        val root = fxloader.load("Top.fxml")
        val scene = Scene(root, 800.0, 1200.0)
        stage.title = "FXML Welcome"
        stage.scene = scene
        stage.show()
    }

    @Throws(Exception::class)
    override fun stop() {
        super.stop()
        applicationContext!!.close()
        Platform.exit()
    }
}