package com.example.fragments.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import com.example.fragments.Fragment.ContatoFragment;
import com.example.fragments.Fragment.ConversaFragment;
import com.example.fragments.R;

public class MainActivity extends AppCompatActivity {

    private Button buttonConversas, buttonContatos;
    private FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frameLayout = findViewById(R.id.frameLayout);
        buttonConversas = findViewById(R.id.buttonConversas);
        buttonContatos = findViewById(R.id.buttonContatos);

        ConversaFragment conversaFragment = new ConversaFragment();

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameLayout, conversaFragment);
        transaction.commit();

        buttonContatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ContatoFragment contatoFragment = new ContatoFragment();

                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout, contatoFragment);
                fragmentTransaction.commit();
            }
        });

        buttonConversas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout, conversaFragment);
                fragmentTransaction.commit();
            }
        });

    }
}