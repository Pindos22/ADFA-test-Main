package com.dopin.ADFA;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlacesRepo extends JpaRepository<Places, Long> {

}
