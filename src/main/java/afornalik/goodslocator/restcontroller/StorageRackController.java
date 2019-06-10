package afornalik.goodslocator.restcontroller;



import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import afornalik.goodslocator.mapper.StorageRackMapper;
import afornalik.goodslocator.model.StorageRack;
import afornalik.goodslocator.modeldto.StorageRackDTO;
import afornalik.goodslocator.repository.StorageRackRepository;

@RestController
@CrossOrigin
@RequestMapping("/api/storagerack")
public class StorageRackController {
	
	@Autowired
	private StorageRackRepository storageRackRepository;
	
	@Autowired
	private StorageRackMapper storageRackMapper;
	
	@GetMapping("/all")
	public List<StorageRackDTO> getAllStorageRack() {
		
		List<StorageRack> storageRacks = storageRackRepository.findAll();
		
		List<StorageRackDTO> storageRackDTOs = new ArrayList<StorageRackDTO>();
		
		storageRackDTOs = storageRacks.stream().map(x -> storageRackMapper.convertToDTO(x)).collect(Collectors.toList());
		
		return storageRackDTOs;
	}

}
