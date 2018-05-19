public class Water {
    public void showTem(){
        System.out.println("我的温度是: 0度");
    }
}

public class IceWater extends Water {
    public void showTem(){
        System.out.println("我的温度是: 0度");
    }
}

public class WarmWater extends Water {
    public void showTem(){
        System.out.println("我的温度是: 40度");
    }
}

public class HotWater extends Water {
    public void showTem(){
        System.out.println("我的温度是: 100度");
    }
}

public class TestWater{
    public static void main(String[] args) {
        Water w = new WarmWater();
        w.showTem();

        w = new IceWater();
        w.showTem();

        w = new HotWater();
        w.showTem();

    }
}