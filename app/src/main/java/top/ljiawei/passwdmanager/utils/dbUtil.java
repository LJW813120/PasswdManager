package top.ljiawei.passwdmanager.utils;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

/*数据库类 数据库的创建*/
public class dbUtil extends SQLiteOpenHelper {

    public static final String CREATE_PASSMG = "create table PassMg(id text primary key,pass text)"; //SQL语句
    private Context mContext;
    public dbUtil(Context context, String name,SQLiteDatabase.CursorFactory factory, int version) {  //构造方法，获取参数
        super(context, name,factory,version);
        mContext = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {  //重写父类方法
        db.execSQL(CREATE_PASSMG);     //执行SQL语句
        Toast.makeText(mContext,"Create succeeded !",Toast.LENGTH_SHORT).show(); //返回数据库创建或打开成功信息提示
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {  //重写父类方法

    }
}
