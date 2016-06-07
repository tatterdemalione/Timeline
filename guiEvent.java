
package Timeline;

/**
 *
 * @author Tatterdemalione
 */
public class guiEvent 
{
    private javax.swing.JLabel dynamicFrame;
    private javax.swing.JTextField dynamicTitle;
    private javax.swing.JTextArea dynamicInfoBox;
    private int index;
    private guiEvent next;
    private guiEvent last;
    
    public guiEvent(int index, javax.swing.JLabel dynamicFrame, javax.swing.JTextField dynamicTitle, javax.swing.JTextArea dynamicInfoBox)
    {
        this.index = index;
        this.dynamicFrame = dynamicFrame;
        this.dynamicInfoBox = dynamicInfoBox;
        this.dynamicTitle = dynamicTitle;
    }
    
    
    /* GET METHODS */
    
    public javax.swing.JLabel getFrame(){
        return dynamicFrame;
    }
    public javax.swing.JTextField getTitle(){
        return dynamicTitle;
    }
    public javax.swing.JTextArea getInfoBox(){
        return dynamicInfoBox;
    }
    public int getIndex(){
        return index;
    }
    public guiEvent getNext(){
        return next;
    }
    public guiEvent getLast(){
        return last;
    }
    
    
    /* SET METHODS */
    
    public void setNext(guiEvent next){
        this.next = next;
    }
    public void setLast(guiEvent last){
        this.last = last;
    }
    public void setIndex(int index){
        this.index = index;
    }
    public void setFrame(javax.swing.JLabel frame){
        this.dynamicFrame = frame;
    }
    public void setTitle(javax.swing.JTextField title){
        this.dynamicTitle = title;
    }
    public void setInfoBox(javax.swing.JTextArea infoBox){
        this.dynamicInfoBox = infoBox;
    }
    
    
}

 
