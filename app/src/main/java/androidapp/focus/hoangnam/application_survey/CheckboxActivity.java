package androidapp.focus.hoangnam.application_survey;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by HoangNam on 12/23/2017.
 */

public class CheckboxActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox_survey);
    }

    public void next_step_2(View view){
        Intent intent = new Intent(CheckboxActivity.this, InputTextActivity.class);
        startActivity(intent);
    }
}