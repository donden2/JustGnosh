package theitcloud.example.com.justgnosh;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.kosalgeek.asynctask.AsyncResponse;
import com.kosalgeek.asynctask.PostResponseAsyncTask;

import java.util.HashMap;

public class Register extends Activity {

    private TextView name;
    private TextView email;
    private TextView password;
    private TextView phone;
    private TextView feedback;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        name = findViewById(R.id.registerName);
        email = findViewById(R.id.regiterEmail);
        password = findViewById(R.id.registerPassword);
        phone = findViewById(R.id.registerPhone);
    }

    //Lets do some register database scripts here or use database scripts shall we?
    public void register(View view){

        if(name.length() == 0 || email.length() == 0 || password.length() == 0 || phone.length() == 0){
            feedback.setText("At least one of the fields is empty. Please double check and correct the errors.");
        } else{
            phpMethod();
            //Intent basketIntent = new Intent(this, Basket.class);
            //startActivity(basketIntent);
        }
    }

    public void phpMethod(){
        HashMap postData = new HashMap();
        postData.put("btnLogin", "Login");
        postData.put("mobile", "android");
        postData.put("phpName", name.getText().toString());
        postData.put("phpEmail", email.getText().toString());
        postData.put("phpPassword", password.getText().toString());
        postData.put("phpPhone", phone.getText().toString());

        PostResponseAsyncTask task = new PostResponseAsyncTask(this, postData, new AsyncResponse() {
            @Override
            public void processFinish(String s) {
                int duration = Toast.LENGTH_SHORT;
                if(s.equals("Registered"))
                {
                    Context context = getApplicationContext();
                    CharSequence text = "Registered - Proceed to login!";
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
                else
                {
                    Context context = getApplicationContext();
                    CharSequence text = "There has been an error. Please try again later!";
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
                //Toast.makeText(Register.this, s, Toast.LENGTH_LONG).show();
            }
        });
        task.execute("http://justgnosh.hopto.org/api/register.php");
    }
}
