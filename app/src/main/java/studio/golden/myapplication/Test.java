package studio.golden.myapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.textclassifier.TextClassificationSessionFactory;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Test extends AppCompatActivity {

   // TextView t;
    Button btn_gym;
    Button btn_meditation;
    Button btn_healthy_food;
    Button btn_brain_fitness;
    Button btn_finance;
    Button btn_comfort;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

       /* t= (TextView) findViewById(R.id.my_text);
        Typeface myCustomFont=Typeface.createFromAsset(getAssets(),"fonts/Raleway-ExtraBold.ttf");
        t.setTypeface(myCustomFont);*/

       btn_gym = (Button) findViewById(R.id.button_gym);
       btn_meditation = (Button) findViewById(R.id.button_meditation);
       btn_healthy_food = (Button) findViewById(R.id.button_healthy_food);
       btn_brain_fitness = (Button) findViewById(R.id.button_brain);
       btn_finance = (Button) findViewById(R.id.button_finance);
       btn_comfort = (Button) findViewById(R.id.button_comfort);

      btn_gym.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent intent = new Intent(Test.this,GymActivity.class);
              startActivity(intent);
              Toast.makeText(Test.this,"GYM Category Choose",Toast.LENGTH_SHORT).show();
          }
      });
      btn_meditation.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent intent = new Intent(Test.this,Meditation.class);
              startActivity(intent);
              Toast.makeText(Test.this,"Meditation And Yoga Category Choose",Toast.LENGTH_SHORT).show();
          }
      });
      btn_healthy_food.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent intent = new Intent(Test.this,HealthyFoodActivity.class);
              startActivity(intent);
              Toast.makeText(Test.this,"Healthy Food Category Choose..",Toast.LENGTH_SHORT).show();
          }
      });

      btn_brain_fitness.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent intent = new Intent(Test.this,BrainFitnessActivity.class);
              startActivity(intent);
              Toast.makeText(Test.this,"Brain Fitness Activity Choose",Toast.LENGTH_SHORT).show();
              startActivity(intent);
              Toast.makeText(Test.this,"Brain Fitness Activity Choose",Toast.LENGTH_SHORT).show();
          }
      });

    }

    @Override
    public void onBackPressed() {

        new AlertDialog.Builder(this)
                .setTitle("Really Exit?")
                .setMessage("Are you sure you want to exit?")
                .setNegativeButton(android.R.string.no, null)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Test.super.onBackPressed();
                        quit();
                    }
                }).create().show();
    }


    public void quit() {
        Intent start = new Intent(Intent.ACTION_MAIN);
        start.addCategory(Intent.CATEGORY_HOME);
        start.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        start.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(start);
    }
}
