public class VideoView extends View {

    //Serves as a Concrete Product by extending the Product class, View

    //attributes
    String source,trimLength;

    //Parameterized constructor
    VideoView(String source){
        super();
        this.source = source;
        trimLength = "0 - 0:30";
    }

    public void setTrimLength(int startPoint){
        //to set the trim length for the video view
        trimLength = startPoint + " - " + Integer.toString(startPoint + 30);
    }

    //overriding the methods declared in View class.
    @Override
    public void displayMedia(){
        //to display the video view
        System.out.println("Source : " + source + "Duration: " + trimLength + "Filter : " + filter + " width: " + width + " height: " + height );
    }

    @Override
    public void setContentForMedia(String content){
        //to set the contents for the video view
        this.source = content;
    }


}
