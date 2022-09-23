public class Main {
    public static void main(String[] args) {
        Product firstProduct= new Product(20, new StringBuilder("Milk"));
        Product secondProduct= new Product(30,new StringBuilder("Candy"));
        firstProduct.switchPrices(secondProduct);
        System.out.println(firstProduct.getPrice());
    }
}
