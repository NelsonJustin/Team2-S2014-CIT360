package com.example.myrecipemanager;


import java.util.ArrayList;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.*;
import android.view.*;
import android.widget.*;



public class Category extends Activity {

	private ArrayList<CategoryBean> categories = new ArrayList<CategoryBean>();
	private CategoryBean category = new CategoryBean();
	private int bean = 0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.category_screen);		
	}

	public void manageCategory(View v){
		
		
		switch(v.getId()){
		
		case R.id.add_button :
			LayoutInflater c = getLayoutInflater();
			View parentLayout = c.inflate(R.layout.add_category,null);
			AlertDialog.Builder categoryDialog = new AlertDialog.Builder(Category.this);
			categoryDialog.setView(parentLayout).show();
			break;
			
		case R.id.delete_button:
			LayoutInflater c2 = getLayoutInflater();
			View parentLayout2 = c2.inflate(R.layout.add_category,null);
			AlertDialog.Builder categoryDialog2 = new AlertDialog.Builder(Category.this);
			categoryDialog2.setView(parentLayout2).show();
			break;
		
	}
		
}
	
	public void saveCategory(View i){
		 
		createCategory();
		
		//Inflate Category Screen with new Category Text View
		i.getId();
		LayoutInflater s = getLayoutInflater();
		s.inflate(R.layout.category_screen, null);

		}
	
	private ArrayList<CategoryBean> newCategory(){
			
		//Reference New Category Input
		EditText item = (EditText) findViewById(R.id.new_category);
		
		//Use the user input to create CategoryBean Object and add the object to a collection.
		while(!item.equals(null)){
			
			category.setCategoryName(item.toString());
			categories.add(category);
			
		}
		
		return categories;
		
	}
	
	private void createCategory(){
		
		int c = 1;
		LinearLayout categoryRow = (LinearLayout) findViewById(R.id.category_list);
		TextView categoryNew = (TextView) findViewById(R.layout.category_rows);
		
		//Get User input and create CategoryBean
		newCategory();
		
		//Set TextView Id, add TextView to LinearLayout to create Category List, Increment ID for the next additional category
		categoryNew.setId(c);
	    categoryRow.addView(categoryNew, R.layout.category_rows);
	    
	    c++;
	    
	    //Set TextView text using the CategoryBean ArrayList
	    categoryNew.setText(categories.get(bean).getCategoryName());
	    
	}
}
