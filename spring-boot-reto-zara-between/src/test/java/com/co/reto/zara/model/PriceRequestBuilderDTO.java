package com.co.reto.zara.model;

public class PriceRequestBuilderDTO {

	  private Integer brandId;
	  private String startDate;
	  private String endDate;
	  private Integer productId;
	  
	  public PriceRequestBuilderDTO() {
		  this.brandId = 	1;
		  this.endDate = "2020-12-31 23.59.59";
		  this.productId = 35455;
		  this.startDate = "2020-06-14 00.00.00";
		 /* "startDate": "2020-06-14 00:00:00",
	        "endDate": "2020-12-31 23:59:59",
	       */ 
	  }
	  
	  public PriceRequestBuilderDTO whithDateStartAndEndDate(String startDate, String endDate) {
		
		this.startDate = startDate;
		this.endDate = endDate;
		return this;
	}
	  public PriceRequestBuilderDTO whithDateStart(String startDate) {
			
			this.startDate = startDate;
			return this;
		}

	public PriceRequestDTO build() {
		  
		  return new PriceRequestDTO(this.brandId,this.startDate,this.endDate,this.productId);
	  }
	  public static PriceRequestBuilderDTO arequestPriceDto() {
		  return new PriceRequestBuilderDTO();
	  }
	  
}
