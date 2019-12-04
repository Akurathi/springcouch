package com.example.springcouch.model;

import com.couchbase.client.java.repository.annotation.Field;
import com.couchbase.client.java.repository.annotation.Id;
import lombok.Data;
import org.springframework.data.couchbase.core.mapping.Document;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Document
@Data
public class Person {
    @Id
    private String id;

    @Field
    @NotNull
    private String firstName;

    @Field
    @NotNull
    private String lastName;

    @Field
    @NotNull
    private LocalDateTime created;

    @Field
    private LocalDateTime updated;

    // standard getters and setters
}
