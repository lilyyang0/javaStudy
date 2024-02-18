package poly;

public class PayService {
    public void processPay(String option, int amount) {
        System.out.println("결제를 시작합니다: option=" + option + ", amount=" +
                amount);
        Pay pay = PaymentMethod.findPay(option);
        //PaymentMethod.findPay(option)를 호출하여 해당 option에 맞는 Pay객체를 찾는다
        //pay변수는 Pay 인터페이스를 구현한 객체를 참조한다.
        boolean result = pay.pay(amount);
        if (result) {
            System.out.println("결제가 성공했습니다.");
        } else {
            System.out.println("결제가 실패했습니다.");
        }
    }
}
