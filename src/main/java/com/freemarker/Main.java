package com.freemarker;

import freemarker.template.Configuration;
import freemarker.template.Template;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public void testFreeMarker() throws Exception {
        // 把freemarker的jar包添加到工程中
        //创建一个Configuration对象
        Configuration configuration = new Configuration(Configuration.getVersion());
        // 告诉config对象模板文件存放的路径。
        configuration.setDirectoryForTemplateLoading(new File("ftl directory absolute path"));
        // 设置config的默认字符集。一般是utf-8
        configuration.setDefaultEncoding("utf-8");
        //从config对象中获得模板对象。需要制定一个模板文件的名字。
        Template template = configuration.getTemplate("test.ftl");
        //创建模板需要的数据集。可以是一个map对象也可以是一个pojo，把模板需要的数据都放入数据集。
        Map root = new HashMap<>();
        root.put("hello", "hello freemarker");
        //创建一个Writer对象，指定生成的文件保存的路径及文件名。
        Writer out = new FileWriter(new File("out html file absolute path"));
        //调用模板对象的process方法生成静态文件。需要两个参数数据集和writer对象。
        template.process(root, out);
        //关闭writer对象。
        out.flush();
        out.close();
    }

}
