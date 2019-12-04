package com.example.springcouch.config;

import java.util.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;

@Configuration
public class MyCouchbaseConfig extends AbstractCouchbaseConfiguration {

    @Override
    protected List<String> getBootstrapHosts() {
        return Arrays.asList("localhost");
    }

    @Override
    protected String getBucketName() {
        return "bucket1";
    }

    @Override
    protected String getBucketPassword() {
        return "admin123";
    }

    @Override
    protected String getUsername() {
        return "Administrator";
    }
}

