package wvsdev.backendpicpayprojeto.dtos;

import wvsdev.backendpicpayprojeto.domain.user.enums.UserType;

import java.math.BigDecimal;

public record UserDTO(
        String firstName,
        String lastName,
        String document,
        BigDecimal balance,
        String email,
        String password,
        UserType userType) {
}
