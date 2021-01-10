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
public class Specific extends Base {
    /**
     * Needed by lombok in extending class. Do not use.
     */
    Specific() {
    }

    public Specific(@NonNull String model, @NonNull String serial, @NonNull String uuid) {
        super(model, serial);
        this.uuid = uuid;
    }

    public Specific(@NonNull String model, @NonNull String serial, String description, @NonNull String uuid, String moreDescription) {
        super(model, serial, description);
        this.uuid = uuid;
        this.moreDescription = moreDescription;
    }

    @NonNull
    private String uuid;
    private String moreDescription;
}

