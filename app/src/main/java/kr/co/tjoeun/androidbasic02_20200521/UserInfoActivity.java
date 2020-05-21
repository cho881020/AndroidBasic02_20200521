package kr.co.tjoeun.androidbasic02_20200521;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import kr.co.tjoeun.androidbasic02_20200521.databinding.ActivityUserInfoBinding;

public class UserInfoActivity extends BaseActivity {

    ActivityUserInfoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_user_info);
        setupEvents();
        setValues();
    }


    @Override
    public void setupEvents() {

    }

    @Override
    public void setValues() {

        String name = getIntent().getStringExtra("userName");

        binding.userNameTxt.setText(name);

    }
}
