package mobile_shop;

	public class Mobile {
	    private String os;
	    private int ram;
	    private int memory;
	    private int price;
	    private int rating;
	    
	    public Mobile(String os, int ram, int memory, int price, int rating) {
	        this.os = os;
	        this.ram = ram;
	        this.memory = memory;
	        this.price = price;
	        this.rating = rating;
	    }

		public String getOs() {
			return os;
		}

		public void setOs(String os) {
			this.os = os;
		}

		public int getRam() {
			return ram;
		}

		public void setRam(int ram) {
			this.ram = ram;
		}

		public int getMemory() {
			return memory;
		}

		public void setMemory(int memory) {
			this.memory = memory;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		public int getRating() {
			return rating;
		}

		public void setRating(int rating) {
			this.rating = rating;
		}
	    
	    
}
