package com.soulco.app.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.sun.istack.NotNull;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AppEntity {

    @EmbeddedId
    private AppIdentity appIdentity;

    @NotNull
    @Column(name = "username")
    private String username;

    @NotNull
    @Column(name = "email", length = 20)
    private String email;

    @Column(name = "location", length = 20)
    private String location;

    @Column(name = "item_list", length = 10)
    private String itemList;

}

