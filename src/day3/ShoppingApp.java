package day3;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShoppingApp {
    public static void main(String[] args) {
        Item fishOil = new Item();
        fishOil.setName("Natural fishOil");

        List<String> images = new ArrayList<>();
        images.add("https://www.industrialempathy.com/posts/image-optimizations/");
        images.add("https://www.industrialempathy.com/posts/image-optimizations/");
        images.add("https://www.industrialempathy.com/posts/image-optimizations/");

        fishOil.setImage(images);

        fishOil.setPrice(2400);
        fishOil.setDiscounted(true);
        fishOil.setDiscountPercentage(20);

        fishOil.setPromotionImage("https://developer.mozilla.org/en-US/docs/Web/HTML/Element/img");

        // Description start
        List<ItemDescription> itemDescriptions = new ArrayList<>();

        ItemDescription description1 = new ItemDescription();
        description1. setDescription("this is nice product. ");
        itemDescriptions.add(description1);

        ItemDescription description2 = new ItemDescription();
        description2. setDescription("this is wonderful product. ");
        itemDescriptions.add(description2);

        ItemDescription description3 = new ItemDescription();
        description3. setDescription("this is awesome product. ");
        itemDescriptions.add(description3);
        // Description end

        fishOil.setDescription(itemDescriptions);

        List<Review> reviews = new ArrayList<>();

        Review review1 = new Review();
        review1.setRating(5);

        Customer customer1 = new Customer();
        customer1.setUserName("Bob");
        review1.setUser(customer1);

        review1.setVerifiedPurchased(true);
        review1.setReviewDescription("This is a good product. ");

        List<String> reviewImages = new ArrayList<>();

        reviewImages.add("https://www.planetware.com/pictures/france-f.htm");
        reviewImages.add("https://www.planetware.com/world/most-beautiful-islands-in-the-world-sey-1-2.htm");

        review1.setImages(reviewImages);

        review1.setReviewDate(new Date("2/16/2022"));

        review1.setResponseFromStore("Thank you for buying our product");

        review1.setResponseDate(new Date("2/17/2022"));

        fishOil.setRatings(reviews);

        Specification specification = new Specification();
        specification.setBrand("Nature's care");
        specification.setFlavour("Not specified");
        specification.setSku("1111NP22222");
        specification.setInsideBox("Capsules");

        fishOil.setSpecification(specification);

















    }

}
