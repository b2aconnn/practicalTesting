package sample.cafekiosk.spring.domain.order;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum OrderStatus {
    INIT("주문생성"),
    CANCELED("주문취소"),
    PAYMENT_COMPLETED("결제실패"),
    PAYMENT_FAIELD("결제완료"),
    RECEIVED("주문접수"),
    COMPLETED("주문완료");

    private final String text;
}
