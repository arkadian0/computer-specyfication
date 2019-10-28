package com.cp.domain.computerparameters;

import com.cp.shared.model.cmd.UserElement;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@Table(name = "system_user")
class SystemUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    @Column(name="caption")
    private String caption;
    @Column(name="description")
    private String description;
    @Column(name="disabled")
    private String disabled;
    @Column(name="full_name")
    private String fullName;
    @Column(name="local_account")
    private String localAccount;
    @Column(name="name")
    private String name;
    @Column(name="password_changeable")
    private String passwordChangeable;
    @Column(name="password_expires")
    private String passwordExpires;
    @Column(name="password_required")
    private String passwordRequired;
    @Column(name="status")
    private String status;
    @ManyToOne
    private ComputerParameters computer;
    private SystemUser(UserElement userElement) {
        this.caption = userElement.getCaption();
        this.description = userElement.getDescription();
        this.disabled = userElement.getDisabled();
        this.fullName = userElement.getFullName();
        this.localAccount = userElement.getLocalAccount();
        this.name = userElement.getName();
        this.passwordChangeable = userElement.getPasswordChangeable();
        this.passwordExpires = userElement.getPasswordExpires();
        this.passwordRequired = userElement.getPasswordRequired();
        this.status = userElement.getStatus();
    }

    static SystemUser of(UserElement userElement) {
        return new SystemUser(userElement);
    }
}
