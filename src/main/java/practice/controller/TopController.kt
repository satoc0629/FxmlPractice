package practice.controller

import javafx.event.ActionEvent
import javafx.fxml.FXML
import javafx.scene.control.TableView
import org.springframework.beans.factory.config.BeanDefinition
import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Component
import practice.dto.Customer
import practice.logger.log

@Component
@Scope(scopeName = BeanDefinition.SCOPE_PROTOTYPE)
class TopController {
    @FXML
    var sampleTable: TableView<Customer>? = null
    fun refresh(actionEvent: ActionEvent?) {
        log.info("refresh called.")

        sampleTable!!.items.add(Customer("山田", "太郎"))
    }

    fun append(customer: Customer) {
        sampleTable!!.items.add(customer)
    }
}