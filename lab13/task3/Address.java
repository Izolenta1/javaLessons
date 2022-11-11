package lab13.task3;

import java.util.StringTokenizer;

public class Address {
    private String country, region , city, street, house, housing, flat;

    public void AddressSplit(String str) {
        String[] infoMas;
        infoMas = str.split(",");

        this.country = infoMas[0].trim();
        this.region = infoMas[1].trim();
        this.city = infoMas[2].trim();
        this.street = infoMas[3].trim();
        this.house = infoMas[4].trim();
        this.housing = infoMas[5].trim();
        this.flat = infoMas[6].trim();
    }

    public void AddressToken(String str) {
        StringTokenizer st = new StringTokenizer(str,",.;");
        String[] infoMas;
        infoMas = new String[st.countTokens()];
        int i = 0;
        while(st.hasMoreTokens()) {
            infoMas[i++] = st.nextToken();
        }

        this.country = infoMas[0].trim();
        this.region = infoMas[1].trim();
        this.city = infoMas[2].trim();
        this.street = infoMas[3].trim();
        this.house = infoMas[4].trim();
        this.housing = infoMas[5].trim();
        this.flat = infoMas[6].trim();
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", housing='" + housing + '\'' +
                ", flat='" + flat + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Address address1 = new Address();
        address1.AddressSplit("Россия, Москва, Москва, Пушкина, Колотушкина, 1, 13");
        System.out.println(address1.toString());

        Address address2 = new Address();
        address2.AddressToken("Россия, Москва, Москва, Пушкина, Колотушкина, 1, 13");
        System.out.println(address2.toString());

        Address address3 = new Address();
        address3.AddressToken("Россия. Москва. Москва. Пушкина. Колотушкина. 1. 13");
        System.out.println(address3.toString());

        Address address4 = new Address();
        address4.AddressToken("Россия; Москва; Москва; Пушкина; Колотушкина; 1; 13");
        System.out.println(address4.toString());
    }
}
