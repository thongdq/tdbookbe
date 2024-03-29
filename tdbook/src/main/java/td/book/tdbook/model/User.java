package td.book.tdbook.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import td.book.tdbook.security.oauth.AuthProvider;

//@Data
//Lombok's @Data annotation on my model objects to auto-generate getters, setters, and other standard methods.
//The toString() method might generated by Lombok introduced a circular dependency => java.lang.StackOverflowError
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "USERS")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NonNull private Long id;

    @Column(name = "USERNAME", length = 100)
    private String userName;

    @Column(name = "EMAIL", nullable = false, length = 255)
    private String email;

    @Column(name = "PASSWORD", nullable = false, length = 100)
    private String password;

    @OneToMany(
        mappedBy = "user",
        fetch = FetchType.LAZY
    )
    private Set<UserRole> userRoles;

    @Column(name = "emailverified")
    private Boolean emailVerified;

    @NotNull
    @Enumerated(EnumType.STRING)
    private AuthProvider provider;

    @Column(name = "providerid")
    private String providerId;

    public User(String username, String email, String password
                , Set<UserRole> userRoles, Boolean emailVerified, AuthProvider provider, String providerId) {
        this.userName = username;
        this.email = email;
        this.password = password;
        this.userRoles = userRoles;
        this.emailVerified = emailVerified;
        this.provider = provider;
        this.providerId = providerId;
    }

    public Long getId() {
        return id;
    }

    // public void setId(Long id) {
    //     this.id = id;
    // }

    public String getUserName() {
        return userName;
    }

    // public void setUserName(String userName) {
    //     this.userName = userName;
    // }

    public String getEmail() {
        return email;
    }

    // public void setEmail(String email) {
    //     this.email = email;
    // }

    public String getPassword() {
        return password;
    }

    // public void setPassword(String password) {
    //     this.password = password;
    // }

    public Set<UserRole> getUserRoles() {
        return userRoles;
    }

    // public void setUserRoles(Set<UserRole> userRoles) {
    //     this.userRoles = userRoles;
    // }

    public Boolean getEmailVerified() {
        return emailVerified;
    }

    // public void setEmailVerified(Boolean emailVerified) {
    //     this.emailVerified = emailVerified;
    // }

    public AuthProvider getProvider() {
        return provider;
    }

    // public void setProvider(AuthProvider provider) {
    //     this.provider = provider;
    // }

    public String getProviderId() {
        return providerId;
    }

    // public void setProviderId(String providerId) {
    //     this.providerId = providerId;
    // }

    public static class UserBuilder {
        private String userName;
        private String email;
        private String password;
        private Set<UserRole> userRoles;
        private Boolean emailVerified;
        private AuthProvider provider;
        private String providerId;

        public UserBuilder withUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public UserBuilder withEmail(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder withPassword(String password) {
            this.password = password;
            return this;
        }

        public UserBuilder withUserRoles(Set<UserRole> userRoles) {
            this.userRoles = userRoles;
            return this;
        }

        public UserBuilder isEmailVerified(boolean emailVerified) {
            this.emailVerified = emailVerified;
            return this;
        }

        public UserBuilder withProvider(AuthProvider provider) {
            this.provider = provider;
            return this;
        }

        public UserBuilder withProviderId(String providerId) {
            this.providerId = providerId;
            return this;
        }

        public User build() {
            User user = new User(
                this.userName, this.email, this.password, this.userRoles,
                this.emailVerified, this.provider, this.providerId);

            return user;
        }

    }

}
