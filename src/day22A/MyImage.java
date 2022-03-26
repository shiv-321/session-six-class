package day22A;

import java.io.IOException;

public class MyImage {
    public String downloadImage(String url) throws IOException {
        //Image download and save
        // to throw exception
        throw new IOException("No memory available");
//        return "Image downloaded successfully";
    }
    public String getImageUrl() throws RuntimeException{
        throw new IndexOutOfBoundsException("Index out of bound");
//        return "http://facebook.com/shivaraj/1000111100";
    }
}
