package cn.com.logutil;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import cn.com.logutils.LogUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //设置是否打印
        LogUtil.init(true);
        //示例
        LogUtil.v("-----v----");
        LogUtil.d("----d-----");
        LogUtil.i("----i-----");
        LogUtil.w("----w-----");
        LogUtil.e("----e-----");
        LogUtil.a("----a-----");
        LogUtil.xml("<note>\n" +
                "<to>George</to>\n" +
                "<from>John</from>\n" +
                "<heading>Reminder</heading>\n" +
                "<body>Don't forget the meeting!</body>\n" +
                "</note>");
        LogUtil.json("{\"name\":\"Michael\", \"birthday\":{\"month\":8,\"day\":26}}");
    }
}
