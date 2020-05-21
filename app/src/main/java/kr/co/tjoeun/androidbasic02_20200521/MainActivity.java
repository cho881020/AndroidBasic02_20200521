package kr.co.tjoeun.androidbasic02_20200521;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import kr.co.tjoeun.androidbasic02_20200521.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

        binding.okBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String inputName = binding.nameEdt.getText().toString();

                Intent intent = new Intent(mContext, UserInfoActivity.class);
                startActivity(intent);


            }
        });

    }

    @Override
    public void setValues() {

    }


}
