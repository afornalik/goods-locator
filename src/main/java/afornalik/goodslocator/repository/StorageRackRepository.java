package afornalik.goodslocator.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import afornalik.goodslocator.model.StorageRack;

@Repository
public interface StorageRackRepository extends JpaRepository<StorageRack, Integer>{
			
}
