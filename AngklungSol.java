package com.example.berisikangklung;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;


@SuppressLint("NewApi")
public class AngklungSol extends Activity {
	

	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.angklung_sol);
		

		final MediaPlayer imagesound = MediaPlayer.create(AngklungSol.this,R.raw.solfile);
		
		ImageView img = (ImageView) findViewById(R.id.angklungsol);
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
		getMenuInflater().inflate(R.menu.angklung_sol, menu);
		return true;
	}

}
