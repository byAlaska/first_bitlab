package bitlab.askar.Module2.Lesson3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        ArrayList<Post> posts = new ArrayList<>();

        posts.add(new Post("Askar", null));
        posts.add(new Post("Pidor", null));
        posts.add(new Post("NE", null));
        posts.add(new Post("Pidoe", null));
        posts.add(new Post("Wassssabiii", null));


        for(Post p:posts){
            System.out.println(p.toString());
        }
    }
}
