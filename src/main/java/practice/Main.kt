package practice

import javafx.application.Application
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

// --module-path $Classpath$ --add-modules javafx.controls,javafx.fxml
// --module-path ./lib --add-modules javafx.controls,javafx.fxml
@SpringBootApplication
open class Main

fun main(args: Array<String>) {
    Application.launch(FXMain::class.java, *args)
}
