/*
 * package io.mulshankar13.model;
 * 
 * import java.io.Serializable;
 * 
 * import javax.persistence.Entity; import javax.persistence.Id; import
 * javax.persistence.JoinColumn; import javax.persistence.OneToOne;
 * 
 * @Entity(name = "Cart") public class Cart implements Serializable{
 * 
 * private static final long serialVersionUID = 6373834658640858131L;
 * 
 * @Id private long id;
 * 
 * 
 * @OneToOne(mappedBy = "cart")
 * 
 * @JoinColumn(name="order_id",nullable=true) private CartOrder order;
 * 
 * @OneToOne(mappedBy = "cart")
 * 
 * @JoinColumn(name="customer_id",nullable = false) private Customer customer;
 * 
 * }
 */