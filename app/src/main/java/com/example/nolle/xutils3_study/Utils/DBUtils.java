package com.example.nolle.xutils3_study.Utils;

import org.xutils.DbManager;
import org.xutils.db.table.TableEntity;
import org.xutils.x;

/**
 * Created by Mlle Yh on 2/21/2018.
 */

public class DBUtils {
    public static DbManager.DaoConfig getDbConfig() {

        DbManager.DaoConfig daoConfig = new DbManager.DaoConfig()
                .setDbName("test.db")
                .setDbVersion(1)
                .setDbOpenListener(new DbManager.DbOpenListener() {
                    @Override
                    public void onDbOpened(DbManager db) {
                        // 开启WAL, 对写入加速提升巨大
                        db.getDatabase().enableWriteAheadLogging();
                    }
                })
                .setDbUpgradeListener(new DbManager.DbUpgradeListener() {
                    @Override
                    public void onUpgrade(DbManager db, int oldVersion, int newVersion) {
                        // TODO: ...
                        // db.addColumn(...);
                        // db.dropTable(...);
                        // ...
                        // or
                        // db.dropDb();
                    }
                });
        return daoConfig;
    }

    public static DbManager getDbManager() {
        DbManager db = x.getDb(getDbConfig());
        return db;
    }
}
