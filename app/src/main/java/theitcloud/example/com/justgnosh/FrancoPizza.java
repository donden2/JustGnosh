package theitcloud.example.com.justgnosh;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class FrancoPizza extends Activity
{
    private String ham, tomgarlic, tommozz, cheesy, pepperoni;
    private ArrayList<String> myOrder = new ArrayList<>();
    private String restaurant = "Franco Manca";

    //Getter for ArrayList
    public ArrayList<String> getMyOrder() {
        return myOrder;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_franco_pizza);

        ham = "Ham Pizza";//findViewById(R.id.francoBites);
        tomgarlic = "Tomato & Garlic Pizza";//findViewById(R.id.francoPizza);
        tommozz = "Tomato & Garlic Pizza";//findViewById(R.id.francoDrinks);
        cheesy = "Cheesy Pizza";//findViewById(R.id.francoPPizza);
        pepperoni = "Pepperoni Pizza";//findViewById(R.id.francoSalad);
    }

    public void addHamToBasket(View view)
    {
        myOrder.add(ham);
        if(myOrder.contains(ham))
        {
            Toast.makeText(this, "Added to basket", Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(this, "Couldn't add your item to the basket", Toast.LENGTH_LONG).show();
        }
    }

    public void addTGToBasket(View view)
    {
        myOrder.add(tomgarlic);
        if(myOrder.contains(tomgarlic))
        {
            Toast.makeText(this, "Added to basket", Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(this, "Couldn't add your item to the basket", Toast.LENGTH_LONG).show();
        }
    }

    public void addTMToBasket(View view)
    {
        myOrder.add(tommozz);
        if(myOrder.contains(tommozz))
        {
            Toast.makeText(this, "Added to basket", Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(this, "Couldn't add your item to the basket", Toast.LENGTH_LONG).show();
        }
    }

    public void addCheesyToBasket(View view)
    {
        myOrder.add(cheesy);
        if(myOrder.contains(cheesy))
        {
            Toast.makeText(this, "Added to basket", Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(this, "Couldn't add your item to the basket", Toast.LENGTH_LONG).show();
        }
    }

    public void addPepperoniToBasket(View view)
    {
        myOrder.add(pepperoni);
        if(myOrder.contains(pepperoni))
        {
            Toast.makeText(this, "Added to basket", Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(this, "Couldn't add your item to the basket", Toast.LENGTH_LONG).show();
        }
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
                intentMap.putExtra("arraylist", getMyOrder());
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
}
