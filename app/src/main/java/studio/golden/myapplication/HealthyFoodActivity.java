package studio.golden.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class HealthyFoodActivity extends AppCompatActivity {

    private TextView mQuestionText;
    private ImageView mImageView;
    private Button mNextButton;
    private int mCurrentIndex = 0;
    private TrueFalse[] mQuestion = new TrueFalse[]{

            new TrueFalse(R.string.fruit_one),
            new TrueFalse(R.string.fruit_two),
            new TrueFalse(R.string.fruit_three),
            new TrueFalse(R.string.fruit_four),
            new TrueFalse(R.string.fruit_five),
            new TrueFalse(R.string.fruit_six),
            new TrueFalse(R.string.fruit_seven),
            new TrueFalse(R.string.fruit_eight),
            new TrueFalse(R.string.fruit_nine),
            new TrueFalse(R.string.fruit_ten),
            new TrueFalse(R.string.fruit_eleven),
            new TrueFalse(R.string.fruit_twelve),
            new TrueFalse(R.string.fruit_thirteen),
            new TrueFalse(R.string.fruit_fourteen),
            new TrueFalse(R.string.fruit_fifteen),
            new TrueFalse(R.string.fruit_sixteen),
            new TrueFalse(R.string.no_more_fruit),


    };
    private TrueFalseImages[] mImages = new TrueFalseImages[]{
            new TrueFalseImages(R.drawable.one),
            new TrueFalseImages(R.drawable.two),
            new TrueFalseImages(R.drawable.three),
            new TrueFalseImages(R.drawable.four),
            new TrueFalseImages(R.drawable.five),
            new TrueFalseImages(R.drawable.six),
            new TrueFalseImages(R.drawable.seven),
            new TrueFalseImages(R.drawable.eight),
            new TrueFalseImages(R.drawable.nine),
            new TrueFalseImages(R.drawable.ten),
            new TrueFalseImages(R.drawable.eleven),
            new TrueFalseImages(R.drawable.twelve),
            new TrueFalseImages(R.drawable.watermlon),
            new TrueFalseImages(R.drawable.no_more_fruits),
            new TrueFalseImages(R.drawable.yoga_image_fifteen),



    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_healthy_food);
        getSupportActionBar().setTitle("Healthy Fruits Category..");

        mImageView = (ImageView) findViewById(R.id.imageView_mediation);
        mQuestionText = (TextView) findViewById(R.id.text_meditation);
        final int Images = mImages[mCurrentIndex].getmImages();
        final int Question = mQuestion[mCurrentIndex].getmQuestion();
        mQuestionText.setText(Question);
        mImageView.setImageResource(Images);

        mNextButton = (Button) findViewById(R.id.button_next);
        mNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HealthyFoodActivity.this,"Next Page Open..",Toast.LENGTH_SHORT).show();
                mCurrentIndex = (mCurrentIndex + 1) % mQuestion.length & mImages.length;

                int question = mQuestion[mCurrentIndex].getmQuestion();
                int images = mImages[mCurrentIndex].getmImages();
                if((mCurrentIndex + 1) % mQuestion.length == 14 && (mCurrentIndex + 1) % mImages.length == 14){
                    finish();
                    Toast.makeText(HealthyFoodActivity.this,"Healthy Fruits Category..",Toast.LENGTH_SHORT).show();
                }
                mQuestionText.setText(question);
                mImageView.setImageResource(images);

            }
        });
    }
}
