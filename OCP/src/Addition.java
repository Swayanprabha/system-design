public class Addition implements Operation{
    @Override
    public String execute(String a, String b) {
        UtilMapper utilMapper=new UtilMapper();
        if(utilMapper.checkDataType(a,b))
        {
            int num1=Integer.parseInt(a);
            int num2=Integer.parseInt(b);
            return String.valueOf(num1+num2);
        }
        else
        {
            double num1=Double.parseDouble(a);
            double num2=Double.parseDouble(b);
            return String.valueOf(utilMapper.formatFloat(num1+num2));
        }
    }
}
