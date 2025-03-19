public class Test {
    public static void main(String[] args) {
        OrderList orders = new OrderList();
        orders.add(new Order(1, "Gideon", new String[] { "Popcorn" }));
        orders.add(new Order(2, "Seleman", new String[] { "Chocolates" }));
        System.out.println(orders);
    }

}
