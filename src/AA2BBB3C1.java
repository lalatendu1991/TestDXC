public class AA2BBB3C1 {
    public static void main(String args[]){
        String str="aaabbcccc";
        int count=1;
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<str.length();i++){
            if(i==str.length()-1){
                sb.append(str.charAt(i)).append(count);
                break;
            }
            if(str.charAt(i)==str.charAt(i+1)){
                count++;
            }else{
                sb.append(str.charAt(i)).append(count);
                count=1;
            }
        }
        System.out.println(sb.toString());
    }
}
