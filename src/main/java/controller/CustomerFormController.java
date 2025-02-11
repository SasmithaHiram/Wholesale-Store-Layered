package controller;

import dto.Customer;
import jakarta.inject.Inject;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import service.ServiceFactory;
import service.custom.CustomerService;
import util.ServiceType;

public class CustomerFormController {

    @FXML
    private TableColumn colAddress;

    @FXML
    private TableColumn colId;

    @FXML
    private TableColumn colName;

    @FXML
    private TableColumn colSalary;

    @FXML
    private TableView tbCustomers;

    @FXML
    private TextField txtAddress;

    @FXML
    private TextField txtID;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtSalary;

    @Inject
    CustomerService service;

    @FXML
    void btnAddCustomerAction(ActionEvent event) {
        String txtIDText = txtID.getText();
        String txtNameText = txtName.getText();
        String txtAddressText = txtAddress.getText();
        double txtSalaryText = Double.parseDouble(txtSalary.getText());

        Customer customer = new Customer(txtIDText, txtNameText, txtAddressText, txtSalaryText);

        service.addCustomer(customer);

    }

    @FXML
    void btnDeleteCustomerAction(ActionEvent event) {

    }

    @FXML
    void btnReloadCustomersAction(ActionEvent event) {

    }

    @FXML
    void btnSearchCustomerAction(ActionEvent event) {

    }

    @FXML
    void btnUpdateCustomerAction(ActionEvent event) {

    }

}
