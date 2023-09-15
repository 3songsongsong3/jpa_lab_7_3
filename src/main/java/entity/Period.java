package entity;

import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

// @Embeddable - 값 타입을 정의하는 곳에 표시
// 엔티티와 임베디드 타입의 관계를 표현하면 컴포지션 관계가 된다.
// 하이버네이트에서 임베디드 타입을 컴포넌트라고 한다.
@Embeddable
public class Period {

    @Temporal(TemporalType.DATE) java.util.Date startDate;
    @Temporal(TemporalType.DATE) java.util.Date endDate;

}
