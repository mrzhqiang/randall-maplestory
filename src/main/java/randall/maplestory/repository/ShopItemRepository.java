package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.ShopItem;

public interface ShopItemRepository extends JpaRepository<ShopItem, Integer>, JpaSpecificationExecutor<ShopItem> {

}