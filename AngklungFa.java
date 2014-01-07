package com.example.berisikangklung;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;

@SuppressLint("NewApi")
public class AngklungFa extends Activity {

	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.angklung_fa);
			final MediaPlayer imagesound = MediaPlayer.create(AngklungFa.this,R.raw.fafile);
		
		ImageView img = (ImageView) findViewById(R.id.angklungfa);
		img.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				imagesound.start();
			}
		
		});
	}
			
	@Override
	protected void onPause(){
		super.onPause();
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.angklung_fa, menu);
		return true;
	}

}
