package com.example.listview;

import android.app.Activity;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {
	String list[]={"Sanday","monday","tuesday","wednesday","thirsday","friday","saturday"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ListView lv=(ListView)findViewById(R.id.lv);
		MyAdapter obj=new MyAdapter();
		lv.setAdapter(obj);
		
	}
	public class MyAdapter extends BaseAdapter{

		@Override
		public int getCount() {
			return list.length;
		}

		@Override
		public Object getItem(int position) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public long getItemId(int position) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			LayoutInflater lif=getLayoutInflater();
			View v=lif.inflate(R.layout.row, parent, false);
			TextView tv=(TextView)v.findViewById(R.id.tv1);
			tv.setText(list[position]);
			return  v;
			
		}
		
	}
}
