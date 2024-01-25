package com.example.cafe.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.cafe.service.CafeService;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "CAFE")
public class Cafe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="cafe_sequence")
	@SequenceGenerator(name = "cafe_sequence", sequenceName="cafe_sequence", allocationSize=1)
	
	@Column(name = "cafe_id")
	public Long cafeId;
	
	@Column(name = "name")
	public String name;
	
	@Column(name = "location")
	public String location;
	
	@Column(name = "opening_hours")
	public String openingHours;
	
	//카페 이름을 갖고 오는 메서드
	public String getName() {
	    return name;
	}
	
	//카페 위치를 갖고 오는 메서드
	public String getLocation() {
	    return location;
	}
	
	//카페 운영시간을 갖고 오는 메서드
	public String getOpeningHours() {
	    return openingHours;
	}
	
	//카페 이름을 새로 넣는 메서드
	public void setName(String name) {
        this.name = name;
    }
	
	//카페 위치를 새로 넣는 메서드
    public void setLocation(String location) {
        this.location = location;
    }
    
    //카페 운영시간을 새로 넣는 메서드
    public void setOpeningHours(String openingHours) {
        this.openingHours = openingHours;
    }
}
