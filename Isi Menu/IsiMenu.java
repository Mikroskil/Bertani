package com.example.berisikangklung;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class IsiMenu extends Activity {
	Button menu,single,multiple;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.isi_menu);
		ketikakliksingle();
		ketikaklikmultiple();
	}
	
	protected void ketikakliksingle(){
		final Context context = this;
		single = (Button)findViewById(R.id.single);
		single.setOnClickListener(new OnClickListener(){
			public void onClick (View arg0){
				Intent intent = new Intent (context,IsiSingle.class);
				startActivity(intent);
			}
		});
	}
	
	
	protected void ketikaklikmultiple(){
		final Context context1 = this;
		multiple = (Button)findViewById(R.id.multiple);
		multiple.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent i = new Intent (context1,IsiMultiple.class);
				startActivity(i);
			}
		});
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.isi_menu, menu);
		return true;
	}

}