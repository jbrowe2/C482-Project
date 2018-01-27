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
public class Part {
    /// Properties.
    private int partId;
    private String partName;
    private int inventoryLevel;
    private double pricePerUnit;
    
    /// Constructors.
    /**
     * Create a new Part instance.
     * @param partId - The ID of the part.
     * @param partName - The name of the part.
     * @param inventoryLevel - The inventory level for the part.
     * @param pricePerUnit - The price per-unit for the part.
     */
    public Part(int partId, String partName, int inventoryLevel, double pricePerUnit) {
        this.partId = partId;
        this.partName = partName;
        this.inventoryLevel = inventoryLevel;
        this.pricePerUnit = pricePerUnit;
    }
    
    /// Getter/Setters.
    
    public int getPartId() {
        return this.partId;
    }
    public void setPartId(int partId) {
        this.partId = partId;
    }
    
    public String getPartName() {
        return this.partName;
    }
    public void setPartName(String partName) {
        this.partName = partName;
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
