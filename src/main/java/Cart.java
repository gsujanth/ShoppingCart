import java.util.ArrayList;

public class Cart {

    ArrayList<Item> itemList=new ArrayList<Item>();
    ArrayList<String> itemQuants=new ArrayList<>();
    static double totalPrice;

    ArrayList<Item> getItems(){
        return itemList;
    }

    void addItem(Item item, int quantity){
        itemList.add(item);
        totalPrice+=quantity*item.getPrice();
        String itemQuant=String.format("%s%d",item.getName()+" - x",quantity);
        itemQuants.add(itemQuant);
    }

    public ArrayList<String> itemizedList(){
        return null;
    }

    public ArrayList<String> itemQuantities(){
        return itemQuants;
    }

    public ArrayList<String> onSaleItems(){
        return null;
    }

}
