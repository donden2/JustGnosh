package theitcloud.example.com.justgnosh;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Menu extends Activity {

    LocalRestaurants mLocal = new LocalRestaurants();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
    }

    TextView mTextView = findViewById(R.id.restaurantName);


    /*Displaying the restaurant name on the menu
     * We'll get this working once Cardviews are a part of the app */
    public void setRestaurantName(){

        //mTextView.setText(mLocal.getListRestaurants());
        mTextView.setText("Five Guys");
    }
}
