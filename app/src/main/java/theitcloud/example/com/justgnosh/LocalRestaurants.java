package theitcloud.example.com.justgnosh;

import android.app.Activity;
import android.os.Bundle;
import android.widget.SearchView;
import android.widget.TextView;
import java.util.ArrayList;
import theitcloud.example.com.justgnosh.Restaurants;

public class LocalRestaurants extends Activity {

    private ArrayList<Restaurants> listRestaurants = new ArrayList<>();
    private MainActivity locationActivity = new MainActivity();


    public void setListRestaurants(ArrayList<Restaurants> listRestaurants) {
        this.listRestaurants = listRestaurants;
    }


    public ArrayList<Restaurants> getListRestaurants() {
        return listRestaurants;
    }

    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.local_restaurants); //This goes to the correct activity, but it looks weird right now
        }

        /*Making the button back button function (the image right next to restaurant text*/

        /*Functionality to loop through the restaurants*/

}
