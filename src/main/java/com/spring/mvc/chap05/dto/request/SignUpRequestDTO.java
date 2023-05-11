package com.spring.mvc.chap05.dto.request;

import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Setter @Getter
@ToString @EqualsAndHashCode
@NoArgsConstructor
public class SignUpRequestDTO {
    @NotBlank //회원가입시에 필수값 설정
    private String account;
    @NotBlank
    private String password;
    @NotBlank
    @Size(min = 2, max = 6) //필수 사이즈 설정
    private String name;
    @NotBlank
    @Email
    private String email;

}
