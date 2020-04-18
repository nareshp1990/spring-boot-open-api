package com.open.api.contact;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Contact implements Serializable {

    private static final long serialVersionUID = 4048798961366546485L;

    @Schema(description = "Unique identifier of the Contact.",
            example = "1", required = true)
    private Long id;

    @Schema(description = "Name of the contact.",
            example = "Jessica Abigail", required = true)
    private String name;

    @Schema(description = "Phone number of the contact.",
            example = "62482211", required = false)
    private String phone;

    @Schema(description = "Email address of the contact.",
            example = "jessica@ngilang.com", required = false)
    private String email;

    @Schema(description = "Address line 1 of the contact.",
            example = "888 Constantine Ave, #54", required = false)
    private String address1;

    @Schema(description = "Address line 2 of the contact.",
            example = "San Angeles", required = false)
    private String address2;

    @Schema(description = "Address line 3 of the contact.",
            example = "Florida", required = false)
    private String address3;

    @Schema(description = "Postal code of the contact.",
            example = "32106", required = false)
    private String postalCode;

    @Schema(description = "Notes about the contact.",
            example = "Meet her at Spring Boot Conference", required = false)
    private String note;

}