package afornalik.goodslocator.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "storage_rack")
@AllArgsConstructor
@NoArgsConstructor
public class StorageRack {
	
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY )
	private int id;

	private int rows;
	
	private int collumns;
	
	private String description;
}
