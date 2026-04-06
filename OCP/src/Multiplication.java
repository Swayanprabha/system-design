public class Multiplication implements Operation{
    @Override
    public String execute(String a,String b)
    {
        UtilMapper utilmapper=new UtilMapper();
        if(utilmapper.checkDataType(a,b))
        {
            int a1=Integer.parseInt(a);
            int b1=Integer.parseInt(b);
            return String.valueOf(a1*b1);
        }
        else
        {
            double a1=Double.parseDouble(a);
            double b1=Double.parseDouble(b);
            return String.valueOf(utilmapper.formatFloat(a1*b1));
        }
    }
}
