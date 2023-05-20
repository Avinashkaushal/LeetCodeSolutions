package compare;

public class Address implements Comparable<Address> {
	
		String City;
		Integer Pincode;
		public String getCity() {
			return City;
		}
		public void setCity(String city) {
			City = city;
		}
		public Integer getPincode() {
			return Pincode;
		}
		public void setPincode(Integer pincode) {
			Pincode = pincode;
		}
		@Override
		public int compareTo(Address o) {
			
			return this.getPincode()-o.getPincode();
		}
		@Override
		public String toString() {
			return "Address [City=" + City + ", Pincode=" + Pincode + "]";
		}
		public Address(String city, Integer pincode) {
			super();
			City = city;
			Pincode = pincode;
		}
		

		
		

}
