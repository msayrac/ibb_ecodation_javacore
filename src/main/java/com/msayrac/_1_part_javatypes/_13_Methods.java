package com.msayrac._1_part_javatypes;

public class _13_Methods {

    // kendimizi tekrarlamak istemiyorsak Metodlar kullanırız Python da Function olarak adlandırılır

    public void metotReturnsuzParametresiz() {

        System.out.println("metotReturnsuzParametresiz");
    }

    public static void metotReturnsuzParametreli(String name) {
        System.out.println("metotReturnsuzParametreli : " + name);
    }

    public static void metotReturnsuzParametreli(String name, int age) {
        System.out.println("metotReturnsuzParametreli : " + name + age);
    }

    // return lu parametresiz
    public String metodReturnluParametresiz() {

        return "metod Returnlu Parametresiz";

    }

    // return lu parametresiz
    public Integer metodReturnluParametreli(int number) {

        return number;

    }


    public static void main(String[] args) {

// new --> eger static yapı kullanmıyorsak class ismini yazarak ulasırız. static yazılmazsa mutlaka new lemek zorundayız
//        new --> dogmak anlamına geliyor
//        özel yapılarda herkesin erismesini istemiyorsak static kullanmayız

        _13_Methods data1 = new _13_Methods();

        data1.metotReturnsuzParametresiz();


        //static´--> duvar demek (instance (new) olmadan yazdıgımız yapılardır.
//        özel yapılarda güvenlik ihlalı olabilecek yapılarda Static kullanmıyoruz. HErkes erisim saglayabilir
        _13_Methods.metotReturnsuzParametreli(" Ali ");

        //Overloading aynı metodun calısmalar icerisinde parametres sayısı veya turu farklı olduug iceriisnde overloading kullanıyoruz

        _13_Methods.metotReturnsuzParametreli(" Ali ", 18);

        _13_Methods d1 = new _13_Methods();

        String result1 = d1.metodReturnluParametresiz();

        Integer result2 = d1.metodReturnluParametreli(18);

        System.out.println(result1);
        System.out.println(result2);




    }
}
