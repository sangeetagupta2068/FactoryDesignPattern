public class TextView extends View {

    //Serves as a Concrete Product by extending the Product class, View

    //attributes
    String text, textColor, textType;

    //Parameterized Constructor
    TextView(String text) {
        super();
        this.text = text;
        textColor = "black";
        textType = "Classic";
    }


    public void setTextColor(String textColor) {
        //to set the text color.
        this.textColor = textColor;
    }

    public void setText(String text) {
        //to set the text content.
        this.text = text;
    }

    public void setTextType(String textType) {
        //to set the text type.
        this.textType = textType;
    }

    //overriding the methods declared in View class.
    @Override
    public void displayMedia() {
        //to display the text view.
        System.out.println("Text: " + text + "Text Color: " + textColor + " Text Type: " + textType + "Filter : " + filter + " width: " + width + " height: " + height);
    }

    @Override
    public void setContentForMedia(String content) {
        //to set the content for the text view.
        this.text = content;
    }
}
