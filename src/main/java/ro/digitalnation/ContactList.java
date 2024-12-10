package ro.digitalnation;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
	public class ContactList {
		
			@Id
			@GeneratedValue(strategy=GenerationType.AUTO)
		    private Long id;
			private String firstName;
			private String lastName;
			private String email;
			private String phoneNumber;
		    private String address;
		    private String description;
			
		    public ContactList() {
				
			}

			public ContactList(Long id, String firstName, String lastName, String email, String phoneNumber, String address,String description) {
				super();
				this.id = id;
				this.firstName = firstName;
				this.lastName = lastName;
				this.email = email;
				this.phoneNumber = phoneNumber;
				this.address = address;
				this.description = description;
			}

			public Long getId() {
				return id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getFirstName() {
				return firstName;
			}

			public void setFirstName(String firstName) {
				this.firstName = firstName;
			}

			public String getLastName() {
				return lastName;
			}

			public void setLastName(String lastName) {
				this.lastName = lastName;
			}

			public String getEmail() {
				return email;
			}

			public void setEmail(String email) {
				this.email = email;
			}

			public String getPhoneNumber() {
				return phoneNumber;
			}

			public void setPhoneNumber(String phoneNumber) {
				this.phoneNumber = phoneNumber;
			}

			public String getAddress() {
				return address;
			}

			public void setAddress(String address) {
				this.address = address;
			}

			public String getDescription() {
				return description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			@Override
			public String toString() {
				return "ContactList [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
						+ ", phoneNumber=" + phoneNumber + ", address=" + address + ", description=" + description + "]";
			}
		    
			
		    
		    

	}



