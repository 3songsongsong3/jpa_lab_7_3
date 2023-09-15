package entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {

    @Column(name="city") // 매핑할 컬럼 정의 기능
    private String city;
    private String street;
    private String zipcode;

}
