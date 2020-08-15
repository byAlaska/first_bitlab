package bitlab.askar.Module2.Lesson3;

import java.awt.*;

public class Post {
    String text;
    Image image;


    public Post(String text, Image image) {
        this.text = text;
        this.image = image;
    }


    @Override
    public String toString() {
        return "Post{" +
                "text='" + text + '\'' +
                ", image=" + image +
                '}';
    }
}
