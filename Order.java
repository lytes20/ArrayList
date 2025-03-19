import java.util.Arrays;

public class Order {
    private int Id;
    private String salesPerson;
    public String[] items;

    public Order(int Id, String salesPerson, String[] items) {
        this.Id = Id;
        this.salesPerson = salesPerson;
        this.items = items;
    }

    public int getId() {
        return this.Id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (this == obj)
            return true;
        if (getClass() != obj.getClass())
            return false;
        Order order = (Order) obj;
        return order.getId() == this.Id;
    }

    @Override
    public String toString() {
        return "{" + "Id:" + Id + " Salesperson:" + salesPerson + " " + "Items ->" + Arrays.toString(items) + "}";
    }
}
