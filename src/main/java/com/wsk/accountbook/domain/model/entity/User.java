package com.wsk.accountbook.domain.model.entity;

import com.wsk.accountbook.domain.BaseTimeEntity;
import com.wsk.accountbook.domain.model.vo.user.UserName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class User extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;
    @Embedded
    @Column(name = "user_name")
    private UserName name;

    public static User from(UserName name) {
        return new User(name);
    }

    private User (UserName name){
        this.name = name;
    }
}
