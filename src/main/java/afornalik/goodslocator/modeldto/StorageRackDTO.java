package afornalik.goodslocator.modeldto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StorageRackDTO {
	
	private int id;
	private int rows;
	private int collumns;
	private String description;

}
