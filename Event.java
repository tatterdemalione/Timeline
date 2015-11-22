/*********************************************************************************************************************************************************************
  *  This file is part of Timeline.
  *
  *  Timeline is free software: you can redistribute it and/or modify
  *  it under the terms of the GNU General Public License as published by
  *  the Free Software Foundation, either version 3 of the License, or
  *  (at your option) any later version.
  *
  *  Timeline is distributed in the hope that it will be useful,
  *  but WITHOUT ANY WARRANTY; without even the implied warranty of
  *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  *  GNU General Public License for more details.
  *
  *  You should have received a copy of the GNU General Public License
  *  along with Timeline.  If not, see <http://www.gnu.org/licenses/>.
  **********************************************************************************************************************************************************************/



package timeline2;

import java.awt.image.BufferedImage;

public class Event {
    
    private String title;
    private String info;
    private BufferedImage img;
    private int index;
    private Event next;
    private Event last;
    
    
    public Event(int index, String title, String text, BufferedImage img, Event next, Event last)
    {
        this.title=title;
        this.info=text;
        this.img = img;
        this.index = index;
        this.next = next;
        this.last = last;  
    }
    
    /* GET METHODS */
    
    public int getIndex(){
        return index;
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
    public Event getNext(){
        return next;
    }
    public Event getLast(){
        return last;
    }
    public void printAll(){
        System.out.println("Index:" + this.index);
        System.out.println("Title:" + this.title);
        System.out.println("Info:" + this.info);
        System.out.println("Image:" + this.img);
    }
    
    
    /* SET METHODS */
    
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
    public void setNext(Event next){
        this.next = next;
    }
    public void setLast(Event last){
        this.last = last;
    }
}
