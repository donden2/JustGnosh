package theitcloud.example.com.justgnosh;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class RestaurantMenuActivity extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_menu);

        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
//        String message = "Restaurants near you - " + intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        String message = "Restaurants near you - BH8 8GS";

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.textRestaurant);
        textView.setText(message);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId()) {
            case R.id.previousOrders:
                // Review option clicked.
                return true;
            default:
                return super.onOptionsItemSelected(item);
            case R.id.loginActivity:
                Intent loginActivity = new Intent(this, Login.class);
                startActivity(loginActivity);
                return true;
            case R.id.registerActivity:
                Intent registerActivity = new Intent(this, Register.class);
                startActivity(registerActivity);
                return true;
        }
    }

    public void display7Bone(View v){
        Intent sevenBoneIntent = new Intent(this, SevenBone.class);
        startActivity(sevenBoneIntent);
        //return true;
    }

    public void displayFranco(View v){
        Intent francoIntent = new Intent(this, Franco.class);
        startActivity(francoIntent);
        //return true;
    }

    public void displayMoose(View v){
        Intent mooseIntent = new Intent(this, Moose.class);
        startActivity(mooseIntent);
        //return true;
    }
}
