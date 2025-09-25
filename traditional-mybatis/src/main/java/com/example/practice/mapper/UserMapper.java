package com.example.practice.mapper;

import com.example.practice.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {

    /**
     * DB에서 userName을 기반으로 사용자 정보를 조회합니다.
     * SQL Mapper XML 파일에서 쿼리가 정의됩니다.
     * @param userName 로그인 ID
     * @return DB에서 조회된 AuthUser 객체
     */
    User findByUserName(@Param("userName") String userName);
    
    // 이외에도 회원가입(insert), 정보 수정(update) 등의 메서드가 추가될 수 있습니다.
}