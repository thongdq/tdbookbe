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

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;

//@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ROLES")
public class Role1 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NonNull private Long id;

    // @Enumerated(EnumType.STRING)
    // @Column(length = 20)
    // private ERole name;

    // @OneToMany(
    //     mappedBy = "role",
    //     fetch = FetchType.LAZY
    // )
    // private Set<UserRole> userRoles;

    // public Role(ERole name, Set<UserRole> userRoles) {
    //     this.name = name;
    //     this.userRoles = userRoles;
    // }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // public ERole getName() {
    //     return name;
    // }

    // public void setName(ERole name) {
    //     this.name = name;
    // }

    // public Set<UserRole> getUserRoles() {
    //     return userRoles;
    // }

    // public void setUserRoles(Set<UserRole> userRoles) {
    //     this.userRoles = userRoles;
    // }

}
