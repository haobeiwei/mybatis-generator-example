package com.hao.mapper;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import lombok.extern.slf4j.Slf4j;

/**
 * Mybatis代码生成
 * @version 1.0.0
 */
@Slf4j
public class MybatisGeneratorCodeTest {

    @Test
    public void run() {
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;

        List<String> configFileList = new ArrayList<>();
        configFileList.add("/generatorConfig-user.xml");

        configFileList.stream().forEach((configFile) -> {
            try {
                Resource resource = new ClassPathResource(configFile);
                ConfigurationParser cp = new ConfigurationParser(warnings);
                Configuration config = cp.parseConfiguration(resource.getFile());
                DefaultShellCallback callback = new DefaultShellCallback(overwrite);
                MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
                myBatisGenerator.generate(null);
            } catch (Exception e) {
                log.error("mybatis generator code error!", e);
                throw new RuntimeException(e);
            }
        });
    }
}
