import org.junit.*;

import java.util.ArrayList;

public class CartTest {

    private Cart cart;
    private Item item;
    private ArrayList<Item> items;

    @Before
    public void initializeCart(){
        //System.out.println("hi");
        cart=new Cart();
    }

    @After
    public void destroy(){
        //System.out.println("bye");
        cart.itemList.clear();
        Cart.totalPrice=0.0;
    }

    @Test
    public void cartEmptyOrNot(){
        Assert.assertEquals("Is Cart Empty or Not?",0,cart.itemList.size());
    }

    @Test
    public void getItemsTest(){
        items=new ArrayList<>();
        item=new Item("Handbag",500,false);
        cart.addItem(item,5);
        items.add(item);
        Assert.assertEquals("Get Items Test",new Item("Handbag",500,false).toString(),cart.getItems().get(0).toString());
        item=new Item("Watch",300,false);
        cart.addItem(item,5);
        items.add(item);
        Assert.assertEquals("Get Items Test 2",items.toString(),cart.getItems().toString());
    }

    @Test
    public void addItemTest(){
        cart.addItem(new Item("Handbag",500,false),5);
        cart.addItem(new Item("Watch",300,false),6);
        Assert.assertTrue(4300.0==Cart.totalPrice);
    }

    @Test
    public void itemQuantitiesTest(){

    }

}
