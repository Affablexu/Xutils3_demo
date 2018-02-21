package com.example.nolle.xutils3_study.Entity;

import org.xutils.db.annotation.Column;
import org.xutils.db.annotation.Table;

/**
 * Created by Mlle Yh on 2/21/2018.
 */

    @Table(name = "user")
    public class User {
        //Column注解指明了这个属性在数据表中状态
        @Column(name = "id", isId = true)
        private int id;
        @Column(name = "name")
        private String name;
        @Column(name = "age")
        private int age;
        @Column(name = "sex")
        private boolean sex;

        public User() {
        }

        public User(int age, String name, boolean sex) {
            this.age = age;
            this.name = name;
            this.sex = sex;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public boolean isSex() {
            return sex;
        }

        public void setSex(boolean sex) {
            this.sex = sex;
        }

        @Override
        public String toString() {
            return "User{" +
                    "age=" + age +
                    ", id=" + id +
                    ", name='" + name + '\'' +
                    ", sex=" + sex +
                    '}';
        }
    }
