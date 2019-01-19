package com.mario6.paper.config;

import static com.mario6.paper.config.PaperProperties.PREFIX;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * PaperShowConfiguration
 *
 * @author Mario Luo
 * @date 2019.01.19 13:28
 */
@Component
@ConfigurationProperties(prefix = PREFIX)
@Data
public class PaperProperties {

    public static final String PREFIX = "paper-show";

    public static final String PROJECT_META_FILE_NAME = "project.json";

    /** 数据存储目录 */
    private String workDir;

}
