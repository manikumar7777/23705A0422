public class Main{
    public static void main(String [] args){
        genCom("abc",0," ");
    }
    public static void genCom(String str,int index,String result){
        if(index==str.length()){
            System.out.print(result.length()!=0 ? result :"emptySet");
                        return;
        }
        genCom(str,index+1,result+str.charAt(index));
        genCom(str,index+1,result);
    }
}