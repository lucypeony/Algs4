/*
 *  
Convert a non-negative integer to its english words representation. Given input is guaranteed to be less than 231 - 1.
For example:
123 -> "One Hundred Twenty Three"
12345 -> "Twelve Thousand Three Hundred Forty Five"
1234567 -> "One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven"
 */

public class Leet273 {
    
    private String getDigit(int num){
        String str="";
        switch(num){
            case 1:str= "One ";break;
            case 2:str="Two ";break;
            case 3:str="Three ";break;
            case 4:str="Four ";break;
            case 5:str="Five ";break;
            case 6:str="Six ";break;
            case 7:str="Seven ";break;
            case 8:str="Eight ";break;
            case 9:str="Nine ";break;
        }//switch
        return str;
    }//method 
    
    private String basic999(int num){
        if(num>999)
            return "";
        String str1="",str2="",str3="";
      
        int hundred=num / 100;
        if(hundred>0)
            str1=getDigit(hundred)+"Hundred ";
        
        int rest=num % 100;
        if(rest>=10 && rest <=19){
            switch(rest){
                case 10: str2="Ten ";break;
                case 11: str2="Eleven ";break;
                case 12: str2="Twelve ";break;
                case 13: str2="Thirteen ";break;
                case 14: str2="Fourteen ";break;
                case 15: str2="Fifteen ";break;
                case 16: str2="Sixteen ";break;
                case 17: str2="Seventeen ";break;
                case 18: str2="Eighteen ";break;
                case 19: str2="Nineteen ";break;
            }//switch
        }else{
            int shiwei=rest / 10;
            int gewei=rest % 10;
            switch(shiwei){
                case 2:str2="Twenty ";break;
                case 3:str2="Thirty ";break;
                case 4:str2="Forty ";break;
                case 5:str2="Fifty ";break;
                case 6:str2="Sixty ";break;
                case 7:str2="Seventy ";break;
                case 8:str2="Eighty ";break;
                case 9:str2="Ninety ";break;
            }//switch
            
            str3=getDigit(gewei);
        }//if
        
        if(str3!=null){
            return str1+str2+str3;
        }else{
            return str1+str2;
        }
        
    }//method 
    
    
    public String numberToWords(int num) {
        if(num==0){
         return "Zero";   
        }
          String str1="",str2="",str3="";
        
        int billion=num /1000000000;
        if(billion >0)
            str1=basic999(billion)+"Billion ";
        
        num=num % 1000000000;
        int million=num/ 1000000;
        if(million>0)
            str2=basic999(million)+"Million ";
        
        num=num % 1000000;
        int thousand=num /1000;
        if(thousand>0)
            str3=basic999(thousand)+"Thousand ";
        
        int rest =num % 1000; // System.out.println(rest);
        
        String str4=basic999(rest);
        String res= (str1+str2+str3+str4).trim();
        return res;
    }//method 
    
    public static void main(String args[] ){
        //class 
        Leet273 myclass=new Leet273();
        System.out.println(myclass.numberToWords(0));
        
    }//main 
    
}//class 