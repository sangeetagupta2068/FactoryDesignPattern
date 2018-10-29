public class InstagramStory implements Story {

    //The ConcreteCreator class which overrides the methods declared in the Creator class (Story).
    String viewGroup;
    View view;

    InstagramStory(){
        viewGroup = "public";
    }

    public void setViewGroup(String viewGroup){
        this.viewGroup = viewGroup;
    }

    public View save(){
        //to save the content of the Story, which is of type View.
        System.out.println("Your story has been saved in gallery!");
        return view;
    }

    public void publish(){
        //to share the story content with the world.
        System.out.println("Your story has been published!");
    }

    public void remove(){
        //to remove the story content.
        view = null;
        System.out.println("Your story has been removed!");
    }

    @Override
    public View createViewForStory(String typeOfView, String content){


        //Factory method for instantiating an object which is of type View based on
        // the type of view to be created and its content.
        View view ;
        typeOfView = typeOfView.trim().toLowerCase();

        if(typeOfView.equals("image")){
            view = new ImageView(content);
        } else {
            if(typeOfView.equals("video")){
                view = new VideoView(content);
            }
            else if(typeOfView.equals("text")){
                view = new TextView(content);
            } else {
                view = null;
            }
        }

        return view;
    }
}
