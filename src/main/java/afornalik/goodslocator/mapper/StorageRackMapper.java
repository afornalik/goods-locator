package afornalik.goodslocator.mapper;

import afornalik.goodslocator.exception.StorageRackIdException;
import afornalik.goodslocator.model.StorageRack;
import afornalik.goodslocator.modeldto.StorageRackDTO;

public class StorageRackMapper {

	public StorageRack convertToEntity(StorageRackDTO dto) {
		try {
			if (dto.getId() != 0) {
				StorageRack rack = new StorageRack(dto.getId(), dto.getRows(), dto.getCollumns(), dto.getDescription());
				return rack;
			} else {
				throw new StorageRackIdException();
			}
		} catch (StorageRackIdException rackIdException) {
			return null;
		}
		
	}

}