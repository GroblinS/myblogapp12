package com.myblogapp12.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class SignupDto {
    private String name;
    private String username;
    private String email;
    private String password;
}
