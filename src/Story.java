public interface Story {

    //The Creator which declares the factory method returning an object of type View.

    int duration = 30;

    public View save();
    public void publish();
    public void remove();

    //factory method
    public View createViewForStory(String typeOfView,String content);

}
