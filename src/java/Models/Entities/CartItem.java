/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.Entities;

/**
 *
 * @author havan
 */
public class CartItem {
    private String itemId;
    private String itemName;
    private int quantity;
    private double unitPrice;

    public CartItem() {
    }

    public CartItem(String itemId, String itemName, int quantity, double untiPrice) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.unitPrice = untiPrice;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double untiPrice) {
        this.unitPrice = untiPrice;
    }
    public double getSubTotal(){
        return quantity*unitPrice;
    }
    
}
