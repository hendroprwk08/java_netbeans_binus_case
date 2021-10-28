package binuscase;

public class Payment {
    String name, type, sugar;
    int qty;

    public Payment(String name, String type, String sugar, int qty ) {
        this.name = name;
        this.type = type;
        this.sugar = sugar;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getQty() {
        return qty;
    }

    public String getSugar() {
        return sugar;
    }
}
