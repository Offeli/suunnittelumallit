package proxy_pattern;

import java.util.ArrayList;
import java.util.List;

public class ProxyExample {

	public static void main(String[] args) {

		List<Image> kansio = new ArrayList();

		Image image1 = new ProxyImage("Lomakuva");
		Image image2 = new ProxyImage("Passikuva");
		Image image3 = new ProxyImage("Perhekuva");
		Image image4 = new ProxyImage("Sauli Niinistön muotokuva");

		kansio.add(image1);
		kansio.add(image2);
		kansio.add(image3);
		kansio.add(image4);

		for (Image i : kansio) {
			System.out.println(i.showData());
		}

		for (Image i : kansio) {
			i.displayImage();
		}

		for (Image i : kansio) {
			i.displayImage();
		}
	}

}
