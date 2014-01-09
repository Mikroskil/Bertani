package com.example.berisikangklung;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class IsiSingle extends Activity {
	ImageView single,gambar1,gambar2,gambar3,gambar4,gambar5,gambar6,gambar7,
		gambar8;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.isi_single);
		angklung1();
		angklung2();
		angklung3();
		angklung4();
		angklung5();
		angklung6();
		angklung7();
		angklung8();
	}
	protected void angklung1(){
		final Context context = this;
		gambar1 = (ImageView)findViewById(R.id.gambar1);
		gambar1.setOnClickListener(new OnClickListener(){
			public void onClick (View arg0){
				Intent intent = new Intent (context,AngklungDo.class);
				startActivity(intent);
			}
		});
	}
	
	protected void angklung2(){
		final Context context2 = this;
		gambar2 = (ImageView)findViewById(R.id.gambar2);
		gambar2.setOnClickListener(new OnClickListener(){
			public void onClick (View arg0){
				Intent intent2 = new Intent (context2,AngklungRe.class);
				startActivity(intent2);
			}
		});
	}
	
	protected void angklung3(){
		final Context context3 = this;
		gambar3 = (ImageView)findViewById(R.id.gambar3);
		gambar3.setOnClickListener(new OnClickListener(){
			public void onClick (View arg0){
				Intent intent3 = new Intent (context3,AngklungMi.class);
				startActivity(intent3);
			}
		});
	}

	protected void angklung4(){
		final Context context4 = this;
		gambar4 = (ImageView)findViewById(R.id.gambar4);
		gambar4.setOnClickListener(new OnClickListener(){
			public void onClick (View arg0){
				Intent intent4 = new Intent (context4,AngklungFa.class);
				startActivity(intent4);
			}
		});
	}
	
	protected void angklung5(){
		final Context context5 = this;
		gambar5 = (ImageView)findViewById(R.id.gambar5);
		gambar5.setOnClickListener(new OnClickListener(){
			public void onClick (View arg0){
				Intent intent5 = new Intent (context5,AngklungSol.class);
				startActivity(intent5);
			}
		});
	}
	
	protected void angklung6(){
		final Context context6 = this;
		gambar6 = (ImageView)findViewById(R.id.gambar6);
		gambar6.setOnClickListener(new OnClickListener(){
			public void onClick (View arg0){
				Intent intent6 = new Intent (context6,AngklungLa.class);
				startActivity(intent6);
			}
		});
	}
	
	protected void angklung7(){
		final Context context7 = this;
		gambar7 = (ImageView)findViewById(R.id.gambar7);
		gambar7.setOnClickListener(new OnClickListener(){
			public void onClick (View arg0){
				Intent intent7 = new Intent (context7,AngklungSi.class);
				startActivity(intent7);
			}
		});
	}
	
	protected void angklung8(){
		final Context context8 = this;
		gambar8 = (ImageView)findViewById(R.id.gambar8);
		gambar8.setOnClickListener(new OnClickListener(){
			public void onClick (View arg0){
				Intent intent8 = new Intent (context8,AngklungDoTinggi.class);
				startActivity(intent8);
			}
		});
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.isi_single, menu);
		return true;
	}

}
