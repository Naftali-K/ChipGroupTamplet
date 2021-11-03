package com.nk.chipgrouptamplet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.material.chip.ChipGroup;

public class MainActivity extends AppCompatActivity {

    ChipGroup chipGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chipGroup = findViewById(R.id.chip_group);

        switch (chipGroup.getCheckedChipId()){
            case R.id.all_chip:
                Toast.makeText(getBaseContext(),"option ALL choised", Toast.LENGTH_SHORT).show();
                break;
            case R.id.for_you_chip:
                Toast.makeText(getBaseContext(),"option FOR YOU choised", Toast.LENGTH_SHORT).show();
                break;
            case R.id.information_chip:
                Toast.makeText(getBaseContext(),"option INFORMATION choised", Toast.LENGTH_SHORT).show();
                break;
            default:
                Toast.makeText(getBaseContext(),"NOT have that kind option", Toast.LENGTH_SHORT).show();
        }

        chipGroup.setOnCheckedChangeListener(new ChipGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(ChipGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.all_chip:
                        Toast.makeText(getBaseContext(),"option ALL choised", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.for_you_chip:
                        Toast.makeText(getBaseContext(),"option FOR YOU choised", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.information_chip:
                        Toast.makeText(getBaseContext(),"option INFORMATION choised", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        Toast.makeText(getBaseContext(),"NOT have that kind option", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}