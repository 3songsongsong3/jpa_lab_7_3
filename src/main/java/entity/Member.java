package entity;

import javax.persistence.*;


/**
 * JPA 값 타입
 *
 * JPA의 데이터 타입을 가장 크게 분류하면 엔티티 타입과 값 타입으로 나눌 수 있다.
 * 엔티티 타입은 @Entity로 정의하는 객체이고, 값 타입은 int, Integer, String처럼 단순히 값으로 사용하는 자바 기본 타입이나 객체를 말한다.
 *
 *  -- 엔티티 타입은 식별자를 통해 지속해서 추적할 수 있지만, 값 타입은 식별자가 없고 숫자나 문자같은 속성만 있으므로 추적할 수 없다.
 *  예를 들어, 회원 에닡티라는 것은 그 회원이나 키 나이 값을 변경해도 같은 회원이다. 데이터를 변경해도 식별자만 유지하면 같은 회원으로 인식할 수 있다.
 *
 *  반면에 숫자 값 100을 200으로 변경하면 완전히 다른 값으로 대체된다.
 *
 *  기본값 타입
 *      - 자바 기본 타입 (int, double ----
 *      - 래퍼 클래스 (Integer)
 *      - String
 *
 *  임베디드 타입
 *  컬렉션 값 타입
 *
 */
@Entity
public class Member {

    @Id
    @GeneratedValue
    private Long id;
    // 값 타입인 name, age 속성은 식별자 값도 없고 생명주기도 회원 엔티티에 의존한다.
    private String name;
    private int age;

    ////////////////////////////////////////////////////////////////////////////////////////////////
    // 임베디드 타입 (복합 값 타입)
    //  새로운 값 타입을 직접 정의해서 사용할 수 있는데, 이를 임베디드 타입이라 한다.

    // 임베디드 타입 적용 전
    // 근무 기간
    /*@Temporal(TemporalType.DATE) java.util.Date startDate;
    @Temporal(TemporalType.DATE) java.util.Date endDate;

    // 집 주소 표현
    private String city;
    private String street;
    private String zipcode;*/

    //////////////////// 변경 후 ////////////////////////
    @Embedded Period workPeriod;
    @Embedded Address homeAddress;

}
