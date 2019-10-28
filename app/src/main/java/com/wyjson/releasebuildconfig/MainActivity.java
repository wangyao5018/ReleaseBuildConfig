package com.wyjson.releasebuildconfig;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.wyjson.releasebuildconfig.constant.AppConstant;

/**
 * Android打包设置Debug与Release环境切换
 *
 * @author Wyjson
 * @version 1
 * @date 2019-10-28 14:35
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvContent = findViewById(R.id.tv_content);
        StringBuilder buff = new StringBuilder();
        buff.append("\n");

        buff.append("Build_Type: ");
        buff.append(AppConstant.BUILD_TYPE);
        buff.append("\n");
        buff.append("\n");
        buff.append("\n");

        buff.append("api_url : ");
        buff.append(AppConstant.API_URL);
        buff.append("\n");

        buff.append("api_user_url : ");
        buff.append(AppConstant.API_USER_URL);
        buff.append("\n");

        buff.append("shop_url : ");
        buff.append(AppConstant.SHOP_URL);
        buff.append("\n");

        buff.append("order_detail_url : ");
        buff.append(String.format(AppConstant.ORDER_DETAIL_URL, 123456));
        buff.append("\n");

        buff.append("favour_url : ");
        buff.append(AppConstant.FAVOUR_URL);
        buff.append("\n");

        tvContent.setText(buff.toString());
    }
}
