package theitcloud.example.com.justgnosh;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class BasketActivity extends Activity
{
    Franco listViewArrayList = new Franco();
    ArrayList<String> tempArray = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basket);
        ListView list = findViewById(R.id.basketList);
        Intent intent = getIntent();
        intent.getExtras();
        tempArray = (ArrayList<String>)intent.getSerializableExtra("arraylist");
        //listViewArrayList.getMyOrder().add("Franco's Pizza");
        //listViewArrayList.getMyOrder().add("Franco's Bites");
        //listViewArrayList.getMyOrder().add("Total: £13.99");
        ArrayAdapter myAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, tempArray);
        Toast.makeText(this, listViewArrayList.getMyOrder().toString(), Toast.LENGTH_LONG).show();
        list.setAdapter(myAdapter);
    }

    public void goToWaitTime(View view){
        Intent waitIntent = new Intent(this, WaitTime.class);
        startActivity(waitIntent);
    }

}
