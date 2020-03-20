/*
 * package io.mulshankar13.model;
 * 
 * import java.io.Serializable; import java.util.HashSet; import java.util.Set;
 * 
 * import javax.persistence.CascadeType; import javax.persistence.Entity; import
 * javax.persistence.FetchType; import javax.persistence.GeneratedValue; import
 * javax.persistence.GenerationType; import javax.persistence.Id; import
 * javax.persistence.JoinColumn; import javax.persistence.JoinTable; import
 * javax.persistence.ManyToMany;
 * 
 * @Entity(name = "order") public class CartOrder implements Serializable{
 * 
 * private static final long serialVersionUID = -8779900999023178004L;
 * 
 * @Id
 * 
 * @GeneratedValue(strategy = GenerationType.AUTO) private long id;
 * 
 * private long totalValue;
 * 
 * @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
 * 
 * @JoinTable(name = "order_discount", joinColumns = {
 * 
 * @JoinColumn(name = "order_id", referencedColumnName = "id", nullable = false,
 * updatable = false)}, inverseJoinColumns = {
 * 
 * @JoinColumn(name = "discount_id", referencedColumnName = "id", nullable =
 * false, updatable = false)}) private Set<Discount> discounts = new
 * HashSet<>();
 * 
 * public long getTotalValue() { return totalValue; }
 * 
 * public void setTotalValue(long totalValue) { this.totalValue = totalValue; }
 * 
 * public Set<Discount> getDiscounts() { return discounts; }
 * 
 * public void setDiscounts(Set<Discount> discounts) { this.discounts =
 * discounts; }
 * 
 * @Override public String toString() { return "CartOrder [totalValue=" +
 * totalValue + ", discounts=" + discounts + "]"; }
 * 
 * }
 */