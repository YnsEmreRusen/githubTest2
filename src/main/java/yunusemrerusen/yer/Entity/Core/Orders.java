package yunusemrerusen.yer.Entity.Core;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="orders")
@AllArgsConstructor
@NoArgsConstructor
public class Orders {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="order_id")
	private int order_id;
	
	
	@Column(name="ship_name")
	private String ship_name;
	
	

}
