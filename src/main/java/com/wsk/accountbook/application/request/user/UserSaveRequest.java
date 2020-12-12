package com.wsk.accountbook.application.request.user;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@RequiredArgsConstructor
@Component
public class UserSaveRequest {
    private Long id;
    private String name;
}
