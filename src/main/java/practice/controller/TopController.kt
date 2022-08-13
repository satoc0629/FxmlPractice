package practice.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import practice.dto.Customer;

@Slf4j
@Component
@Scope(scopeName = BeanDefinition.SCOPE_PROTOTYPE)
public class TopController {
    @FXML
    TableView<Customer> sampleTable;

    public void refresh(ActionEvent actionEvent) {
        log.info("refresh called.");
        sampleTable.getItems().add(new Customer("山田", "太郎"));
    }

    public void append(Customer customer) {
        sampleTable.getItems().add(customer);

    }
}
