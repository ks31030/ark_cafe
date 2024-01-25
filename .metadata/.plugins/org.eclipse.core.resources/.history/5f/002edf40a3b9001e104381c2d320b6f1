package com.kh.springdb.model;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name="products")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="product_seq")
	@SequenceGenerator(name = "product_seq", sequenceName="product_seq", allocationSize=1)
	//private int productId;
	private int id;
	
	private String name;
	
	private String text;
	
	private String price;
	
	private int count;
	
	private int stock;
	
	private int isSoldout;
	
	
	//댓글 작성을 위한 Comment
	//@OneToMany(mappedBy="products", cascade=CascadeType.ALL)
	//댓글 작성을 위한 Comment
	@OneToMany(mappedBy="product", cascade=CascadeType.ALL)
	private List<Comment> comments;
	
	//상품 이미지를 위한 필드 설정
	
	private String imgName;
	private String imgPath;
	
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private LocalDate createDate;
	
    @PrePersist // DB에 INSERT 되기 직전에 실행. 즉 DB에 값을 넣으면 자동으로 실행됨
    public void createDate() {
        this.createDate = LocalDate.now();
    }

    //상품 좋아요 클릭해서 횟수 추가하기
    private int likes; 
    //좋아요를 받는 방법은 여러 방법이 있음
    // 1. 사용자 관계없이 카운트만 올라가게하기
    
    // 2. ManytoOne이나 OneToMany 이용해서 서로 카운트 주기
    @ManyToMany
    private Set<SiteUser> likedBy = new HashSet<>();
    
}