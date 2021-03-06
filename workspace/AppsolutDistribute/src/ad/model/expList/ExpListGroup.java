package ad.model.expList;

import java.util.ArrayList;  


/**
 * ExpListGroup
 * This class make up the content of the expandable list, by forming the groups.
 * The children are placed in a group with the ExpListAdapter.
 * A group can be empty, but it would be useless.
 * 
 * Class content:
 * Instances: label, content	
 * Methods: getLabel, setLabel, getContent, setContent
 * 
 * @author Stefan Arvidsson
 *
 *  � 2012 Stefan Arvidsson
 */
public class ExpListGroup {  
	// Initiates the group's instances
     private String label;  						//name
     private ArrayList<ExpListChild> content;   //items
     /**
      * getLabel - Returns the label of the group.  
      * @return	
      */
     public String getLabel() {  
         return label;  
     }  
     /**
      * setLabel - Sets the incoming String as the group's new label.
      * @param label
      */
     public void setId(String label) {  
         this.label = label;  
     }  
     /**
      * getContent - Returns an ArrayList with the content.
      * @return	
      */
     public ArrayList<ExpListChild> getContent() {  
         return content;  
     }  
     /**
      * setContent - Sets the incoming ArrayList<ExpListChild> as the groups's new content.
      * @param content
      */
     public void setContent(ArrayList<ExpListChild> content) {  
		this.content = content;  
     }          

} 
