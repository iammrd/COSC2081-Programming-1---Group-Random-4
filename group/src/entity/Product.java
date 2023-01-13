package entity;

public class Product {
    private int id;
    private String title;
    private float price;
    private String category;

    public Product (int id, String title, float price, String category){
        this.id = id;
        this.title = title;
        this.price = price;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public float getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}
