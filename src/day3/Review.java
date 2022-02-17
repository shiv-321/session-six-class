package day3;

import java.util.Date;
import java.util.List;

public class Review {
    private float rating;
    private Customer user;
    private boolean isVerifiedPurchased;
    private String reviewDescription;
    private List<String> images;
//    private long likesCount;
    private Date reviewDate;
    private String responseFromStore;
//    private long responseLikeCount;
    private Date responseDate;

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public Customer getUser() {
        return user;
    }

    public void setUser(Customer user) {
        this.user = user;
    }

    public boolean isVerifiedPurchased() {
        return isVerifiedPurchased;
    }

    public void setVerifiedPurchased(boolean verifiedPurchased) {
        isVerifiedPurchased = verifiedPurchased;
    }

    public String getReviewDescription() {
        return reviewDescription;
    }

    public void setReviewDescription(String reviewDescription) {
        this.reviewDescription = reviewDescription;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

//    public long getLikesCount() {
//        return likesCount;
//    }
//
//    public void setLikesCount(long likesCount) {
//        this.likesCount = likesCount;
//    }

    public Date getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(Date reviewDate) {
        this.reviewDate = reviewDate;
    }

    public String getResponseFromStore() {
        return responseFromStore;
    }

    public void setResponseFromStore(String responseFromStore) {
        this.responseFromStore = responseFromStore;
    }

//    public long getResponseLikeCount() {
//        return responseLikeCount;
//    }

    public Date getResponseDate() {
        return responseDate;
    }

    public void setResponseDate(Date responseDate) {
        this.responseDate = responseDate;
    }

//    public void setResponseLikeCount(long responseLikeCount) {
//        this.responseLikeCount = responseLikeCount;
//
//
//    }
}
