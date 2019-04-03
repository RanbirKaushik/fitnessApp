package studio.golden.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.lang.reflect.GenericArrayType;

public class GymActivity extends AppCompatActivity {

    Button btn_biceps;
    Button btn_abs;
    Button btn_chest;
    Button btn_shoulders;
    Button btn_race;
    Button btn_other_fitness;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gym);

        btn_biceps = (Button) findViewById(R.id.button_biceps);
        btn_abs = (Button) findViewById(R.id.button_abs);
        btn_chest = (Button) findViewById(R.id.button_chest);
        btn_shoulders = (Button) findViewById(R.id.button_shoulders);
        btn_race = (Button) findViewById(R.id.button_race);
        btn_other_fitness = (Button) findViewById(R.id.button_other_fitness);

        getSupportActionBar().setTitle("Start Fitness In Gym");

        btn_biceps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GymActivity.this,BicepsActivity.class);
                startActivity(intent);
            }
        });

        btn_abs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GymActivity.this,AbsActivity.class);
                startActivity(intent);
            }
        });

        btn_chest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GymActivity.this,ChestActivity.class);
                startActivity(intent);
            }
        });

        btn_shoulders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GymActivity.this,ShoulderActivity.class);
                startActivity(intent);
            }
        });

        btn_race.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(GymActivity.this,RaceActivity.class);
                startActivity(intent);
            }
        });

        btn_other_fitness.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GymActivity.this,OtherFitnessActivity.class);
                startActivity(intent);
            }
        });
    }
}
