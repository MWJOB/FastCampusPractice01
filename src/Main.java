public class Main {
    public static void main(String[] args) {
        String url = "www.naver.com/books/it?page=10&size=20&name=spring-boot";

        //Base 64 인코더

        //url encoding
        //이런식으로 필요한 것을 주입시키면 인코더 코드를 건들 필요 없이 작동시킬수 있다.
        //외부 주입 객체만 바꿔서 결과를 바꿀 수 있다. ==> DI
        Encoder encoder = new Encoder(new UrlEncoder());

        String result = encoder.encode(url);
        System.out.println(result);
    }
}