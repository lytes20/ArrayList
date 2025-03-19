# **Custom ArrayList Implementation in Java** 🚀

## **Overview**

This repository contains a **custom implementation of an ArrayList** in Java, called `OrderList`. Unlike Java's built-in `ArrayList`, this implementation gives you a deep understanding of how dynamic arrays work under the hood. It includes features like adding, inserting, and removing elements while handling array resizing dynamically.

## **Features**

✅ **Dynamic resizing** – Automatically expands when full.  
✅ **Efficient add and remove methods** – Supports element insertion and deletion.  
✅ **Custom order management** – Works with an `Order` class that represents sales transactions.  
✅ **Memory optimization** – Prevents memory leaks by properly managing array elements.

## **Project Structure**

```
📂 CustomArrayList
│── 📄 Order.java        # Represents an order with ID, salesperson, and items
│── 📄 OrderList.java    # Custom implementation of an ArrayList
│── 📄 Test.java         # Test cases and demonstration
│── 📄 README.md         # Project documentation
```

## **Getting Started**

### **Prerequisites**

- Java 8 or later
- A Java IDE (e.g., IntelliJ IDEA, Eclipse, or VS Code)

### **Installation & Running the Code**

1. Clone the repository:
   ```sh
   git clone https://github.com/lytes20/ArrayList.git
   ```
2. Navigate into the project folder:
   ```sh
   cd ArrayList
   ```
3. Compile the Java files:
   ```sh
   javac *.java
   ```
4. Run the main program:
   ```sh
   java Test
   ```

## **Usage**

### **1. Creating Orders**

```java
Order order1 = new Order(1, "Gideon", new String[]{"Laptop", "Mouse"});
Order order2 = new Order(2, "Seleman", new String[]{"Keyboard", "Monitor"});
```

### **2. Adding Orders to the List**

```java
OrderList orderList = new OrderList();
orderList.add(order1);
orderList.add(order2);
```

### **3. Getting an Order from the List**

```java
orderList.get(0);
orderList.get(1);
```

### **4. Inserting an Order at a Specific Index**

```java
Order order3 = new Order(3, "Charlie", new String[]{"Headphones"});
orderList.insert(order3, 1);
```

### **5. Removing an Order**

```java
orderList.remove(order2);
```

## **Time Complexity Analysis** ⏳

| Operation                 | Time Complexity |
| ------------------------- | --------------- |
| **Adding** at the end     | **O(1)**        |
| **Get** at an index       | **O(1)**        |
| **Inserting** at an index | **O(n)**        |
| **Removing** an element   | **O(n)**        |

## **Contributing**

Contributions are welcome! If you have improvements, feel free to fork this repository and create a pull request.

📌 **Happy Coding! 🚀**
