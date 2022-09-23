public class Product {

    private int price;
    private StringBuilder name;

    public void setName(StringBuilder name) {
        this.name = name;
    }

    public StringBuilder getName() {
        return name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
    public Product(int price, StringBuilder name){
        setName(name);
        setPrice(price);
    }

    void switchPrices(Product otherProduct){
        Product temp= new Product(12, new StringBuilder("defef"));
        temp.setPrice(this.getPrice());
        this.setPrice(otherProduct.getPrice());
        otherProduct.setPrice(temp.getPrice());
    }
}
