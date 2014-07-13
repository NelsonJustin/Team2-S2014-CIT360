package com.example.myrecipemanager;


import java.util.ArrayList;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.*;
import android.view.*;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;



public class Category extends Activity {

	private ArrayList<CategoryBean> categories = new ArrayList<CategoryBean>();

	
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
	
	public void newCategory(View i){
		//Reference New Category Input
		EditText item = (EditText) i.findViewById(R.id.new_category);
		
		
		
	} 
}
