package com.mycompany.model.product;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MwbProduct")
public class Product
{
	@Id
	@Column(name="ProductID")
	private Integer productID;

	@Column(name="ModifiedDate")
	private Date modifiedDate;

	@Column(name="rowguid")
	private String rowguid;

	@Column(name="DiscontinuedDate")
	private Date discontinuedDate;

	@Column(name="SellEndDate")
	private Date sellEndDate;

	@Column(name="SellStartDate")
	private Date sellStartDate;

	@Column(name="ProductModelID")
	private Integer productModelID;

	@Column(name="ProductSubcategoryID")
	private Integer productSubcategoryID;

	@Column(name="Style")
	private String style;

	@Column(name="Class")
	private String clazz;

	@Column(name="ProductLine")
	private String productLine;

	@Column(name="DaysToManufacture")
	private Integer daysToManufacture;

	@Column(name="Weight")
	private Double weight;

	@Column(name="WeightUnitMeasureCode")
	private String weightUnitMeasureCode;

	@Column(name="SizeUnitMeasureCode")
	private String sizeUnitMeasureCode;

	@Column(name="Size_")
	private String size;

	@Column(name="ListPrice")
	private Double listPrice;

	@Column(name="StandardCost")
	private Double standardCost;

	@Column(name="ReorderPoint")
	private Integer reorderPoint;

	@Column(name="SafetyStockLevel")
	private Integer safetyStockLevel;

	@Column(name="Color")
	private String color;

	@Column(name="FinishedGoodsFlag")
	private Integer finishedGoodsFlag;

	@Column(name="MakeFlag")
	private Integer makeFlag;

	@Column(name="ProductNumber")
	private String productNumber;

	@Column(name="Name")
	private String name;

	public Integer getProductID()
	{
		return productID;
	}

	public void setProductID(Integer productID)
	{
		this.productID = productID;
	}

	public Date getModifiedDate()
	{
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate)
	{
		this.modifiedDate = modifiedDate;
	}

	public String getRowguid()
	{
		return rowguid;
	}

	public void setRowguid(String rowguid)
	{
		this.rowguid = rowguid;
	}

	public Date getDiscontinuedDate()
	{
		return discontinuedDate;
	}

	public void setDiscontinuedDate(Date discontinuedDate)
	{
		this.discontinuedDate = discontinuedDate;
	}

	public Date getSellEndDate()
	{
		return sellEndDate;
	}

	public void setSellEndDate(Date sellEndDate)
	{
		this.sellEndDate = sellEndDate;
	}

	public Date getSellStartDate()
	{
		return sellStartDate;
	}

	public void setSellStartDate(Date sellStartDate)
	{
		this.sellStartDate = sellStartDate;
	}

	public Integer getProductModelID()
	{
		return productModelID;
	}

	public void setProductModelID(Integer productModelID)
	{
		this.productModelID = productModelID;
	}

	public Integer getProductSubcategoryID()
	{
		return productSubcategoryID;
	}

	public void setProductSubcategoryID(Integer productSubcategoryID)
	{
		this.productSubcategoryID = productSubcategoryID;
	}

	public String getStyle()
	{
		return style;
	}

	public void setStyle(String style)
	{
		this.style = style;
	}

	public String getClazz()
	{
		return clazz;
	}

	public void setClazz(String clazz)
	{
		this.clazz = clazz;
	}

	public String getProductLine()
	{
		return productLine;
	}

	public void setProductLine(String productLine)
	{
		this.productLine = productLine;
	}

	public Integer getDaysToManufacture()
	{
		return daysToManufacture;
	}

	public void setDaysToManufacture(Integer daysToManufacture)
	{
		this.daysToManufacture = daysToManufacture;
	}

	public Double getWeight()
	{
		return weight;
	}

	public void setWeight(Double weight)
	{
		this.weight = weight;
	}

	public String getWeightUnitMeasureCode()
	{
		return weightUnitMeasureCode;
	}

	public void setWeightUnitMeasureCode(String weightUnitMeasureCode)
	{
		this.weightUnitMeasureCode = weightUnitMeasureCode;
	}

	public String getSizeUnitMeasureCode()
	{
		return sizeUnitMeasureCode;
	}

	public void setSizeUnitMeasureCode(String sizeUnitMeasureCode)
	{
		this.sizeUnitMeasureCode = sizeUnitMeasureCode;
	}

	public String getSize()
	{
		return size;
	}

	public void setSize(String size)
	{
		this.size = size;
	}

	public Double getListPrice()
	{
		return listPrice;
	}

	public void setListPrice(Double listPrice)
	{
		this.listPrice = listPrice;
	}

	public Double getStandardCost()
	{
		return standardCost;
	}

	public void setStandardCost(Double standardCost)
	{
		this.standardCost = standardCost;
	}

	public Integer getReorderPoint()
	{
		return reorderPoint;
	}

	public void setReorderPoint(Integer reorderPoint)
	{
		this.reorderPoint = reorderPoint;
	}

	public Integer getSafetyStockLevel()
	{
		return safetyStockLevel;
	}

	public void setSafetyStockLevel(Integer safetyStockLevel)
	{
		this.safetyStockLevel = safetyStockLevel;
	}

	public String getColor()
	{
		return color;
	}

	public void setColor(String color)
	{
		this.color = color;
	}

	public Integer getFinishedGoodsFlag()
	{
		return finishedGoodsFlag;
	}

	public void setFinishedGoodsFlag(Integer finishedGoodsFlag)
	{
		this.finishedGoodsFlag = finishedGoodsFlag;
	}

	public Integer getMakeFlag()
	{
		return makeFlag;
	}

	public void setMakeFlag(Integer makeFlag)
	{
		this.makeFlag = makeFlag;
	}

	public String getProductNumber()
	{
		return productNumber;
	}

	public void setProductNumber(String productNumber)
	{
		this.productNumber = productNumber;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}


}
