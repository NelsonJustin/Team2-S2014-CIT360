package com.example.myrecipemanager;

import android.support.v7.*;
import android.app.Activity;
import android.app.AlertDialog;
import android.os.*;
import android.view.*;
import android.widget.Button;


public class Category extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.category_screen);

		categoryAdd();
		
	}

	public void categoryAdd() {
		//1. Get reference to button
		Button addCategory = (Button) findViewById(R.id.add_button);
		
		//2. Set Onclick Listener for addButton
		addCategory.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				try{
				LayoutInflater c = getLayoutInflater();
				View parentLayout = c.inflate(R.layout.add_category,null);
				AlertDialog.Builder categoryDialog = new AlertDialog.Builder(Category.this);
				categoryDialog.setView(parentLayout).show();
				} catch(InflateException e){
					e.printStackTrace();
				}
				
			}
		});
	}


}