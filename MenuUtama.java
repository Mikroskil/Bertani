package com.example.berisikangklung;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class MenuUtama extends Activity {
	ImageView menu,about;
	@Override
	
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.halaman_awal);
		ketikaklikmenu();
		ketikaklikabout();
	}
	
	protected void ketikaklikmenu(){
		final Context context = this;
		menu = (ImageView)findViewById(R.id.menu);
		menu.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent intent = new Intent(context,IsiMenu.class);
				startActivity(intent);
			}
		});
	}
	
	public void ketikaklikabout(){
		final Context context1 = this;
		about = (ImageView)findViewById(R.id.about);
		about.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent i = new Intent(context1,MenuUtamaAbout.class);
				startActivity(i);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_utama, menu);
		return true;
	}

}
