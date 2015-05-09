package org.AgileKart.model;

// Generated May 7, 2015 10:18:12 PM by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * AkProductOptions generated by hbm2java
 */
@Entity
@Table(name = "ak_product_options"
      , catalog = "agilekart")
@XmlRootElement
public class AkProductOptions implements java.io.Serializable
{

   private Integer productOptionId;
   private AkOptionGroups akOptionGroups;
   private AkOptions akOptions;
   private AkProducts akProducts;
   private Double optionPriceIncrement;

   public AkProductOptions()
   {
   }

   public AkProductOptions(AkOptionGroups akOptionGroups, AkOptions akOptions, AkProducts akProducts)
   {
      this.akOptionGroups = akOptionGroups;
      this.akOptions = akOptions;
      this.akProducts = akProducts;
   }

   public AkProductOptions(AkOptionGroups akOptionGroups, AkOptions akOptions, AkProducts akProducts, Double optionPriceIncrement)
   {
      this.akOptionGroups = akOptionGroups;
      this.akOptions = akOptions;
      this.akProducts = akProducts;
      this.optionPriceIncrement = optionPriceIncrement;
   }

   @Id
   @GeneratedValue(strategy = IDENTITY)
   @Column(name = "product_option_id", unique = true, nullable = false)
   public Integer getProductOptionId()
   {
      return this.productOptionId;
   }

   public void setProductOptionId(Integer productOptionId)
   {
      this.productOptionId = productOptionId;
   }

   @ManyToOne(fetch = FetchType.EAGER)
   @JoinColumn(name = "option_group_id", nullable = false)
   public AkOptionGroups getAkOptionGroups()
   {
      return this.akOptionGroups;
   }

   public void setAkOptionGroups(AkOptionGroups akOptionGroups)
   {
      this.akOptionGroups = akOptionGroups;
   }

   @ManyToOne(fetch = FetchType.EAGER)
   @JoinColumn(name = "option_id", nullable = false)
   public AkOptions getAkOptions()
   {
      return this.akOptions;
   }

   public void setAkOptions(AkOptions akOptions)
   {
      this.akOptions = akOptions;
   }

   @ManyToOne(fetch = FetchType.EAGER)
   @JoinColumn(name = "product_id", nullable = false)
   public AkProducts getAkProducts()
   {
      return this.akProducts;
   }

   public void setAkProducts(AkProducts akProducts)
   {
      this.akProducts = akProducts;
   }

   @Column(name = "option_price_increment", precision = 22, scale = 0)
   public Double getOptionPriceIncrement()
   {
      return this.optionPriceIncrement;
   }

   public void setOptionPriceIncrement(Double optionPriceIncrement)
   {
      this.optionPriceIncrement = optionPriceIncrement;
   }

}