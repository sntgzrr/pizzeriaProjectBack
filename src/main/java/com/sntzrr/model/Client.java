package com.sntzrr.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client {
    private int id;
    private String name;
    private String lastname;
    private String email;
    private String password;
    private String rol;
}
