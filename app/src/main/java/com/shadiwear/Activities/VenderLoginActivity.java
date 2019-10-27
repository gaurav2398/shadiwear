package com.shadiwear.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.shadiwear.R;

public class VenderLoginActivity extends AppCompatActivity {
    private EditText userEmailEdt, userPasswordEdt;
    private Button loginVenderBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vender_login);

        userEmailEdt = findViewById(R.id.edt_user_email);
        userPasswordEdt = findViewById(R.id.edt_user_password);
        loginVenderBtn = findViewById(R.id.btn_login_vender);

        loginVenderBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(VenderLoginActivity.this, "Login successful...!!!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
