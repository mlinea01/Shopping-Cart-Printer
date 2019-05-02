

public class ItemToPurchase {
    private String itemName;
    private int itemPrice;
    private int itemQuantity;
    
    public ItemToPurchase()
    {
        itemName = "none";
        itemPrice = 0;
        itemQuantity = 0;
    }
    
    public void setName(String itmName)
    {
        itemName = itmName;
    }
    
    public void setPrice(int itmPrice)
    {
        itemPrice = itmPrice;
    }
    
    public void setQuantity(int itmQuantity)
    {
        itemQuantity = itmQuantity;
    }
    
    public String getName()
    {
        return itemName;
    }
    
    public int getPrice()
    {
        return itemPrice;
    }
    
    public int getQuantity()
    {
        return itemQuantity;
    }
    
    
    
}
