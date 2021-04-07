package com.example.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import java.util.prefs.PreferenceChangeEvent;

public class LoginActivity extends AppCompatActivity {

    private SharedPreferences pref;

    private SharedPreferences.Editor editor;

    private EditText nameEdit;

    private EditText passwordEdit;

    private Button loginBtn;

    private CheckBox rememberBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        pref = PreferenceManager.getDefaultSharedPreferences(this);
        nameEdit = (EditText)findViewById(R.id.name);
        passwordEdit = (EditText)findViewById(R.id.password);
        rememberBox = (CheckBox)findViewById(R.id.remember_pass);
        loginBtn = (Button)findViewById(R.id.login);
        boolean isRemember = pref.getBoolean("remember_password", false);
        if(isRemember){
            nameEdit.setText(pref.getString("name", ""));
            passwordEdit.setText(pref.getString("password", ""));
            rememberBox.setChecked(true);
        }
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameEdit.getText().toString();
                String password = passwordEdit.getText().toString();
                if (name.equals("admin") && password.equals("123456")){
                    editor = pref.edit();
                    if (rememberBox.isChecked()){
                        editor.putBoolean("remember_password", true);
                        editor.putString("name", name);
                        editor.putString("password", password);
                    }else{
                        editor.clear();
                    }
                    editor.apply();
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(LoginActivity.this, "account or password is invalid", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}