package com.maven.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCryptPasswordEncoderUtils {
    @Autowired
    private static BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

    public static String encode(String password){
        return bCryptPasswordEncoder.encode(password);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            String encode = BCryptPasswordEncoderUtils.encode("123");
            System.out.println("encode = " + encode);
        }
    }
}
