package singleton_method;

public class Main {
	public static void main(String[] args) {
		
        Jasper jasper = Jasper.getInstance();
        jasper.pueVaatteet(new AdidasTehdas());
        System.out.println(jasper.kerroVaatteet());
    }

}
