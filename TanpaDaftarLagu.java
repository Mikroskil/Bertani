package com.example.berisikangklung;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;

@SuppressLint("NewApi")
public class TanpaDaftarLagu extends Activity {

	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tanpa_daftar_lagu);
		
		final MediaPlayer imagesound = MediaPlayer.create(TanpaDaftarLagu.this,R.raw.dofile);
		ImageView img = (ImageView) findViewById(R.id.multipledo);
		img.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				imagesound.start();
			}
		});
		
		final MediaPlayer imagesound2 = MediaPlayer.create(TanpaDaftarLagu.this,R.raw.refile);
		ImageView img2 = (ImageView)findViewById(R.id.multiplere);
		img2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				imagesound2.start();
			}
		});
		
		final MediaPlayer imagesound3 = MediaPlayer.create(TanpaDaftarLagu.this,R.raw.mifile);
		ImageView img3 = (ImageView)findViewById(R.id.multiplemi);
		img3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				imagesound3.start();
			}
		});
		
		final MediaPlayer imagesound4 = MediaPlayer.create(TanpaDaftarLagu.this,R.raw.fafile);
		ImageView img4 = (ImageView)findViewById(R.id.multiplefa);
		img4.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				imagesound4.start();
			}
		});
		
		final MediaPlayer imagesound5 = MediaPlayer.create(TanpaDaftarLagu.this,R.raw.solfile);
		ImageView img5 = (ImageView)findViewById(R.id.multiplesol);
		img5.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				imagesound5.start();
			}
		});
		
		final MediaPlayer imagesound6 = MediaPlayer.create(TanpaDaftarLagu.this,R.raw.lafile);
		ImageView img6 = (ImageView)findViewById(R.id.multiplela);
		img6.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				imagesound6.start();
			}
		});
		
		final MediaPlayer imagesound7 = MediaPlayer.create(TanpaDaftarLagu.this,R.raw.sifile);
		ImageView img7 = (ImageView)findViewById(R.id.multiplesi);
		img7.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				imagesound7.start();
			}
		});
		
		final MediaPlayer imagesound8 = MediaPlayer.create(TanpaDaftarLagu.this,R.raw.dotinggifile);
		ImageView img8 = (ImageView)findViewById(R.id.multipledotinggi);
		img8.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				imagesound8.start();
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
		getMenuInflater().inflate(R.menu.tanpa_daftar_lagu, menu);
		return true;
	}

}
