package afornalik.goodslocator.mapper;

import org.springframework.stereotype.Component;

import afornalik.goodslocator.exception.StorageRackConvertException;
import afornalik.goodslocator.model.StorageRack;
import afornalik.goodslocator.modeldto.StorageRackDTO;

@Component
public class StorageRackMapper {

	public StorageRack convertToEntity(StorageRackDTO dto) throws StorageRackConvertException {
		
			if (dto.getId() != 0) {
				StorageRack rack = new StorageRack(dto.getId(), dto.getRows(), dto.getCollumns(), dto.getDescription());
				return rack;
			} else {
				throw new StorageRackConvertException();
			}
		

	}

	public StorageRackDTO convertToDTO(StorageRack storageRack) {
		StorageRackDTO storageRackDTO = new StorageRackDTO(storageRack.getId(), storageRack.getRows(),
				storageRack.getCollumns(), storageRack.getDescription());
		
		return storageRackDTO;
	}

}
