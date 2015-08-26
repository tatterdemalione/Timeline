package Timeline;

import java.awt.image.BufferedImage;

public class Event {
    private String year;
    private String title;
    private String info;
    private BufferedImage img;
    private int index;
    
    
    public Event(String year, String title, String text, BufferedImage img, int index){
        this.year=year;
        this.title=title;
        this.info=text;
        this.img = img;
        this.index = index;
        
        
    }
    
    /* GET METHODS */
    public String getYear(){
       return year; 
    }
    public String getTitle(){
        return title;
    }
    public String getInfo(){
        return info;
    }
    public BufferedImage getImage(){
        return img;
    }
    
    public void setYear(String year){
        this.year = year;
    }
    
    public void setIndex(int index){
        this.index = index;
    }
    
    public void setTitle(String title){
        this.title = title;
    }
    
    public void setInfo(String info){
        this.info=info;
    }
    public void setImage(BufferedImage img){
        this.img = img;
    }
}
