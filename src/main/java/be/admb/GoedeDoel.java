package be.admb;

import java.math.BigDecimal;

/**
 * Dit is een goed doel waarvoor we <strong>veel</strong> geld inzamelen
 * @author Hans
 *
 */

public class GoedeDoel {
	private String naam;
	private BigDecimal ingezameld = BigDecimal.ZERO;
	public GoedeDoel(String naam) {
		this.naam = naam;
	}
	public String getNaam() {
		return naam;
	}
	/**
	 * 
	 * @return het totaal ingezamelde bedrag
	 */
	public BigDecimal getIngezameld() {
		return ingezameld;
	}
	/**
	 * Hiermee stort je geld voor dit goed doel
	 * @param bedrag het bedrag in &euro; dat je stort
	 */
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
