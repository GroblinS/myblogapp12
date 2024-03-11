package com.myblogapp12;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Login1 {
    public static void main(String[] args) {
        List<Login> logins = Arrays.asList(
                new Login("mike","testing"),
                new Login("stalling","testing"),
                new Login("adam","testing")
        );
        List<LoginDto> dtos = logins.stream().map(login -> mapToDto(login)).collect(Collectors.toList());
        System.out.println(dtos);
    }
    static LoginDto mapToDto(Login login){
        LoginDto dto = new LoginDto();
        dto.setUsername(login.getUsername());
        dto.setPassword(login.getPassword());
        return dto;
    }
}
