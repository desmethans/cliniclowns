package be.admb;

import java.math.BigDecimal;

public class GoedeDoel {
	private String naam;
	private BigDecimal ingezameld;
	public GoedeDoel(String naam) {
		this.naam = naam;
	}
	public String getNaam() {
		return naam;
	}
	public BigDecimal getIngezameld() {
		return ingezameld;
	}
	
	

}
