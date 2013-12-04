package com.example.berisikangklung;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ImageView;



public class MenuUtamaAbout extends Activity {
	ImageView about;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu_utama_about);
	}



	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.menu_utama_about, menu);
		return true;
	}

}



