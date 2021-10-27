package td.book.tdbook.security.services;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.fasterxml.jackson.annotation.JsonIgnore;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.oauth2.core.user.OAuth2User;

import td.book.tdbook.model.User;

public class UserDetailsImpl implements UserDetails, OAuth2User {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String username;

    private String email;

    @JsonIgnore
    private String password;

    private Collection<? extends GrantedAuthority> authorities;

    private Map<String, Object> attributes;

    public UserDetailsImpl(Long id, String username, String email, String password,
            Collection<? extends GrantedAuthority> authorities) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.authorities = authorities;
    }

    public static UserDetailsImpl build(User user) {

        // List<GrantedAuthority> authorities = user.getUserRoles().stream()
        //     .map(role -> new SimpleGrantedAuthority(role.getRole().getName().name()))
        //     .collect(Collectors.toList());

        // return new UserDetailsImpl(
        //     user.getId(),
        //     user.getUserName(),
        //     user.getEmail(),
        //     user.getPassword(),
        //     authorities);
        return null;

    }

    public static UserDetailsImpl build(User user, Map<String, Object> attributes) {
        UserDetailsImpl userDetailsImpl = UserDetailsImpl.build(user);
        userDetailsImpl.setAttributes(attributes);
        return userDetailsImpl;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    @Override
    public Map<String, Object> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, Object> attributes) {
        this.attributes = attributes;
    }

    @Override
    public String getName() {
        return String.valueOf(id);
    }

}
