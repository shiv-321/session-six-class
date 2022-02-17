package day3;

import java.util.List;

public class Item {
    private List<String> image;
    private String name;
    private float price;
    private boolean isDiscounted;
    private int discountPercentage;
    private List<Review> ratings;
    private List<ItemDescription> description;
    private String promotionImage;
    private Specification specification;

    public List<String> getImage() {
        return image;
    }

    public void setImage(List<String> image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isDiscounted() {
        return isDiscounted;
    }

    public void setDiscounted(boolean discounted) {
        isDiscounted = discounted;
    }

    public int getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(int discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public List<Review> getRatings() {
        return ratings;
    }

    public void setRatings(List<Review> ratings) {
        this.ratings = ratings;
    }

    public List<ItemDescription> getDescription() {
        return description;
    }

    public void setDescription(List<ItemDescription> description) {
        this.description = description;
    }

    public String getPromotionImage() {
        return promotionImage;
    }

    public void setPromotionImage(String promotionImage) {
        this.promotionImage = promotionImage;
    }

    public Specification getSpecification() {
        return specification;
    }

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }
}
