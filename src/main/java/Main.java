import ru.netology.sqr.SQRService;

public class Main {

    public static void main(String[] args) {

        SQRService service = new SQRService();
        int res = service.numberOfSquares(99, 9900);
        System.out.println(res);
    }
}
