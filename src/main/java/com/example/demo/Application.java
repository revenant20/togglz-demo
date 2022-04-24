package com.example.demo;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Application {
    String id;
    String name;
}
