import java.util.ArrayList;

public class Cart {

    ArrayList<Item> itemList=new ArrayList<Item>();
    static double totalPrice;

    ArrayList<Item> getItems(){
        return itemList;
    }

    void addItem(Item item, int quantity){
        itemList.add(item);
        totalPrice+=quantity*item.getPrice();
    }

    public ArrayList<String> itemizedList(){
        return null;
    }

    public ArrayList<String> itemQuantities(){
        return null;
    }

    public ArrayList<String> onSaleItems(){
        return null;
    }

}
