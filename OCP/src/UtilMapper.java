public class UtilMapper {
    public boolean checkDataType(String a,String b)
    {
        try {
            if(a.contains(".") || b.contains(".")) return false;
            else
                return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public double formatFloat(double d)
    {
        return Math.round(d * 100.0) / 100.0;
    }
}
