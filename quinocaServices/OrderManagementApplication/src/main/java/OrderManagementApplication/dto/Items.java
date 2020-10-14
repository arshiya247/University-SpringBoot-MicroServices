package OrderManagementApplication.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

//@Entity
//@Table
public class Items {

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
   // @Column
    private String name;
  //  @Column
    private String category;
 //   @Column
    private double price;
//@JsonBackReference
//@OneToOne(mappedBy = "items")
    private Seller seller;

    public Items() {
    }

    public Items(Long id, String name, String category, double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Items{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
