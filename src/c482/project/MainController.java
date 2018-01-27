/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c482.project;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import c482.project.Models.*;

/**
 *
 * @author josiahbrower
 */
public class MainController implements Initializable {
    
    @FXML
    private TableView<Part> parts;
    
    @FXML
    private TableView<Product> products;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        parts.getItems().addAll(
                new Part(1, "Part 1", 5, 5.00), 
                new Part(2, "Part 2", 10, 10.58), 
                new Part(3, "Part 3", 15, 12.3));
        products.getItems().addAll(
                new Product(1, "Product 1", 5, 5.00), 
                new Product(2, "Product 2", 10, 10.58), 
                new Product(3, "Product 3", 15, 12.3));
    }    
    
}
