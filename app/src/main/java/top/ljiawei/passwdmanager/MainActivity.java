package top.ljiawei.passwdmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import top.ljiawei.passwdmanager.utils.dbUtil;

public class MainActivity extends AppCompatActivity {

    private dbUtil dbHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dbHelper = new dbUtil(this,"PassMg.db",null,1);

        Button button = findViewById(R.id.submit_1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SQLiteDatabase db = dbHelper.getWritableDatabase(); //创建或打开数据库

                /*将获取的EditText数据传到后台服务器*/
                EditText et_id = findViewById(R.id.edit_id);
                EditText et_pass = findViewById(R.id.edit_pass);
                String id = et_id.getText().toString();
                String pass = et_pass.getText().toString();
                ContentValues values = new ContentValues();
                values.put("id",id);    //组装第一条记录
                values.put("pass",pass);
                db.insert("PassMg",null,values);  //插入记录
                values.clear();     //清空values
            }
        });
    }
}