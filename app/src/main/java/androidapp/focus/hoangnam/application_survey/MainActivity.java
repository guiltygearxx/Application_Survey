package androidapp.focus.hoangnam.application_survey;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.tab_menu, menu);
        return super.onCreateOptionsMenu(menu);

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId())
        {
            case R.id.language_en:
                // chuyển toàn bộ sang tiếng anh
                break;
            case R.id.language_vn:
                 // chuyển toàn bộ sang tiếng việt
                break;
            case R.id.change_background:

                // hiển thị popup chọn ngôn ngữ
                break;
        }
        return true;
    }


    public void next_step_1(View view){
        Intent intent = new Intent(MainActivity.this, CheckboxActivity.class);
        startActivity(intent);
    }
}
