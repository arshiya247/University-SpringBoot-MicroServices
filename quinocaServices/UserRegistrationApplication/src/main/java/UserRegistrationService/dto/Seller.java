package UserRegistrationService.dto;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;

@Table
@Entity
public class Seller {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;
    @Column(name = "first_name")
   private String firstName;
    @Column(name = "last_name")
   private String lastName;
    @Column(name = "email_id")
   private String emailId;

    @JsonManagedReference
    @OneToOne(cascade = CascadeType.ALL)
   private Items items;

    public Seller() {
    }

    public Seller(Long id, String firstName, String lastName, String emailId, Items items) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
        this.items = items;
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

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailId='" + emailId + '\'' +
                ", itemsSold=" + items +
                '}';
    }
}
