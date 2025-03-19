import java.util.Arrays;

public class OrderList {
    private static final int INITIAL_CAPACITY = 10;
    private Order[] orders;
    private int size;

    public OrderList() {
        this.orders = new Order[INITIAL_CAPACITY];
        this.size = 0;
    }

    public boolean add(Order order) {
        if (order == null)
            return false;
        if (size == orders.length)
            resize();
        orders[size] = order;
        size = size + 1;
        return true;
    }

    public boolean insert(Order order, int pos) {
        if (order == null) // validating the order, you can do more order validations
            return false;
        if (pos < 0 || pos > size) // validating the index, you can do some more index validations here
            return false;
        if (size == orders.length) { // resize array just incase you need some more space
            resize();
        }
        Order[] temp = new Order[orders.length]; // create a temp array
        for (int i = 0; i < pos; i++) {
            temp[i] = orders[i];
        }
        temp[pos] = order;
        for (int i = pos + 1; i < orders.length; i++) {
            temp[i] = orders[i - 1];
        }
        orders = temp;
        size++;
        return true;
    }

    public boolean remove(Order order) {
        if (order == null)
            return false;
        int index = -1;
        for (int i = 0; i < size; ++i) {
            if (orders[i].equals(order)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            return false; // Order not found
        }

        // Shift elements left to overwrite the removed order
        for (int i = index; i < size - 1; i++) {
            orders[i] = orders[i + 1];
        }

        // Prevent memory leak by setting last element to null
        orders[size - 1] = null;

        size--;
        return true;
    }

    public void resize() {
        int newLen = orders.length * 2;
        orders = Arrays.copyOf(orders, newLen);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size - 1; ++i) {
            sb.append(orders[i] + ", ");
        }
        sb.append(orders[size - 1] + "]");
        return sb.toString();
    }

}
