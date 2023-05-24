package com.elk.log.tlog.document;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

@Document(indexName = "test")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Tlog {

    @Id
    private String id;

    @Field(name = "@version")
    private String version;

    @Field(name = "@timestamp")
    private Long timestamp;

    @Field(name = "level")
    private String level;

    @Field(name = "logger_name")
    private String loggerName;

    @Field(name = "thread_name")
    private String threadName;

    @Field(name = "level_value")
    private Long levelValue;

    @Field(name = "message")
    private String message;

    @Builder
    public Tlog(String id, String version, Long timestamp, String level,
                String loggerName, String threadName, Long levelValue, String message) {
        this.id = id;
        this.version = version;
        this.timestamp = timestamp;
        this.level = level;
        this.loggerName = loggerName;
        this.threadName = threadName;
        this.levelValue = levelValue;
        this.message = message;
    }

}
