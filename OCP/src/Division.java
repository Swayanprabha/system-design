public class Division implements Operation{
  @Override
    public String execute(String a,String b)
    {
        UtilMapper utilmapper=new UtilMapper();
        if(utilmapper.checkDataType(a,b))
        {
            int a1=Integer.parseInt(a);
            int b1=Integer.parseInt(b);
            if(b1==0)
            {
                return "Division by zero is not allowed";
            }
            return String.valueOf(a1/b1);
        }
        else
        {
            double a1=Double.parseDouble(a);
            double b1=Double.parseDouble(b);
            if(b1==0.0)
            {
                return "Division by zero is not allowed";
            }
            return String.valueOf(utilmapper.formatFloat(a1/b1));
        }
    }
}
