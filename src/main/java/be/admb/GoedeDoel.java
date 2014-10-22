package be.admb;

import java.math.BigDecimal;

public class GoedeDoel {
	private String naam;
	private BigDecimal ingezameld = BigDecimal.ZERO;
	public GoedeDoel(String naam) {
		this.naam = naam;
	}
	public String getNaam() {
		return naam;
	}
	public BigDecimal getIngezameld() {
		return ingezameld;
	}
	public void storten(BigDecimal bedrag) {
		ingezameld = ingezameld.add(bedrag);
	}
	@Override
	public boolean equals(Object object) {
		if (!(object instanceof GoedeDoel)) {
			return false;
		}
		GoedeDoel anderDoel = (GoedeDoel) object;
		return naam.equalsIgnoreCase(anderDoel.naam);
	}

	
	
	

}
