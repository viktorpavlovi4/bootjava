package ru.javaops.bootjava.model;

import org.springframework.security.core.GrantedAuthority;

    // https://stackoverflow.com/questions/19525380/difference-between-role-and-grantedauthority-in-spring-security/19542316#19542316
public enum Role implements GrantedAuthority {
    USER,
    ADMIN;

    @Override
    public String getAuthority() {
        //   https://stackoverflow.com/a/19542316/548473
        return "ROLE_" + name();
    }
}