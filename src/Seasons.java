public enum Seasons {
    SPRING(8),
    SUMMER(22){
        public void getDescription(){
            System.out.println("Жаркое время года");
        }
    },
    AUTUMN(15),
    WINTER(-7);
    private double averageTemp;
    Seasons (double averageTemp){
        this.averageTemp=averageTemp;
    }

    public double getAverageTemp() {
        return averageTemp;
    }

    public void setAverageTemp(double averageTemp) {
        this.averageTemp = averageTemp;
    }
    public void getDescription(){
        System.out.println("Холодное время года");
    }

    @Override
    public String toString() {
        return "Средняя температура = "+averageTemp+" градусов";
    }
}
