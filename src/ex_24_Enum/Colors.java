package ex_24_Enum;

public enum Colors {


    RED("#FF0000"),//Hash code for Red
    GREEN("#61FF33");//Hash code for Green


    private String hexCode;
    Colors(String hexCode)// PC
    {
        this.hexCode=hexCode;//
    }

    String getHexCode()
    {
        return this.hexCode;
    }

}
