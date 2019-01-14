package org.acme.eshop.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "ORDERITEMS")
@SequenceGenerator(name = "idGenerator", sequenceName = "ORDERITEMS_SEQ", initialValue = 1)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString(callSuper = true, exclude = "order")
@EqualsAndHashCode(callSuper = true)
public class OrderItem extends BaseEntity {
	private static final long serialVersionUID = 5350412371242272001L;
	@NotNull
	@Column(length = 50, nullable = false)
	private String description;
	@NotNull
	@Column
	private BigDecimal price;
	@NotNull
	@Column
	private Integer quantity;
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name = "order_id", nullable = false)
	private Order order;
}
