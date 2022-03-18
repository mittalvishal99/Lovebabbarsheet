import java.util.ArrayList;

class Solution{
    
    ArrayList<String> permutation(String S)
    {
            String ip=S;
            String op="";
            op=op+S.charAt(0);
            ip=ip.substring(1);
             ArrayList<String>al=new ArrayList<String>();
            permu(ip,op,al);
            return al;
    }
        public void permu(String ip,String op,ArrayList<String>al)
        {
            
             if(ip.length()==0)
             {
                 al.add(op);
                 return;
             }
             String op1=op;
             String op2=op;
             op1=op1+" ";
             op1=op1+ip.charAt(0);
             op2=op2+ip.charAt(0);
             ip=ip.substring(1);
             
             permu(ip,op1,al);
             permu(ip,op2,al);
        }
    
}