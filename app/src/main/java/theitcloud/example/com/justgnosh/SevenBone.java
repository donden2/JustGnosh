package theitcloud.example.com.justgnosh;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class SevenBone extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_7bone);
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
            case R.id.cart:
                // Map option clicked.
                Intent intentMap = new Intent(this, BasketActivity.class);
                this.startActivity(intentMap);
                return true;
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

    public void goToDogsMenu(View view)
    {
        Intent intent = new Intent(this, SevenBoneJuicyDogs.class);
        startActivity(intent);
    }

}
