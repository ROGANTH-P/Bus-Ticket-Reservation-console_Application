public class Bus {

    int busNo;
    boolean ac;
    int cap;

    Bus(int BusNo , boolean ac , int cap)
    {
        this.busNo = BusNo;
        this.ac = ac;
        this.cap = cap;
    }

    public int getBusNo(){
        return busNo;
    }
    public  void setcap(int capa)
    {
        cap = capa;
    }
    public boolean getac(){
        return ac;
    }
    public int getCap(){
        return cap;
    }
    void display()
    {
        System.out.println("BusNumber  :" + busNo + " Ac : " + ac + " Capacity : " + cap);
    }
}
