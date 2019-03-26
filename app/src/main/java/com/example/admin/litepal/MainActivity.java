package com.example.admin.litepal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import org.litepal.LitePal;
import org.litepal.LitePalApplication;

public class MainActivity extends AppCompatActivity {

    Button bt_create;
    Button bt_add;
    Button bt_update;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LitePal.initialize(this);
        setContentView(R.layout.activity_main);
//        bt_create = (Button) findViewById(R.id.button1);
        bt_add = (Button) findViewById(R.id.button2);
        bt_update = (Button) findViewById(R.id.button3);
        bt_update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //更新数据
                Book book = new Book();
                book.setName("简爱");
                book.setAuthor("阿加西");
                book.setId(2);
                book.setPages(600);
                book.save();
                book.setName("终身成长");
                book.save();
            }
        });

        bt_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //添加数据
                Book book = new Book();
                book.setName("简爱");
                book.setAuthor("阿加西");
                book.setId(2);
                book.setPages(600);
                book.save();  //无需创建数据库，此方法已经创建了数据库和表格


                Toast.makeText(MainActivity.this, "添加数据成功", Toast.LENGTH_LONG).show();
            }
        });

//        bt_add.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //添加数据
//                Book book = new Book();
//                book.setName("简爱");
//                book.setAuthor("阿加西");
//                book.setId(2);
//                book.setPages(600);
//                book.save();  //无需创建数据库，此方法已经创建了数据库和表格
//
//
//                Toast.makeText(MainActivity.this, "添加数据成功", Toast.LENGTH_LONG).show();
//            }
//        });

//        bt_create.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                LitePal.getDatabase(); //创建数据库文件,并生成表格
//                Toast.makeText(MainActivity.this, "数据库创建成功", Toast.LENGTH_LONG).show();
//
//            }
//        });

    }
}
