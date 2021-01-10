package com.example.demo.com.czareg.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

@JsonInclude(NON_NULL)
@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class Specific {
    @JsonUnwrapped
    @NonNull
    private Base base;
    @NonNull
    private String uuid;
    private String moreDescription;
}
