package theitcloud.example.com.justgnosh;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.kosalgeek.asynctask.AsyncResponse;
import com.kosalgeek.asynctask.PostResponseAsyncTask;
import java.util.HashMap;


public class Login extends Activity {

    private TextView email;
    private TextView password;
    private TextView feedback;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        email = findViewById(R.id.loginEmail);
        password = findViewById(R.id.loginPassword);
        btnLogin = findViewById(R.id.loginBtn);
    }

    //Lets do some login database scripts here or use database scripts shall we?
    public void login(View view) {
        if (email.length() == 0 && password.length() == 0) {
            feedback.setText("Both fields are empty, please fill them out.");
        } else if (email.length() == 0 || password.length() == 0) {
            feedback.setText("At least one of the above fields are empty, please fill them out.");
        } else {
            phpMethod();
            //Redirect back to the last activity they were in?
        }
    }

    public void phpMethod() {

        HashMap postData = new HashMap();
        postData.put("btnLogin", "Login");
        postData.put("mobile", "android");
        postData.put("phpEmail", email.getText().toString());
        postData.put("phpPassword", password.getText().toString());

        PostResponseAsyncTask task = new PostResponseAsyncTask(this, postData, new AsyncResponse() {
            @Override
            public void processFinish(String s)
            {
                int duration = Toast.LENGTH_SHORT;
                if(s.equals("Success"))
                {
                    Context context = getApplicationContext();
                    CharSequence text = "Log in successful!";
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
                else
                {
                    Context context = getApplicationContext();
                    CharSequence text = "Incorrect credentials!";
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
            }
        });
        task.execute("http://justgnosh.hopto.org/api/login.php");

    }
}
