package ad.controller.expListAdapter;

import java.util.ArrayList;   
import com.example.appsolutdistribute.R;
import ad.model.expList.*;
import android.content.Context;  
import android.view.LayoutInflater;  
import android.view.View;  
import android.view.ViewGroup;  
import android.widget.BaseExpandableListAdapter;  
import android.widget.TextView;  

/**
 * ExpListAdapter - extends BaseExpandableListAdapter
 * This class acts as a bridge between the View and the Model.
 * Class content:
 * Instances: context, groups
 * Methods: addItem, getChild, getChildId, getChildView, getChildrenCount, getGroup, 
 * 			getGroupCount, getGroupId, getGroupView, hasStableIds, isChildSelectable
 * 
 * @author Stefan Arvidsson 
 * 
 * � 2012 Stefan Arvidsson
 *
 */
public class ExpListAdapter extends BaseExpandableListAdapter {  
	// Initiates the adapters's instances
    private Context context;  			
    private ArrayList<ExpListGroup> groups;  
    /**
     * ExpListAdapter - The constructor of the expandable list adapter.
     * @param context	
     * @param groups
     */
    public ExpListAdapter(Context context, ArrayList<ExpListGroup> groups) {  
  
        this.context = context;  
        this.groups = groups;  
	}  
    /**   
     * addItem - Adds a child to a group.
     * @param item
     * @param group
     */
    public void addItem(ExpListChild item, ExpListGroup group) {  
    	if (!groups.contains(group)) {  
            groups.add(group);  
        }  
        int index = groups.indexOf(group);  
        ArrayList<ExpListChild> ch = groups.get(index).getContent();  
        ch.add(item);  
        groups.get(index).setContent(ch);  
    }  
    /**
     * getChild - Finds the child in the array and return it. OBS! It returns ExpListChild.
     * @param groupPosition
     * @param childPosition
     * @return
     */
    public Object getChild(int groupPosition, int childPosition) {  
        // TODO Auto-generated method stub  
        ArrayList<ExpListChild> chList = groups.get(groupPosition).getContent();  
        return chList.get(childPosition);  
    }  
    /**
     * Not used yet, unclear what to use it for.
     * note: Could be to get the child's content or tag? Maybe need to define an id in 
     * this class and use it somehow...
     */
    public long getChildId(int groupPosition, int childPosition) {  
        // TODO Auto-generated method stub  
        return childPosition;  
    }  
    
    /**
     * getChildView - Returns the view for the child.
     * @param groupPosition
     * @param childPosition
     * @param isLastChild
     * @param view
     * @param parent
     * @return
     */
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View view,  
            ViewGroup parent) {  
    	// TODO Auto-generated method stub  
    	ExpListChild child = (ExpListChild) getChild(groupPosition, childPosition);  
        if (view == null) {  
            LayoutInflater infalInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);  
            view = infalInflater.inflate(R.layout.explist_child, null);  
        }  
        TextView tv = (TextView) view.findViewById(R.id.tvChild);  
        tv.setText(child.getLabel().toString());  
        tv.setTag(child.getLabel());          
        return view;  
	}  
    /**
     * getChildrenCount - Returns how many children there is in a group.
     * @param groupPosition
     * @return
     */
    public int getChildrenCount(int groupPosition) {  
        // TODO Auto-generated method stub  
        ArrayList<ExpListChild> chList = groups.get(groupPosition).getContent();  
        return chList.size();      
    }  
    /**
     * getGroup - Returns a group. OBS! It returns an ExpListGroup
     * @param groupPosition
     * @return
     */
    public Object getGroup(int groupPosition) {  
        // TODO Auto-generated method stub  
        return groups.get(groupPosition);  
    }  
    /**
     * getGroupCount - Returns the number of groups used in the expandable list.
     * @return
     */
   public int getGroupCount() {  
        // TODO Auto-generated method stub  
        return groups.size();  
    }  
   /**
    * same as for child...
    */
    public long getGroupId(int groupPosition) {  
        // TODO Auto-generated method stub  
        return groupPosition;  
    }  
    /**
     * getGroupView - Returns the view for the group.
     * @param groupPosition
     * @param isLastChild
     * @param view
     * @param parent
     * @return 
     */
    public View getGroupView(int groupPosition, boolean isLastChild, View view,  
            ViewGroup parent) {  
        // TODO Auto-generated method stub  
    	ExpListGroup group = (ExpListGroup) getGroup(groupPosition);  
        if (view == null) {  
            LayoutInflater inf = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);  
            view = inf.inflate(R.layout.explist_group, null);  
        }  
        TextView tv = (TextView) view.findViewById(R.id.tvGroup);  
        tv.setText(group.getLabel());  

        return view;  
    }  
    /**
     * hasStableIds - Returns a boolean which is true if ...
     * 				  note: not used.
     * @return
     */
    public boolean hasStableIds() {  
        // TODO Auto-generated method stub  
        return true;  
    }  
    /**
     * isChildSelectable - Returns a boolean with the value true. 
     * 						Not sure yet if they are...
     * @param arg0
     * @param arg1
     * @return
     */
    public boolean isChildSelectable(int arg0, int arg1) {  
        // TODO Auto-generated method stub  
        return true;  
    }  
} 