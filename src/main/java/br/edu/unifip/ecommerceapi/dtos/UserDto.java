package br.edu.unifip.ecommerceapi.dtos;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UserDto {

    @NotBlank
    private String name;

    @NotNull
    private int age;

}
