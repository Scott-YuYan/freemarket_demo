package com.fwd.freemarker.common.controller;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

@Controller
public class TestController {

    FreeMarkerConfigurer freeMarkerConfigurer;

    @Autowired
    public TestController(FreeMarkerConfigurer freeMarkerConfigurer) {
        this.freeMarkerConfigurer = freeMarkerConfigurer;
    }

    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @ResponseBody
    @RequestMapping("/test")
    public void freemarker() throws IOException, TemplateException {
        Configuration configuration = freeMarkerConfigurer.getConfiguration();
        Template template = configuration.getTemplate("freemarker.ftl");
        Map<String, Object> root = new HashMap<>();
        root.put("name", "zhangsan");
        File resultFile = new File("C:\\Users\\ZR-YY\\Desktop\\outDir\\index.html");
        Writer writer = new OutputStreamWriter(
                new FileOutputStream(resultFile), StandardCharsets.UTF_8.displayName());
        template.process(root, writer);
        writer.flush();
        writer.close();
    }

    @RequestMapping("/index")
    public String freemarkerIndex(ModelMap modelMap) throws IOException, TemplateException {
        modelMap.addAttribute("name","魏建国");
        return "freemarker";
    }



}
