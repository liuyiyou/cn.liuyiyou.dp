package cn.liuyiyou.dp.behavioral.visitor.demo1;

/**
 * User: liuyiyou
 * Date: 14-8-11
 * Time: 下午4:30
 */
public class Main {

    public static void main(String[] args) {
        try {

            System.out.println("Making root  entries...");
            Directory rootDir = new Directory("root");
            Directory binDir = new Directory("bin");
            Directory temDir = new Directory("temp");
            Directory usrDir = new Directory("usr");
            rootDir.add(binDir);
            rootDir.add(temDir);
            rootDir.add(usrDir);

            binDir.add(new File("v1",10000));
            binDir.add(new File("Latex",20000));
            rootDir.accept(new ListVisitor());


        }catch (FileTreatmentException e){
            e.printStackTrace();
        }
        System.out.println();
    }
}
