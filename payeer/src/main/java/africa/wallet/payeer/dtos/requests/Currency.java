package africa.wallet.payeer.dtos.requests;


public enum Currency {
    JPY(),

    AUD,

    NGN,

    GBP;

    private String code;

    public void String(String code){
        this.code = code;
    }


}
