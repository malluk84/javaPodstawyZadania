package ExerciseDay3.Task3;

public class OrderItem {
    private String productName;
    private int quantity;
    private double price;

    public OrderItem(String productName, int quantity, double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public double getAmount(){
        return quantity * price;

    }
    public boolean isCorrect() {
        return price > 0 && quantity > 0;
    }

    public void print(){
        StringBuilder sb = new StringBuilder();
        sb.append(productName).append(" ").append("\t | ")
                .append(price).append(" ").append(" zł").append(" ").append("\t | ")
                .append(" ").append(quantity).append(" ").append(" pcs").append(" ").append("\t | ")
                .append(getAmount()).append(" ").append(" zł");
        System.out.println(sb);
    }
}
