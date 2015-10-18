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
