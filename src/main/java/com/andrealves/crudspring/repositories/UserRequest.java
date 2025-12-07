package com.andrealves.crudspring.repositories;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

import java.util.UUID;

public record UserRequest(UUID id, @NotBlank String name, @NotBlank @Email String email) {
}
