package com.example.managementrh.repository;

import com.example.managementrh.models.VerificationToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface VerificationTokenRepository extends JpaRepository<VerificationToken,Long> {
    @Query(value = """
      select t from VerificationToken t inner join User u\s
      on t.user.id = u.id\s
      where u.id = :id and (t.expired = false or t.revoked = false)\s
      """)
    List<VerificationToken> findAllValidTokenByUser(Integer id);
    Optional<VerificationToken> findByToken(String token);

}
