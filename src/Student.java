/**
 * Project name(项目名称)：访问控制修饰符 access-control-modifier
 * Package(包名): PACKAGE_NAME
 * Class(类名): Student
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/6
 * Time(创建时间)： 12:30
 * Version(版本): 1.0
 * Description(描述)：
 * 访问控制符是一组限定类、属性或方法是否可以被程序里的其他部分访问和调用的修饰符。
 * 类的访问控制符只能是空或者 public，方法和属性的访问控制符有 4 个，分别是 public、 private、protected 和 friendly，
 * 其中 friendly 是一种没有定义专门的访问控制符的默认情况。访问控制修饰符的权限如表 1 所示。
 * <p>
 * 各种访问修饰符的可访问性
 * 访问范围	         private	friendly(默认)	protected	public
 * 同一个类	         可访问	     可访问	         可访问	    可访问
 * 同一包中的其他类	不可访问	     可访问	         可访问	    可访问
 * 不同包中的子类	     不可访问	不可访问	         可访问	    可访问
 * 不同包中的非子类	不可访问	    不可访问	         不可访问	可访问
 * <p>
 * 1. private
 * 用 private 修饰的类成员，只能被该类自身的方法访问和修改，而不能被任何其他类（包括该类的子类）访问和引用。
 * 因此，private 修饰符具有最高的保护级别。例如，设 PhoneCard 是电话卡类，电话卡都有密码，因此该类有一个密码域，可以把该类的密码域声明为私有成员。
 * 2. friendly（默认）
 * 如果一个类没有访问控制符，说明它具有默认的访问控制特性。这种默认的访问控制权规定，该类只能被同一个包中的类访问和引用，
 * 而不能被其他包中的类使用，即使其他包中有该类的子类。这种访问特性又称为包访问性（package private）。
 * 同样，类内的成员如果没有访问控制符，也说明它们具有包访问性，或称为友元（friend）。
 * 定义在同一个文件夹中的所有类属于一个包，所以前面的程序要把用户自定义的类放在同一个文件夹中（Java 项目默认的包），以便不加修饰符也能运行。
 * 3. protected
 * 用保护访问控制符 protected 修饰的类成员可以被三种类所访问：该类自身、与它在同一个包中的其他类以及在其他包中的该类的子类。
 * 使用 protected 修饰符的主要作用，是允许其他包中它的子类来访问父类的特定属性和方法，否则可以使用默认访问控制符。
 * 4. public
 * 当一个类被声明为 public 时，它就具有了被其他包中的类访问的可能性，
 * 只要包中的其他类在程序中使用 import 语句引入 public 类，就可以访问和引用这个类。
 */

public class Student
{
    // 姓名，其访问权限为默认(friendly)
    String name;
    // 定义私有变量，身份证号码
    private String idNumber;
    // 定义受保护变量，学号
    protected String no;
    // 定义共有变量，邮箱
    public String email;

    // 定义共有方法，显示学生信息
    public StringBuilder info()
    {
        StringBuilder s = new StringBuilder();
        s.append("姓名：").append(name).append("，身份证号码：").append(idNumber).append("，学号：").append(no).append("，邮箱：").append(email);
        return s;
    }

    public void setIdNumber(String idNumber)
    {
        this.idNumber = idNumber;
    }
}
