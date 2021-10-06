/**
 * Project name(项目名称)：访问控制修饰符
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/6
 * Time(创建时间)： 12:36
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class test
{
    public static void main(String[] args)
    {
        // 创建Student类对象
        Student stu = new Student();
        // 向Student类对象中的属性赋值
        stu.name = "mao";
        stu.no = "2021";
        stu.setIdNumber("12345678954");
        stu.email = "1296193245@qq.com";
        System.out.println(stu.info());
    }
}
