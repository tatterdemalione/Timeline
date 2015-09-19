
--------
# Timeline
A Java GUI application for building an interactive history timeline.  I have come across many people who have a secret or not so secret passion for some series of historical events as I do myself.  This application lets you build your own timeline, adding information and images that interest you!

Planned Updates: 
- Provide functionality for multiple events in each year.  Using an array of linked lists containing events and maybe a JTabbedPane interface?
- Put a logo on the main screen
- Add information for build in Windows
- Add .jar build instructions for Mac and Windows

## Bugs:
- If the final node of timeline is edited, the program gets confused and overwrites parts of the file because it sees the length of the array, on the first line, as the index.
- Can't copy and paste into the JtextFields or JTextAreas
- Large photos get cropped in an ugly fashion, instead of reduced in size...

## To Build:

    git clone https://github.com/tatterdemalione/Timeline.git
    cd Timeline
    javac *.java

## To Test:

    cd ..			# To move out of the Timeline Folder
    java Timeline.timelineGUI

--------
Warning: Do not edit any of the files in the Timelines folder outside of the application because it easy to break things.


