public class largs{
      public static void main(String[] args){
            for(String str: args){
                System.out.println(str);   
            }
	    if(args.length == 0){
              System.out.println("NO INPUT :(");
            }
            else if(args[0].substring(0, 1).equals("p")){
              System.out.println("Zigzagoon");
            }
            else if(args[0].substring(0, 1).equals("d")){
              System.out.println("Fax");
            }
      }
}
