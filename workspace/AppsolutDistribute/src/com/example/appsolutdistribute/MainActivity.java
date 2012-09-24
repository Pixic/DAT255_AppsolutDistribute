package com.example.appsolutdistribute;

import android.os.Bundle;
import android.app.Activity;
import android.view.Gravity;
import android.view.Menu;
import android.view.ViewGroup;

import android.view.View;

import android.view.View.OnClickListener;
import android.widget.Button;

import android.widget.AbsListView;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.TextView;

import android.graphics.Color;






public class MainActivity extends Activity  {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //added by Stefan Arvidsson--------------------------------------------
        Button closebutton = (Button)this.findViewById(R.id.exitButton);
        closebutton.setOnClickListener(new OnClickListener(){
           // @Override 
            public void onClick(View v) { 
                // TODO Auto-generated method stub 
                finish(); 
                System.exit(0); 
            } 
        });
        
        // For expandable list
        ExpandableListView mainList = (ExpandableListView)this.findViewById(R.id.mainExpandableListView); 
        ExpandableListAdapter mainListAdapter = new MainExpandableListAdapter();
        mainList.setAdapter(mainListAdapter);
        
        mainList.setOnGroupClickListener( new OnGroupClickListener(){
        	//@Override
        	public boolean onGroupClick(ExpandableListView arg0, View arg1, int groupPosition,long arg3){
        		if(groupPosition ==5){
        			
        		}
        		return false;
        	}
        });
        
        
        mainList.setOnChildClickListener(new ExpandableListView.OnChildClickListener(){
        	public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id){
        		if(groupPosition == 0 && childPosition == 0){
        			
        		}
        		
        		return false;
        	}
        });
        //----------------------------------------------------------------------
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    

    
    /**
     * An adapter to get the expandablelistview going.
     * @author Stefan
     *
     */
    private class MainExpandableListAdapter extends BaseExpandableListAdapter {

    	private String[] groups = {"Parent1","Parent2","Parent3"};
    	private String[][] children ={{"Child1"},{"Child2"},{"Child3"},{"Child4"},{"Child5"}};
    	
    	public Object getChild(int groupPosition, int childPosition) {
    		// TODO Auto-generated method stub
    		//return null;
    		return children[groupPosition][childPosition];
    	}
    	public long getChildId(int groupPosition, int childPosition) {
    		// TODO Auto-generated method stub
    		//return 0;
    		return childPosition;
    	}
    	public View getChildView(int groupPosition, int childPosition,
    			boolean isLastChild, View convertView, ViewGroup parent) {
    		// TODO Auto-generated method stub
    		//return null;
    		TextView textView = getGenericView();
    		textView.setText(getChild(groupPosition,childPosition).toString());
    		
    		return textView;
    	}
    	public int getChildrenCount(int groupPosition) {
    		// TODO Auto-generated method stub
    		//return 0;
    		int i = 0;
    		try{
    			i = children[groupPosition].length;
    		}catch(Exception e){}
    		return i;
    	}
    	
    	public TextView getGenericView(){
    		// layout parameters for the ExpandableListView
    		AbsListView.LayoutParams lp = new AbsListView.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT,64);
    		TextView textView = new TextView(MainActivity.this);
    		textView.setLayoutParams(lp);
    		// center the text vertically
    		textView.setGravity(Gravity.CENTER_VERTICAL|Gravity.LEFT);
    		textView.setTextColor(Color.RED);
    		// Set the text starting position
    		textView.setPadding(36, 0, 0, 0);
    		return textView;
    		
    	}
    	
    	public Object getGroup(int groupPosition) {
    		// TODO Auto-generated method stub
    		//return null;
    		return groupPosition;
    	}
    	public int getGroupCount() {
    		// TODO Auto-generated method stub
    		return 0;
    	}
    	public long getGroupId(int groupPosition) {
    		// TODO Auto-generated method stub
    		return 0;
    	}
    	public View getGroupView(int groupPosition, boolean isExpanded,
    			View convertView, ViewGroup parent) {
    		// TODO Auto-generated method stub
    		//return null;
    		TextView textView = getGenericView();
    		textView.setText(getGroup(groupPosition).toString());
    		return textView;
    	}
    	public boolean hasStableIds() {
    		// TODO Auto-generated method stub
    		//return false;
    		return true;
    	}
    	public boolean isChildSelectable(int groupPosition, int childPosition) {
    		// TODO Auto-generated method stub
    		//return false;
    		return true;
    	}
    	

    }
    
}




