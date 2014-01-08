package com.example.berisikangklung;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.content.DialogInterface;
import android.app.AlertDialog;

public class MenuUtama extends Activity {
	Button menu,about,exit;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.halaman_awal);
		ketikaklikmenu();
		ketikaklikabout();
		ketikaklikexit();
	}
	
	protected void ketikaklikmenu(){
		final Context context = this;
		menu = (Button)findViewById(R.id.menu);
		menu.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent intent = new Intent(context,IsiMenu.class);
				startActivity(intent);
			}
		});
	}
	
	public void ketikaklikabout(){
		final Context context1 = this;
		about = (Button)findViewById(R.id.about);
		about.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				Intent i = new Intent(context1,MenuUtamaAbout.class);
				startActivity(i);
			}
		});
	}
	
	public void ketikaklikexit(){
		final Context context2 = this;
		exit = (Button)findViewById(R.id.exit);
		exit.setOnClickListener(new OnClickListener(){
			public void onClick (View arg0){
				 AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context2);
				 alertDialogBuilder.setTitle("Yakin mau kluar mas Bro?");
				 
				 alertDialogBuilder
				 	.setMessage("Tekan YA untuk keluar !")
				 	.setCancelable(false)
				 	.setPositiveButton("YA",
				 			new DialogInterface.OnClickListener(){
				 				public void onClick(DialogInterface dialog,int id){
				 					 MenuUtama.this.finish();
				 				}					
				 	})
				 	.setNegativeButton("TIDAK",
				 			new DialogInterface.OnClickListener() {
				 		 		public void onClick(DialogInterface dialog,int id){
				 		 			dialog.cancel();
				 		 		}
				 	 });
				 AlertDialog alertDialog = alertDialogBuilder.create();
				 alertDialog.show();
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
