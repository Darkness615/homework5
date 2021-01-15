public class lesson5
{


    public static void main(String[] args)
    {
        makeTask();
    }

    static  void makeTask()
    {
        employee1 [] emp=
        {
                new employee1  ("Falkon Denis Markovich", "Agent", "fdm12@gmail.com", "8963443612", 55851.11, 56 ),
                new employee1  ("Akramov Nikita Pavlovich", "Agent", "sdf23@gmail.com", "8968-71-88", 41851.11, 36 ),
                new employee1  ("Durov Evgeniy Evgenyevich", "Agent", "fsadf32@gmail.com", "8912347554", 74751.11, 75 ),
                new employee1  ("Dashkevich Pavel Valerevich", "Agent", "2dfds3@gmail.com", "8(993)448-16-12", 93051.11, 88 ),
                new employee1  ("Bronovich Mark Alexsandrovich", "Agent", "adfz1@gmail.com", "892211433675", 35851.11, 23 )
        };

        for (int i=0;emp.length>i;i++)
        {
            if (emp[i].getAge()>40) emp[i].printInfo();
        }
    }
}

