package ad.view.activity;

import java.util.ArrayList;  

import com.example.appsolutdistribute.R;
import ad.controller.expListAdapter.ExpListAdapter;
import ad.model.expList.*;  
import android.app.Activity;  
import android.os.Bundle;  
import android.view.Menu;
import android.widget.ExpandableListView;  

/**
 * MainActivity - extends Activity
 * This class creates the window, and to sets its content.
 * 
 * Class content:
 * Instances: ExpAdapter, ExpListItems, ExpandList
 * Methods: onCreate, setGroups
 * 
 * @author Stefan Arvidsson
 *
 * � 2012 Stefan Arvidsson
 *
 */
public class MainActivity extends Activity {
     /** Called when the activity is first created. */  
    //Initiates the activity's instances 
	private ExpListAdapter ExpAdapter;  
     private ArrayList<ExpListGroup> ExpListItems;  
     private ExpandableListView ExpandList;
     /**
      * onCreate - Starting point of the application
      * @param savedInstanceState
      */
     @Override  
     public void onCreate(Bundle savedInstanceState) {  
    	 super.onCreate(savedInstanceState);
         setContentView(R.layout.main);  
         ExpandList = (ExpandableListView) findViewById(R.id.ExpList);  
         ExpListItems = setGroups();  
         ExpAdapter = new ExpListAdapter(MainActivity.this, ExpListItems);  
         ExpandList.setAdapter(ExpAdapter);         
     }  

     /**
      * setGroups - Returns an ArrayList with all ExpandableList groups.
      * @return
      */
     public ArrayList<ExpListGroup> setGroups() {  
    	 

    	 // Lists are part of old solution
    	 ArrayList<ExpListGroup> list = new ArrayList<ExpListGroup>();  
         ArrayList<ExpListChild> list2 = new ArrayList<ExpListChild>(); 
    	 
    	 String[] inputGroups ={"Connect To Server","Options"};
    	 String[][] inputChildren = {{"Login","Create Account","Select Server"},{"About","Help","Exit"}};
    		
    	 ExpListGroup tempGroup;
    	 ExpListChild tempChild;
    	 int i =0;
    	 for(String group:inputGroups){
    		 tempGroup = new ExpListGroup();
    		 tempGroup.setId(group);
    		 for(String child:inputChildren[i]){
    			 tempChild = new ExpListChild();
    			 tempChild.setLabel(child);
    			 tempChild.setTag(null);
    			 list2.add(tempChild);
    		 }
    		 tempGroup.setContent(list2);
    		 list2 = new ArrayList<ExpListChild>(); 
    		 list.add(tempGroup);  
    		 i++;
    	 }
    	 
    	 
    	 
 // old solution
         
         
//         
//         ExpListGroup gru1 = new ExpListGroup();  
//         gru1.setId("Comedy");  
//         
//         ExpListChild ch1_1 = new ExpListChild();  
//         ch1_1.setLabel("A movie");  
//         ch1_1.setTag(null);  
//         list2.add(ch1_1);  
//         
//         ExpListChild ch1_2 = new ExpListChild();  
//         ch1_2.setLabel("An other movie");  
//         ch1_2.setTag(null);          
//         list2.add(ch1_2); 
//         
//         ExpListChild ch1_3 = new ExpListChild();  
//         ch1_3.setLabel("And an other movie");  
//         ch1_3.setTag(null);  
//         list2.add(ch1_3);  
//         
//         ExpListChild ch1_4 = new ExpListChild();  
//         ch1_4.setLabel("And an other movie");  
//         ch1_4.setTag(null);  
//         list2.add(ch1_4); 
//         
//         ExpListChild ch1_5 = new ExpListChild();  
//         ch1_5.setLabel("And an other movie");  
//         ch1_5.setTag(null);  
//         list2.add(ch1_5); 
//         
//         ExpListChild ch1_6 = new ExpListChild();  
//         ch1_6.setLabel("And an other movie");  
//         ch1_6.setTag(null);  
//         list2.add(ch1_6); 
//         
//         ExpListChild ch1_7 = new ExpListChild();  
//         ch1_7.setLabel("And an other movie");  
//         ch1_7.setTag(null);  
//         list2.add(ch1_7); 
//         
//         ExpListChild ch1_8 = new ExpListChild();  
//         ch1_8.setLabel("And an other movie");  
//         ch1_8.setTag(null);  
//         list2.add(ch1_8); 
//         
//         ExpListChild ch1_9 = new ExpListChild();  
//         ch1_9.setLabel("And an other movie");  
//         ch1_9.setTag(null);  
//         list2.add(ch1_9); 
//         
//         ExpListChild ch1_10 = new ExpListChild();  
//         ch1_10.setLabel("And an other movie");  
//         ch1_10.setTag(null);  
//         list2.add(ch1_10); 
//         
//         ExpListChild ch1_11 = new ExpListChild();  
//         ch1_11.setLabel("And an other movie");  
//         ch1_11.setTag(null);  
//         list2.add(ch1_11); 
//         
//         ExpListChild ch1_12 = new ExpListChild();  
//         ch1_12.setLabel("And an other movie");  
//         ch1_12.setTag(null);  
//         list2.add(ch1_12); 
//         
//         ExpListChild ch1_13 = new ExpListChild();  
//         ch1_13.setLabel("And an other movie");  
//         ch1_13.setTag(null);  
//         list2.add(ch1_13); 
//         
//         ExpListChild ch1_14 = new ExpListChild();  
//         ch1_14.setLabel("And an other movie");  
//         ch1_14.setTag(null);  
//         list2.add(ch1_14); 
//         
//         
//         ExpListChild ch1_15 = new ExpListChild();  
//         ch1_15.setLabel("And an other movie");  
//         ch1_15.setTag(null);  
//         list2.add(ch1_15); 
//         
//         ExpListChild ch1_16 = new ExpListChild();  
//         ch1_16.setLabel("And an other movie");  
//         ch1_16.setTag(null);  
//         list2.add(ch1_16); 
//         
//         ExpListChild ch1_17 = new ExpListChild();  
//         ch1_17.setLabel("And an other movie");  
//         ch1_17.setTag(null);  
//         list2.add(ch1_17); 
//         
//         ExpListChild ch1_18 = new ExpListChild();  
//         ch1_18.setLabel("And an other movie");  
//         ch1_18.setTag(null);  
//         list2.add(ch1_18); 
//         
//         gru1.setContent(list2);  
//         
//         list2 = new ArrayList<ExpListChild>();         
//         ExpListGroup gru2 = new ExpListGroup();  
//         gru2.setId("Action");  
//         ExpListChild ch2_1 = new ExpListChild();  
//         ch2_1.setLabel("A movie");  
//         ch2_1.setTag(null);  
//         list2.add(ch2_1);  
//         ExpListChild ch2_2 = new ExpListChild();  
//         ch2_2.setLabel("An other movie");  
//         ch2_2.setTag(null);  
//         list2.add(ch2_2);  
//         ExpListChild ch2_3 = new ExpListChild();  
//         ch2_3.setLabel("And an other movie");  
//         ch2_3.setTag(null);  
//         list2.add(ch2_3);  
//         gru2.setContent(list2);
//         
//         list.add(gru1);  
//         list.add(gru2);  
           
         return list;  
     }  


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}




