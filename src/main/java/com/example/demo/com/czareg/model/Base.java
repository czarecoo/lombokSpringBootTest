package com.example.demo.com.czareg.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.*;

@JsonInclude(NON_NULL)
@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class Base {
    /**
     * Needed by lombok in extending class. Do not use.
     */
    Base() {
    }

    @NonNull
    private String model;
    @NonNull
    private String serial;
    private String description;
}
