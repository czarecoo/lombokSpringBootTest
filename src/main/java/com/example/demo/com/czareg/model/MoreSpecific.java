package com.example.demo.com.czareg.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;
import lombok.ToString;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

@JsonInclude(NON_NULL)
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class MoreSpecific extends Specific {
    @NonNull
    private String vid;
    private String svid;

    public MoreSpecific(@NonNull String model, @NonNull String serial, @NonNull String uuid, @NonNull String vid) {
        super(model, serial, uuid);
        this.vid = vid;
    }

    public MoreSpecific(@NonNull String model, @NonNull String serial, String description, @NonNull String uuid, String moreDescription, @NonNull String vid, String svid) {
        super(model, serial, description, uuid, moreDescription);
        this.vid = vid;
        this.svid = svid;
    }
}