public class Main {
    public static void main(String[] args) {

        Java java1= new Java("Kutman",18,'M',"kutay04@gmail.com");
        Java java2= new Java("Aidana",18,'F',"kut04@gmail.com");
        Java java3= new Java("Madina",16,'F',"mADINA04@gmail.com");
        Java java4= new Java("Davran",17,'M',"nIAZA04@gmail.com");
        Java java5= new Java("Kairat",18,'M',"kIARA04@gmail.com");
         Java [] javas={java1,java2,java3,java4,java5};
         Java [] javas2={java1,java2};
        Go go1 = new Go("Abu",20,'M',"abuali@gmail.com");
        Go  go2 = new Go("Usman",22,'M',"Usman@gmail.com");
        Go[] goes1= {go1,go2};
        Go[] goes2={go2};

        Android  androids1 = new Android("Aman",22,'M',"J.temir@gmail.com");
        Android  androids2= new Android("Asan",24,'M',"Asan@gmail.com");
        Android  androids3 = new Android("Uson",26,'M',"uSON.temir@gmail.com");


        Android [] android1= {androids1,androids2,androids3};
        Android [] android2= {androids1};

        Company company1 = new Company("IT coding",javas,android1,goes1,"Temirlan Zhuzukulov");
        System.out.println(company1);
        Company company2= new Company("IT leaders",javas2,android2,goes2,"Kairat Nuridinov");
        System.out.println(company2);




    }
}