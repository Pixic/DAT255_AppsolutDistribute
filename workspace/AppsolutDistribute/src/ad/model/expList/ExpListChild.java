package ad.model.expList;

/**
 * ExpListChild class
 * This class form the children in the group, which forms the content in the expandable list.
 * Class content:
 * Instances: label, tag	
 * Methods: getLabel, setLabel, getTag, setTag
 *
 * @author Stefan Arvidsson
 *
 * � 2012 Stefan Arvidsson
 */
public class ExpListChild {
	// Initiates the child's instances
    private String label;  	//name 
    private String tag;  //tag 

    /**
     * getLabel - Returns the label of the child.
     * @return	
     */
    public String getLabel() {  
        return label;  
    }  
    /**
     * setLabelContent - Sets the incoming String as the child's new label.
     * @param content	
     */
    public void setLabel(String label) {  
        this.label = label;  
    }  
    /**
     * getTag - Returns the child's tag.
     * @return	
     */
   public String getTag() {  
       return tag;  
       
   }  
   /**
    * setTag - Sets the incoming String as the child's new tag.
    * @param tag
    */
    public void setTag(String tag) {  
        this.tag = tag;  
   }  
	
}
