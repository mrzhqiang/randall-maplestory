package randall.maplestory.account;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>, JpaSpecificationExecutor<Account> {

    @Modifying
    @Query("UPDATE Account a SET a.loggedIn = ?1")
    void updateLoggedIn(Integer loggedIn);

    @Modifying
    @Query("UPDATE Account a SET a.lastGainHM = ?1")
    void updateLastGainHM(Long lastGainHM);

}