package com.example.berisikangklung;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.media.MediaPlayer;
import android.widget.ImageView;
import android.view.View.OnHoverListener;
import android.view.View.OnClickListener;
import android.widget.VideoView;
import android.widget.MediaController;

@SuppressLint("NewApi")
public class AngklungDo extends Activity {

	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.angklung_do);
		
		final MediaPlayer imagesound = MediaPlayer.create(AngklungDo.this,R.raw.dofile);
		
		ImageView img = (ImageView) findViewById(R.id.angklungdo);
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
		getMenuInflater().inflate(R.menu.angklung_do, menu);
		return true;
	}

}
