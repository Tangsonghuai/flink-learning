package com.zhisheng.data.sources.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Desc:
 * Created by zhisheng on 2019-02-17
 * Blog: http://www.54tianzhisheng.cn/tags/Flink/
 */

@Data       // 配合lombok 省略set，get方法
@AllArgsConstructor    //  有参构造器
@NoArgsConstructor     //  无参构造器
public class Student {
    public int id;
    public String name;
    public String password;
    public int age;
}
