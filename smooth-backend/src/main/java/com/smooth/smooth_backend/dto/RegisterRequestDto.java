package com.smooth.smooth_backend.dto;

import com.smooth.smooth_backend.entity.User;
import lombok.Data;
import jakarta.validation.constraints.*;

@Data
public class RegisterRequestDto {

    @NotBlank(message = "이메일을 입력해주세요.")
    @Email(message = "이메일 형식이 올바르지 않습니다.")
    private String email;

    @NotBlank(message = "비밀번호를 입력해주세요.")
    @Size(min = 8, message = "비밀번호는 8자 이상이어야 합니다.")
    private String password;

    @NotBlank(message = "이름을 입력해주세요.")
    private String name;

    @NotBlank(message = "전화번호를 입력해주세요.")
    private String phone;

    @NotNull(message = "성별을 선택해주세요.")
    private User.Gender gender;

    private User.BloodType bloodType; // 선택사항

    private String emergencyContact1;
    private String emergencyContact2;
    private String emergencyContact3;
}