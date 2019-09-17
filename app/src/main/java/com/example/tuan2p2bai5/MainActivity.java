package com.example.tuan2p2bai5;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    EditText etid,etname;
    Button btnnhap;
    RadioGroup radiogroup;
    ListView listView;
    ArrayList<Employee> employeeArrayList=new ArrayList<Employee>();
    ArrayAdapter<Employee> arrayAdapter=null;
    Employee employee=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etid=(EditText)findViewById(R.id.editText_manv);
        etname=(EditText)findViewById(R.id.editText_tennv);
        btnnhap=(Button)findViewById(R.id.button_nhapnv);
        radiogroup=(RadioGroup)findViewById(R.id.radiogroup);
        listView=(ListView)findViewById(R.id.list);

        arrayAdapter =new ArrayAdapter<Employee>(this,android.R.layout.simple_list_item_1, employeeArrayList);
        listView.setAdapter(arrayAdapter);
        btnnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nhap();
            }
        });
    }

    private void nhap() {
        int radId=radiogroup.getCheckedRadioButtonId();
        String id=etid.getText()+"";
        String name=etname.getText()+"";
        if(radId==R.id.radio_chinhthuc){
            employee=new EmployeeFullTime();
        }
        else{
            employee=new EmployeePartTime();
        }
        employee.setId(id);
        employee.setName(name);
        arrayAdapter.add(employee);
        arrayAdapter.notifyDataSetChanged();
    }
}