import org.junit.*;

public class CartTest {

    private Cart cart=new Cart();

    @Before
    @Test
    public void cartEmptyOrNot(){
        Assert.assertEquals("Is Cart Empty or Not?",0,cart.itemList.size());
    }

    @After
    public void destroy(){
        cart.itemList.clear();
        Cart.totalPrice=0.0;
    }
    @Test
    public void getItemsTest(){
        cart.addItem(new Item("Handbag",500,false),5);
        Assert.assertEquals("Get Items Test",new Item("Handbag",500,false).toString(),cart.getItems().get(0).toString());
        cart.addItem(new Item("Watch",300,false),5);
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
