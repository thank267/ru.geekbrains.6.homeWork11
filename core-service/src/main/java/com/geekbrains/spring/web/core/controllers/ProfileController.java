package com.geekbrains.spring.web.core.controllers;

import com.geekbrains.spring.web.api.core.ProductDto;
import com.geekbrains.spring.web.api.core.ProfileDto;
import com.geekbrains.spring.web.api.exceptions.AppError;
import com.geekbrains.spring.web.core.exceptions.FieldsValidationError;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/profile")
@Tag(name = "Профили", description = "Методы работы с профилями пользователей")
public class ProfileController {

    @GetMapping
    @Operation(
            summary = "Запрос получения профиля пользователя по его имени",
            responses = {
                    @ApiResponse(
                            description = "Успешный ответ", responseCode = "200",
                            content = @Content(schema = @Schema(implementation = ProfileDto.class))
                    )
            },
            parameters = {
                    @Parameter(in = ParameterIn.HEADER, name = "username", description = "Имя пользователя", required = true, example= "Bob", schema = @Schema(implementation = String.class))
            }
    )
    public ProfileDto getCurrentUserInfo(@RequestHeader String username) {
        return new ProfileDto(username);
    }
}
