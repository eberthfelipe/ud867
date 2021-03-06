package udacity.android.com.androidlibrary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class AndroidLibraryMainActivity extends AppCompatActivity {

    public static final String JOKER_TEXT = "joker_text";
//    private ActivityMainBinding mAndroidLibraryBinding;
    private TextView mTextViewJoke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
        String strJoke =  getIntent().getStringExtra(JOKER_TEXT);
//        mAndroidLibraryBinding.setJokeText(strJoke);
        mTextViewJoke.setText(strJoke);
//        Toast.makeText(this, strJoke, Toast.LENGTH_SHORT).show();
    }

    public void init(){
//        mAndroidLibraryBinding = DataBindingUtil.setContentView(this, R.layout.activity_main_android_library);
        setContentView(R.layout.activity_main_android_library);
        mTextViewJoke = findViewById(R.id.tv_joker);
    }
}