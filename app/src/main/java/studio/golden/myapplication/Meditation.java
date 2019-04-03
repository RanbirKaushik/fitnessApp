package studio.golden.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Meditation extends AppCompatActivity {

    private TextView mQuestionText;
    private ImageView mImageView;
    private Button mNextButton;
    private int mCurrentIndex = 0;
    private TrueFalse[] mQuestion = new TrueFalse[]{

            new TrueFalse(R.string.yoga_one),
            new TrueFalse(R.string.yoga_two),
            new TrueFalse(R.string.yoga_three),
            new TrueFalse(R.string.yoga_four),
            new TrueFalse(R.string.yoga_five),
            new TrueFalse(R.string.yoga_six),
            new TrueFalse(R.string.yoga_seven),
            new TrueFalse(R.string.yoga_eight),
            new TrueFalse(R.string.yoga_nine),
            new TrueFalse(R.string.yoga_ten),
            new TrueFalse(R.string.yoga_eleven),
            new TrueFalse(R.string.yoga_twelve),
            new TrueFalse(R.string.yoga_thirteen),
            new TrueFalse(R.string.yoga_fourteen),
            new TrueFalse(R.string.yoga_fifteen),
            new TrueFalse(R.string.yoga_sixteen),
            new TrueFalse(R.string.no_more),


    };
    private TrueFalseImages[] mImages = new TrueFalseImages[]{
            new TrueFalseImages(R.drawable.yoga_image_one),
            new TrueFalseImages(R.drawable.yoga_imge_two),
            new TrueFalseImages(R.drawable.yoga_image_three),
            new TrueFalseImages(R.drawable.yoga_image_four),
            new TrueFalseImages(R.drawable.yoga_image_five),
            new TrueFalseImages(R.drawable.yoga_image_six),
            new TrueFalseImages(R.drawable.yoga_image_seven),
            new TrueFalseImages(R.drawable.yoga_image_eight),
            new TrueFalseImages(R.drawable.yoga_image_nine),
            new TrueFalseImages(R.drawable.yoga_image_ten),
            new TrueFalseImages(R.drawable.yoga_image_eleven),
            new TrueFalseImages(R.drawable.yoga_image_twelvw),
            new TrueFalseImages(R.drawable.yoga_image_thirteen),
            new TrueFalseImages(R.drawable.no_moer_yoga),
            new TrueFalseImages(R.drawable.yoga_image_fifteen),



    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meditation);
        getSupportActionBar().setTitle("Yoga Category....");

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
                Toast.makeText(Meditation.this,"Next Page Open..",Toast.LENGTH_SHORT).show();
                mCurrentIndex = (mCurrentIndex + 1) % mQuestion.length & mImages.length;

                int question = mQuestion[mCurrentIndex].getmQuestion();
                int images = mImages[mCurrentIndex].getmImages();
                if((mCurrentIndex + 1) % mQuestion.length == 14 && (mCurrentIndex + 1) % mImages.length == 14){
                    finish();
                    Toast.makeText(Meditation.this,"Mediation Course Complete..",Toast.LENGTH_SHORT).show();
                }
                mQuestionText.setText(question);
                mImageView.setImageResource(images);

            }
        });
    }
}
