package com.baanBaini.BaanBaini.user.model.entity;

import com.baanBaini.BaanBaini.configuration.security.Authority;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
@Document(collection = "users2")
public class UserEntity2 implements UserDetails {

    //private String username;
    private String password;
    private List<String> authorities;
    private boolean isAccountExpired;
    private boolean isAccountLocked;
    private boolean isCredentialsExpired;
    private boolean isAccountEnabled;
    private String name;
    private String email;
    private Date joiningDate;
    private String publicUserId;

    @Override
    public Collection<Authority> getAuthorities() {
        List<Authority> authorityList = new ArrayList<>();
        authorities.forEach(auth -> authorityList.add(new Authority(auth)));
        return authorityList;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return publicUserId;
    }

    @Override
    public boolean isAccountNonExpired() {
        return !isAccountExpired;
    }

    @Override
    public boolean isAccountNonLocked() {
        return !isAccountLocked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return !isCredentialsExpired;
    }

    @Override
    public boolean isEnabled() {
        return isAccountEnabled;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAuthorities(ArrayList<String> authorities) {
        this.authorities = authorities;
    }

    public boolean isAccountExpired() {
        return isAccountExpired;
    }

    public void setAccountExpired(boolean accountExpired) {
        isAccountExpired = accountExpired;
    }

    public boolean isAccountLocked() {
        return isAccountLocked;
    }

    public void setAccountLocked(boolean accountLocked) {
        isAccountLocked = accountLocked;
    }

    public boolean isCredentialsExpired() {
        return isCredentialsExpired;
    }

    public void setCredentialsExpired(boolean credentialsExpired) {
        isCredentialsExpired = credentialsExpired;
    }

    public boolean isAccountEnabled() {
        return isAccountEnabled;
    }

    public void setAccountEnabled(boolean accountEnabled) {
        isAccountEnabled = accountEnabled;
    }

    public String getPublicUserId() {
        return publicUserId;
    }

    public void setPublicUserId(String publicUserId) {
        this.publicUserId = publicUserId;
    }
}