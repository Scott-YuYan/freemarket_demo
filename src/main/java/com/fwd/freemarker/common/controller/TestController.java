package com.fwd.freemarker.common.controller;

import com.fwd.freemarker.common.constant.FreeMarkerConstant;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @ResponseBody
    @RequestMapping("/test")
    public void freemarker() throws IOException, TemplateException {
        Configuration configuration = new Configuration(Configuration.VERSION_2_3_29);
        configuration.setDirectoryForTemplateLoading(
                new File(FreeMarkerConstant.TEMPLATE_PATH)
        );
        configuration.setDefaultEncoding("UTF-8");
        configuration.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
        configuration.setLogTemplateExceptions(false);
        configuration.setLogTemplateExceptions(true);
        configuration.setFallbackOnNullLoopVariable(false);
        Map<String, Object> root = new HashMap<>();
        root.put("name", "zhangsan");
        Template template = configuration.getTemplate("freemarker.ftl");
        File resultFile = new File("C:\\Users\\ZR-YY\\Desktop\\outDir\\index.html");
        Writer writer = new OutputStreamWriter(
                new FileOutputStream(resultFile), StandardCharsets.UTF_8.displayName());
        template.process(root,writer);
        System.out.println("模板创建成功");
        writer.flush();
        writer.close();
    }
}
