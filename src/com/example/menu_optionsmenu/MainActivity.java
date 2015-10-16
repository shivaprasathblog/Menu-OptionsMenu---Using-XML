package com.example.menu_optionsmenu;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) 
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) 
    {
    	// TODO Auto-generated method stub
    	
   	if (item.getItemId()==R.id.item1)
    	{
			Toast.makeText(MainActivity.this,"Save is Clicked", Toast.LENGTH_LONG).show();
		}
    	
    	if (item.getItemId()==R.id.item2)
    	{
    		Toast.makeText(MainActivity.this,"Open is Clicked", Toast.LENGTH_LONG).show();
		}
    	if (item.getItemId()==R.id.item3)
     	{
   		Toast.makeText(MainActivity.this,"Close is Clicked", Toast.LENGTH_LONG).show();
	}
	//return super.onOptionsItemSelected(item);
    	
    	
    	//switch (item.getItemId()) 
    	//{
		//case R.id.item1:
		//	Toast.makeText(MainActivity.this,"Save is Clicked", Toast.LENGTH_LONG).show();
		//	break;

		//case R.id.item2:
		//	Toast.makeText(MainActivity.this,"Open is Clicked", Toast.LENGTH_LONG).show();
		//	break;

		//case R.id.item3:
		//	Toast.makeText(MainActivity.this,"Close is Clicked", Toast.LENGTH_LONG).show();
		//	break;
			
		//}
    	
    	//return super.onOptionsItemSelected(item);
       // }
//}
