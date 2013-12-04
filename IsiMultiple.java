package com.example.berisikangklung;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class IsiMultiple extends Activity {
	Button btn1,btn2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.isi_multiple);
		ketikaklikDaftarLagu();
		ketikaklikTanpaDaftarLagu();
	}
	protected void ketikaklikDaftarLagu(){
		final Context context = this;
		btn1 = (Button)findViewById(R.id.btn1);
		btn1.setOnClickListener(new OnClickListener(){
			public void onClick (View argo){
				Intent intent = new Intent(context,DaftarLagu.class);
				startActivity(intent);
			}
		});
	}
	protected void ketikaklikTanpaDaftarLagu(){
		final Context context1 = this;
		btn2 = (Button)findViewById(R.id.btn2);
		btn2.setOnClickListener(new OnClickListener(){
			public void onClick (View argo){
				Intent i = new Intent(context1,TanpaDaftarLagu.class);
				startActivity(i);
			}
		});
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.isi_multiple, menu);
		return true;
	}

}
