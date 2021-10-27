package td.book.tdbook.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "USER_ROLES")
public class UserRole {

    //The @EmbeddedId annotation is used for embedding a composite-id class as the primary key of this mapping.
    @EmbeddedId
    private UserRoleId id;

    @Column(name = "created_on")
    private Date createdOn = new Date();

    @ManyToOne
    @MapsId("userId")
    @JoinColumn(name = "USER_ID")
    private User user;

    // @ManyToOne
    // @MapsId("roleId")
    // @JoinColumn(name = "ROLE_ID")
    // private TdBookRole role;

    //To persist the joined entity in many-to-many, the @EmbededId value need to be filled manually as Hibernate would not be able to set the value via reflection,
    //otherwise, you would get the following error in the console Caused by: org.hibernate.PropertyAccessException: Could not set field value by reflection
    //https://hellokoding.com/jpa-many-to-many-extra-columns-relationship-mapping-example-with-spring-boot-hsql/
    // public UserRole(User user, TdBookRole role, Date createdOn) {
    //     this.id = new UserRoleId(user.getId(), role.getId());
    //     this.user = user;
    //     this.role = role;
    //     this.createdOn = createdOn;
    // }

    public UserRoleId getId() {
        return id;
    }

    public void setId(UserRoleId id) {
        this.id = id;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    // public TdBookRole getRole() {
    //     return role;
    // }

    // public void setRole(TdBookRole role) {
    //     this.role = role;
    // }

    

}
