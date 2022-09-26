package application.entities;

public class Bill {
	
	private char gender;
	private Integer beer;
	private Integer barbecue;
	private Integer softDrink;
	
	public Bill() {
	}

	public Bill(char gender, Integer beer, Integer barbecue, Integer softDrink) {
		this.gender = gender;
		this.beer = beer;
		this.barbecue = barbecue;
		this.softDrink = softDrink;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public Integer getBeer() {
		return beer;
	}

	public void setBeer(Integer beer) {
		this.beer = beer;
	}

	public Integer getBarbecue() {
		return barbecue;
	}

	public void setBarbecue(Integer barbecue) {
		this.barbecue = barbecue;
	}

	public Integer getSoftDrink() {
		return softDrink;
	}

	public void setSoftDrink(Integer softDrink) {
		this.softDrink = softDrink;
	}
	
	public double couver() {
		if(feeding() < 30) {
			return  4.0;
		 }
			return 0;
		
	}
	
	public double feeding() {
		return beer * 5 + softDrink * 3 + barbecue *7;
	}
	
	public double ticket() {
		if (gender == 'F') {
			return 8.0;
		 }
		 else {
			 return 10;
		 }
	}
	
	public double total() {
		return couver() + feeding() +ticket();
	}

}
