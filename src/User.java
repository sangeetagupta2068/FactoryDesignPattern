import java.util.Scanner;

public class User {

    /*@created on: 10th September 2018
     *@author: Sangeeta Gupta, Abdul Hussain, Amay Verma
     *@objective: In the Instagram Application, at any given point of time, a user can create either an Image, Video or Text as his/her story
     *            and share it with the world.We have tried to explain the Factory Design Pattern from this case study.
     */

    //attributes
    String userName, password;
    InstagramStory instagramStory;

    //Parameterized Constructor
    User(String userName, String password) {
        this.userName = userName;
        this.password = password;
        instagramStory = new InstagramStory();
    }


    public void setUserName(String userName) {
        //to set the username
        this.userName = userName;
    }

    public void setPassword(String password) {
        //to set the password
        this.password = password;
    }

    public void setInstagramStory(String typeOfView, String source) {
        //to set the Instagram story for the user
        this.instagramStory = new InstagramStory();
        this.instagramStory.view = this.instagramStory.createViewForStory(typeOfView, source);
    }

    public static void main(String... args) {
        String userName, password, answer;

        Scanner scanner = new Scanner(System.in);

        //to accept the username and password from user for logging in
        System.out.println("Enter username:");
        userName = scanner.next();
        System.out.println("Enter password:");
        password = scanner.next();

        User userOne = new User(userName, password);

        System.out.println("You are now logged in!");

        //to take an input from the user whether s/he wants to share a story.
        System.out.println("Share your story with the world?(yes/no)");
        answer = scanner.next();

        String choiceOfView = "", content = "";
        View localGalleryView;

        while (answer.compareToIgnoreCase("yes") == 0) {

            //to take an input from user for what type of story s/he would like to share.
            System.out.println("Choose the type of your story :Image,Text,Video");
            choiceOfView = scanner.next();

            //to take an input from the user providing the content for the story
            System.out.println("Provide the content for your story :");
            content = scanner.next();

            //creating the story
            userOne.instagramStory.view = userOne.instagramStory.createViewForStory(choiceOfView, content);
            //publishing the story
            userOne.instagramStory.publish();
            //displaying the contents of the story
            userOne.instagramStory.view.displayMedia();

            //saving the instagram story content in the local gallery of the user
            localGalleryView = userOne.instagramStory.save();

            //removing the story
            userOne.instagramStory.remove();


            //to displaying the contents of the story saved in user's gallery
            System.out.println("Details of story saved in gallery :");
            localGalleryView.displayMedia();

            //to take an input from the user whether s/he wants to share another story.
            System.out.println("Do you want to post another story? (yes/no)");
            answer = scanner.next();

        }

        System.out.println("Thank you!");
        System.out.println("Logged out!");
        scanner.close();
    }

}
