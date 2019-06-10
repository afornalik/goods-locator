package afornalik.goodslocator;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import afornalik.goodslocator.mapper.StorageRackMapper;
import afornalik.goodslocator.model.StorageRack;
import afornalik.goodslocator.modeldto.StorageRackDTO;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StorageRackMapperTest {
	
	private StorageRackDTO storageRackDTO;
	
	@Autowired
	private StorageRackMapper storageMapper;
	
	@Test
	public void shouldMapDTOtoEntity() {
		//given
		storageRackDTO = new StorageRackDTO(5, 10, 15, "some dummy description");
		
		//when
		StorageRack storageRack = storageMapper.convertToEntity(storageRackDTO);
		
		//then
		Assert.assertEquals(storageRack.getId(), storageRackDTO.getId());
		Assert.assertEquals(storageRack.getRows(), storageRackDTO.getRows());
		Assert.assertEquals(storageRack.getCollumns(), storageRackDTO.getCollumns());
		Assert.assertEquals(storageRack.getDescription(), storageRackDTO.getDescription());
	}

}
