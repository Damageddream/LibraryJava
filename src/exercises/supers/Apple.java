package exercises.supers;

public class Apple extends Fruit {

    private String variety;
    Apple(int weight, String variety){
        super(weight,"jabłkowaty");
        this.variety = variety;

    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }


    @Override
    public String getInfo(){
        return super.getInfo() + " odmiana: " + getVariety();


    }

}
