package theitcloud.example.com.justgnosh;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;

public class Franco extends Activity {

    private String francoBites, francoPizza, francoDrinks, francoPPizza, francoSalad;
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
        setContentView(R.layout.activity_menu_franco);
        francoBites = "Franco's bites";//findViewById(R.id.francoBites);
        francoPizza = "Franco's Pizza";//findViewById(R.id.francoPizza);
        francoDrinks = "Franco's Drinks";//findViewById(R.id.francoDrinks);
        francoPPizza = "Franco's post pizza";//findViewById(R.id.francoPPizza);
        francoSalad = "Franco's Salad";//findViewById(R.id.francoSalad);
    }

    public void goToPizzaMenu(View view)
    {
        Intent intent = new Intent(this, FrancoPizza.class);
        startActivity(intent);
    }

    public void addPizzaToBasket(View view){
        myOrder.add(francoPizza);
        if(myOrder.contains(francoPizza)){
            Toast.makeText(this, "Added to basket", Toast.LENGTH_LONG).show();
            //sendArrayList();
            //Toast.makeText(this, myOrder.toString(), Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this, "Couldn't add your item to the basket", Toast.LENGTH_LONG).show();
        }

    }

    public void addBitesToBasket(View view){
        myOrder.add(francoBites);
        if(myOrder.contains(francoBites)){
            Toast.makeText(this, "Added to basket", Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this, "Couldn't add your item to the basket", Toast.LENGTH_LONG).show();
        }

    }

    public void addDrinksToBasket(View view){
        myOrder.add(francoDrinks);
        if(myOrder.contains(francoDrinks)){
            Toast.makeText(this, "Added to basket", Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this, "Couldn't add your item to the basket", Toast.LENGTH_LONG).show();
        }

    }

    public void addPostPizzaToBasket(View view){
        myOrder.add(francoPPizza);
        if(myOrder.contains(francoPPizza)){
            Toast.makeText(this, "Added to basket", Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this, "Couldn't add your item to the basket", Toast.LENGTH_LONG).show();
        }

    }

    public void addSaladToBasket(View view){
        myOrder.add(francoSalad);
        if(myOrder.contains(francoSalad)){
            Toast.makeText(this, "Added to basket", Toast.LENGTH_LONG).show();
        }else{
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
