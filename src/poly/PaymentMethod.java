package poly;

public abstract class PaymentMethod {
    //객체간의 공통된 특성을 추출하여 추상클래스로 작성.

    //변하는 부분
    //findPay는 option 매개변수를 받아 해당 결제수단에 맞는 Pay객체를 반환
    public static Pay findPay(String option){
        if(option.equals("kakao")) {
            return new KakaoPay();
        }else if(option.equals("naver")) {
            return new NaverPay();
        }else{
            return new DefaultPay();
        }
    }
}
