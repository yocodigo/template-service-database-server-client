package com.soulco.app.repository;


import com.soulco.app.domain.AppEntity;
import com.soulco.app.domain.AppIdentity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AppRepository extends JpaRepository<AppEntity, AppIdentity> {

    @Query("SELECT o FROM AppEntity o " +
            "WHERE o.appIdentity.userId = :userId")
    List<AppEntity> findByEmailAddress(@Param("userId") Integer userId);
}
