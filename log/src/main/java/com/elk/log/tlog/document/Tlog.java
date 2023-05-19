package com.elk.log.tlog.document;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

import java.time.LocalDateTime;

@Document(indexName = "test")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Tlog {

    @Id
    private String id;

    @Field(name = "@version")
    private String version;

    @Field(name = "@timestamp")
    private LocalDateTime timestamp;

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



}
