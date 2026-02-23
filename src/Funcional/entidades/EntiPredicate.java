package Funcional.entidades;

public class EntiPredicate {
    private String name;
    private Double price;

    public EntiPredicate() {}
    public EntiPredicate(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
            // Referencia metodos staticos
    public static Boolean staticPredicate(EntiPredicate e){
        return e.getPrice() >= 100.0;
    }
        //Referencia metodos nao staticos
    public Boolean noStaticPredicate(){
        return price >= 100.0;
    }


    @Override
    public String toString(){
        return "[name=" + name + ", price=" + price + "]";
    }

}
