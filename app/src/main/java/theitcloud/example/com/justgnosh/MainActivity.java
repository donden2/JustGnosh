package theitcloud.example.com.justgnosh;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SearchView;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends Activity
{
    public final static String EXTRA_MESSAGE = "someString";
    //SearchView searchView = new SearchView(this);
    //This postcode variable will be used to store the postcode to be used in the next activity.
    private String postcode;

    public void setPostcode(String postcode)
    {
        this.postcode = postcode;
    }

    public String getPostcode()
    {
        return postcode;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*Detecting the search and saving the postcode, moving to the restaurants activity.*/
    //SearchView mSearchView = (SearchView)findViewById(R.id.search);

    public void goToLocalMenu(View view)
    {
        //Intent intent = new Intent(this, RestaurantMenuActivity.class);
        Intent intent = new Intent(this, RestaurantMenuActivity.class);
        EditText editText = findViewById(R.id.enterPostcode);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public boolean onOptionsItemSelected(MenuItem item)
    {
        Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
        startActivityForResult(myIntent, 0);
        return true;
    }
}
