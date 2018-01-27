/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c482.project.Models;

/**
 *
 * @author josiahbrower
 */
public class Product {
    /// Properties.
    private int productId;
    private String productName;
    private int inventoryLevel;
    private double pricePerUnit;
    
    /// Constructors.
    /**
     * Create a new Product instance.
     * @param productId - The ID of the product.
     * @param productName - The name of the product.
     * @param inventoryLevel - The inventory level for the product.
     * @param pricePerUnit - The price per-unit for the product.
     */
    public Product(int productId, String productName, int inventoryLevel, double pricePerUnit) {
        this.productId = productId;
        this.productName = productName;
        this.inventoryLevel = inventoryLevel;
        this.pricePerUnit = pricePerUnit;
    }
    
    /// Getter/Setters.
    
    public int getProductId() {
        return this.productId;
    }
    public void setProductId(int productId) {
        this.productId = productId;
    }
    
    public String getProductName() {
        return this.productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    
    public int getInventoryLevel() {
        return this.inventoryLevel;
    }
    public void setInventoryLevel(int inventoryLevel) {
        this.inventoryLevel = inventoryLevel;
    }
    
    public String getPricePerUnit() {
        return "$" + String.format("%10.2f", this.pricePerUnit);
    }
    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }
}
