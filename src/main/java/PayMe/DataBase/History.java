package PayMe.DataBase;

public  class History {
    public double WifiId;
    public String number;
    public double balanceTransferCard;

    public History(double Id, String number, double balanceTransferCard) {
        WifiId = Id;
        this.number = number;
        this.balanceTransferCard = balanceTransferCard;
    }

    public double getWifiId() {
        return WifiId;
    }

    public void setWifiId(double wifiId) {
        WifiId = wifiId;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalanceTransferCard() {
        return balanceTransferCard;
    }

    public void setBalanceTransferCard(double balanceTransferCard) {
        this.balanceTransferCard = balanceTransferCard;
    }

    @Override
    public String toString() {
        return "History{" +
                "WifiId=" + WifiId+"\n" +
                " number=" + number + "\n" +
                " balanceTransferCard=" + balanceTransferCard +
                '}';
    }
}
