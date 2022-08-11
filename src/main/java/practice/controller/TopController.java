package practice.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import lombok.extern.slf4j.Slf4j;
import practice.dto.Customer;

@Slf4j
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
