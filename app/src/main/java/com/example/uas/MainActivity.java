package com.example.uas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private EditText usernameLogin, passwordLogin;
    private TextView textView22;
    private Button button2;
    private ProgressBar progressBar2;
    private static String URL = "https://192.168.1.6/ProgTech/UAS/Login.php";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_UAS);
        setContentView(R.layout.activity_main);

        textView22 = findViewById(R.id.textView22);
        button2 = findViewById(R.id.button2);
        usernameLogin = findViewById(R.id.usernameLogin);
        passwordLogin = findViewById(R.id.passwordLogin);
        progressBar2 = findViewById(R.id.progressBar2);

        textView22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), RegisterActivity.class);
                startActivity(intent);
                finish();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usernameLogin.getText().toString().trim();
                String password = passwordLogin.getText().toString().trim();

                if (!username.isEmpty() || !password.isEmpty()){
                    Login(username, password);
                } else {
                    usernameLogin.setError("Please insert username");
                    passwordLogin.setError("Please insert password");
                }
            }
        });
    }

    private void Login(String usernameLogin, String passwordLogin) {
        progressBar2.setVisibility(View.VISIBLE);
        button2.setVisibility(View.GONE);

        StringRequest request = new StringRequest(Request.Method.POST, URL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonObject = new JSONObject(response);
                            String success = jsonObject.getString("success");
                            JSONArray jsonArray = jsonObject.getJSONArray("login");

                            if (success.equals("1")){
                                for (int i = 0; i < jsonArray.length(); i++){
                                    JSONObject object = jsonArray.getJSONObject(i);

                                    Toast.makeText(MainActivity.this, "Login Success.", Toast.LENGTH_SHORT).show();
                                    progressBar2.setVisibility(View.GONE);
                                }
                            }
                        }catch (JSONException e){
                            e.printStackTrace();
                            progressBar2.setVisibility(View.GONE);
                            button2.setVisibility(View.VISIBLE);
                            Toast.makeText(MainActivity.this, "Error" + e.toString(), Toast.LENGTH_SHORT).show();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        progressBar2.setVisibility(View.GONE);
                        button2.setVisibility(View.VISIBLE);
                        Toast.makeText(MainActivity.this, "Error" + error.toString(), Toast.LENGTH_SHORT).show();
                    }
                })
        {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> params = new HashMap<>();
                params.put("Username", usernameLogin);
                params.put("Password", passwordLogin);
                return params;
            }
        };

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(request);
    }
}