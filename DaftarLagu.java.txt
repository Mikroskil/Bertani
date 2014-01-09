package com.example.berisikangklung;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

import android.app.AlertDialog;
import android.app.ListActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class DaftarLagu extends ListActivity {
	Button btn1;
	public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
 
        String[] daftarlagu = new String[] { "17 Agustus","Bagimu Negeri", "Bangun Pemudi Pemuda", 
        "Berkibarlah Bendera","Dari Sabang Sampai Merauke","Garuda Pancasila","Gugur Bunga","Hyme Guru","Ibu Kita Kartini"};
        this.setListAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, daftarlagu));
    }
 
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String keyword = o.toString();
        Toast.makeText(this, "Anda Memilih: " + keyword, Toast.LENGTH_LONG).show();
    }
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.daftar_lagu, menu);
		return true;
	}

}
