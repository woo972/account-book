package com.wsk.accountbook.domain.model.user

import com.wsk.accountbook.domain.model.vo.user.UserName
import spock.lang.Specification

class UserNameTest extends Specification {

    UserName sut

    def "test create user name throws exception"(){
        given:
        String name = NAME
        when:
        sut = UserName.from(name)
        then:
        thrown(IllegalArgumentException)
        where:
        NAME << [null, "", "1234567891011"]
    }

    def "test create user name happy case"(){
        given:
        String name = NAME
        when:
        sut = UserName.from(name)
        then:
        sut.getValue() == NAME
        where:
        NAME << [" a", "a ", "a"]
    }
}
