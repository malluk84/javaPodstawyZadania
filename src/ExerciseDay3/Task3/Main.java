package ExerciseDay3.Task3;

public class Main {
    public static void main(String[] args) {
        OrderItem orderItem1 = new OrderItem("cukier", 1, 3.5);
        OrderItem orderItem2 = new OrderItem("mąka", 2, 4);
        OrderItem orderItem3 = new OrderItem("chleb", 3, 4);
        OrderItem orderItem4 = new OrderItem("jaja", 4, 4);
        OrderItem orderItem5 = new OrderItem("Mleko", 5, 4);
        OrderItem orderItem6 = new OrderItem("mleko", -5, 4);

        Order order = new Order(6);
        order.addItem(orderItem1);
        order.addItem(orderItem2);
        order.addItem(orderItem3);
        order.addItem(orderItem4);
        order.addItem(orderItem5);
        order.addItem(orderItem6);

        order.print();
    }
}
