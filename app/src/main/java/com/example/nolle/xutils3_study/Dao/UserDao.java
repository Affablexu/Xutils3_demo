package com.example.nolle.xutils3_study.Dao;


import android.util.Log;

import com.example.nolle.xutils3_study.Entity.User;
import com.example.nolle.xutils3_study.Utils.DBUtils;

import org.xutils.DbManager;
import org.xutils.ex.DbException;

import java.util.ArrayList;


import static android.content.ContentValues.TAG;

/**
 * Created by Mlle Yh on 2/21/2018.
 */

public class UserDao {
    public void saveUser() {

        DbManager dbManager = DBUtils.getDbManager();

        ArrayList<User> users = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setAge(i);
            if (i < 5) {
                user.setName("小明");
            } else {
                user.setName("小红");
            }
            users.add(user);
        }
        try {
            dbManager.save(users);//保存实体类或实体类的List到数据库
            dbManager.saveOrUpdate(users);//保存或更新实体类或实体类的List到数据库, 根据id对应的数据是否存在.
            dbManager.saveBindingId(users);//保存实体类或实体类的List到数据库,如果该类型的id是自动生成的, 则保存完后会给id赋值.
            Log.e(TAG, "保存数据成功");
        } catch (DbException e) {
            e.printStackTrace();
            Log.e(TAG, "保存数据失败:" + e.toString());
        }

    }

}


