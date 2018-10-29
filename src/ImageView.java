public class ImageView extends View  {

    //Serves as a Concrete Product by extending the Product class, View

    //attributes
    String source;

    //Parameterized constructor
    ImageView(String source){
        super();
        this.source = source;
    }

    //overriding the methods declared in View class.
    @Override
    public void displayMedia(){
        //to display the image view.
        System.out.println("Source : " + source + "Filter : " + filter + " width: " + width + " height: " + height );
    }

    @Override
    public void setContentForMedia(String content){
        //to set the content for the image view.
        this.source = content;
    }
}
