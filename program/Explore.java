    class Fsx{  
        public Fsx(){  
            System.out.println("Fsx无参构造器初始化了");  
        }  
        public Fsx(int i){  
            System.out.println("Fsx有参构造器初始化了");  
        }  
    }  
      
    public class Explore {  
          
        private Fsx fsk=new Fsx(13);  
        private static Fsx fsx=new Fsx();  
          
        static{  
            System.out.println("静态代码块被执行了");  
        }  
          
        {  
            System.out.println("普通代码块执行了");  
        }  
        public Explore(){  
            System.out.println("构造器执行了");  
        }  
          
        public static void main(String[] args){  
            new Explore();  
            new Explore();  
              
        }   
    }  